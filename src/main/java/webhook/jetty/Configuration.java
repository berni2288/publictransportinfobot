package webhook.jetty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties
@Validated
public class Configuration {

	@NotEmpty
	private String googleMapsApiKey = null;

	public String getGoogleMapsApiKey() {
		return googleMapsApiKey;
	}

	public void setGoogleMapsApiKey(String value) {
		this.googleMapsApiKey = value;
	}
}
