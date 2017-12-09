package webhook.jetty.model.DialogflowV2.Fulfillment;

import java.util.Map;

public class OriginalDetectIntentRequest {
	Map<String, Payload> payload = null;

	public OriginalDetectIntentRequest() {

	}

	public Map<String, Payload> getPayload() {
		return payload;
	}

	public void setPayload(Map<String, Payload> payload) {
		this.payload = payload;
	}
}
