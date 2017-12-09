package webhook.jetty.web;

import com.amazon.speech.speechlet.IntentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import webhook.jetty.model.DialogflowV2.Fulfillment.Request;
import webhook.jetty.model.DialogflowV2.Fulfillment.Response;
import webhook.jetty.service.WebhookService;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class WebhookController {

	@Autowired
	private WebhookService webhookService;

	@PostMapping("/alexa")
	@ResponseBody
	public Response alexaSkillEndpoint(@RequestBody IntentRequest intentRequest) throws RuntimeException {
		return this.webhookService.nextDeparture("", "", "");
	}

	@PostMapping("/dialogflow")
	@ResponseBody
	public Response dialogFlowFullfilment(@RequestBody Request request) throws RuntimeException {
		Map<String, String> parameters = request.getQueryResult().getParameters();
		return this.webhookService.nextDeparture(
				parameters.get("TransportType"), parameters.get("start"), parameters.get("ziel"));
	}
}
