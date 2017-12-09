package webhook.jetty.model.DialogflowV2.Fulfillment;

public class Response {
	String fulfillmentText;

	public Response(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
}
