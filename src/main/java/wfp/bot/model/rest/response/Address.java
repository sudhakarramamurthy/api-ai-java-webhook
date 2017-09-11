
package wfp.bot.model.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pk",
    "street",
    "city",
    "state",
    "country",
    "type",
    "zip"
})
public class Address {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("street")
    private Object street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("type")
    private String type;
    @JsonProperty("zip")
    private Object zip;

    @JsonProperty("pk")
    public Integer getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @JsonProperty("street")
    public Object getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(Object street) {
        this.street = street;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("zip")
    public Object getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(Object zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
