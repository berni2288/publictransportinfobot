package webhook.jetty.model.DialogflowV2.Fulfillment;

public class Request {
	private String responseId;
	private String session;
	private QueryResult queryResult;
	private OriginalDetectIntentRequest originalDetectIntentRequest;

	public Request() {
	}

	public String getResponseId() {
		return responseId;
	}

	public String getSession() {
		return session;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}
}
