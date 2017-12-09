package webhook.jetty.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.TransitMode;
import com.google.maps.model.TravelMode;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import webhook.jetty.Configuration;
import webhook.jetty.model.DialogflowV2.Fulfillment.Response;

@Component
@ConfigurationProperties(prefix="webhook")
public class WebhookService {

	@Autowired
	private Configuration configuration;

	public static DateTimeFormatter departureDateTimeFormat = DateTimeFormat.forPattern("HH:mm:ss");

	public Response nextDeparture(String transitMode, String origin, String destination) throws RuntimeException {
		GeoApiContext context = new GeoApiContext.Builder()
				.apiKey(configuration.getGoogleMapsApiKey())
				.build();

		DirectionsResult directionsResult = null;

		try {
			directionsResult = DirectionsApi.getDirections(context, origin, destination)
	        .transitMode(TransitMode.valueOf(transitMode.toUpperCase()))
			.mode(TravelMode.TRANSIT)
			.alternatives(false)
			.await();
		} catch (Exception e) {
			throw new RuntimeException("Failed to fetch info from the Google maps directions API", e);
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(directionsResult.routes[0]));

		// apiResponse["json"]["routes"][0]["legs"][0]["departure_time"]["text"]
		DateTime depatureTime = directionsResult.routes[0].legs[0].departureTime;
		Response response = new Response(
				"Der nächste Bus kommt " + departureDateTimeFormat.print(depatureTime));

		return response;
	}
}
