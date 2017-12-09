package webhook.jetty.model.DialogflowV2.Fulfillment;

import java.util.Map;

public class QueryResult {
	String queryText;
	String action;
	Map<String, String> parameters;
	boolean allRequiredParamsPresent;
	// @TODO Make this work
	//Map<String, Object> fulfillmentMessages;
	Intent intent;
	double intentDetectionConfidence;
	Map<String, Object> diagnosticInfo;
	String languageCode;

	public QueryResult() {
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public boolean isAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	//public Map<String, Object> getFulfillmentMessages() {
	//	return fulfillmentMessages;
	//}

	//public void setFulfillmentMessages(Map<String, Object> fulfillmentMessages) {
	//	this.fulfillmentMessages = fulfillmentMessages;
	//}

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public double getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	public void setIntentDetectionConfidence(double intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	public Map<String, Object> getDiagnosticInfo() {
		return diagnosticInfo;
	}

	public void setDiagnosticInfo(Map<String, Object> diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
