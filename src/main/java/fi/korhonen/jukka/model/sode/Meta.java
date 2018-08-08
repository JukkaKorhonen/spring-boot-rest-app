package fi.korhonen.jukka.model.sode;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "generated_timestamp", "requested_timestamp", "ref_url", "ref_title" })
public class Meta {

	@JsonProperty("generated_timestamp")
	private Integer generatedTimestamp;
	@JsonProperty("requested_timestamp")
	private Integer requestedTimestamp;
	@JsonProperty("ref_url")
	private String refUrl;
	@JsonProperty("ref_title")
	private String refTitle;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("generated_timestamp")
	public Integer getGeneratedTimestamp() {
		return generatedTimestamp;
	}

	@JsonProperty("generated_timestamp")
	public void setGeneratedTimestamp(Integer generatedTimestamp) {
		this.generatedTimestamp = generatedTimestamp;
	}

	@JsonProperty("requested_timestamp")
	public Integer getRequestedTimestamp() {
		return requestedTimestamp;
	}

	@JsonProperty("requested_timestamp")
	public void setRequestedTimestamp(Integer requestedTimestamp) {
		this.requestedTimestamp = requestedTimestamp;
	}

	@JsonProperty("ref_url")
	public String getRefUrl() {
		return refUrl;
	}

	@JsonProperty("ref_url")
	public void setRefUrl(String refUrl) {
		this.refUrl = refUrl;
	}

	@JsonProperty("ref_title")
	public String getRefTitle() {
		return refTitle;
	}

	@JsonProperty("ref_title")
	public void setRefTitle(String refTitle) {
		this.refTitle = refTitle;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}