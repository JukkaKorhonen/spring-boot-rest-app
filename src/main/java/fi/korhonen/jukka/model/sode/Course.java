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
@JsonPropertyOrder({ "title_fi", "category", "properties", "desc_fi", "desc_en", "desc_se" })
public class Course {

	@JsonProperty("title_fi")
	private String titleFi;
	@JsonProperty("category")
	private String category;
	@JsonProperty("properties")
	private String properties;
	@JsonProperty("desc_fi")
	private String descFi;
	@JsonProperty("desc_en")
	private String descEn;
	@JsonProperty("desc_se")
	private String descSe;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("title_fi")
	public String getTitleFi() {
		return titleFi;
	}

	@JsonProperty("title_fi")
	public void setTitleFi(String titleFi) {
		this.titleFi = titleFi;
	}

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("properties")
	public String getProperties() {
		return properties;
	}

	@JsonProperty("properties")
	public void setProperties(String properties) {
		this.properties = properties;
	}

	@JsonProperty("desc_fi")
	public String getDescFi() {
		return descFi;
	}

	@JsonProperty("desc_fi")
	public void setDescFi(String descFi) {
		this.descFi = descFi;
	}

	@JsonProperty("desc_en")
	public String getDescEn() {
		return descEn;
	}

	@JsonProperty("desc_en")
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}

	@JsonProperty("desc_se")
	public String getDescSe() {
		return descSe;
	}

	@JsonProperty("desc_se")
	public void setDescSe(String descSe) {
		this.descSe = descSe;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Course [titleFi=" + titleFi + ", category=" + category + ", properties=" + properties + ", descFi="
				+ descFi + ", descEn=" + descEn + ", descSe=" + descSe + ", additionalProperties="
				+ additionalProperties + "]";
	}

	
}