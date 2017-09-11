
package wfp.bot.model.rest.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "email",
    "country",
    "timezone",
    "contact_time",
    "display_name",
    "position_title",
    "department",
    "duty_station",
    "picture_url",
    "detail",
    "foodsat",
    "extension",
    "edit_url",
    "title",
    "phone",
    "mobile",
    "workstation",
    "indexno",
    "emails",
    "phones",
    "addresses",
    "vcard",
    "loginname",
    "last_name",
    "first_name",
    "org_unit",
    "socialnetworks",
    "work_location",
    "job_title",
    "refresh_url",
    "job_description",
    "also_known_as",
    "facilities"
})
public class ContactDetail {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("country")
    private String country;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("contact_time")
    private String contactTime;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("position_title")
    private String positionTitle;
    @JsonProperty("department")
    private String department;
    @JsonProperty("duty_station")
    private String dutyStation;
    @JsonProperty("picture_url")
    private String pictureUrl;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("foodsat")
    private String foodsat;
    @JsonProperty("extension")
    private String extension;
    @JsonProperty("edit_url")
    private Object editUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("workstation")
    private String workstation;
    @JsonProperty("indexno")
    private String indexno;
    @JsonProperty("emails")
    private List<Email> emails = null;
    @JsonProperty("phones")
    private List<Phone> phones = null;
    @JsonProperty("addresses")
    private List<Address> addresses = null;
    @JsonProperty("vcard")
    private String vcard;
    @JsonProperty("loginname")
    private String loginname;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("org_unit")
    private Object orgUnit;
    @JsonProperty("socialnetworks")
    private List<Object> socialnetworks = null;
    @JsonProperty("work_location")
    private Object workLocation;
    @JsonProperty("job_title")
    private String jobTitle;
    @JsonProperty("refresh_url")
    private Object refreshUrl;
    @JsonProperty("job_description")
    private String jobDescription;
    @JsonProperty("also_known_as")
    private Object alsoKnownAs;
    @JsonProperty("facilities")
    private List<Object> facilities = null;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("contact_time")
    public String getContactTime() {
        return contactTime;
    }

    @JsonProperty("contact_time")
    public void setContactTime(String contactTime) {
        this.contactTime = contactTime;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("position_title")
    public String getPositionTitle() {
        return positionTitle;
    }

    @JsonProperty("position_title")
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("duty_station")
    public String getDutyStation() {
        return dutyStation;
    }

    @JsonProperty("duty_station")
    public void setDutyStation(String dutyStation) {
        this.dutyStation = dutyStation;
    }

    @JsonProperty("picture_url")
    public String getPictureUrl() {
        return pictureUrl;
    }

    @JsonProperty("picture_url")
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @JsonProperty("foodsat")
    public String getFoodsat() {
        return foodsat;
    }

    @JsonProperty("foodsat")
    public void setFoodsat(String foodsat) {
        this.foodsat = foodsat;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("edit_url")
    public Object getEditUrl() {
        return editUrl;
    }

    @JsonProperty("edit_url")
    public void setEditUrl(Object editUrl) {
        this.editUrl = editUrl;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("workstation")
    public String getWorkstation() {
        return workstation;
    }

    @JsonProperty("workstation")
    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    @JsonProperty("indexno")
    public String getIndexno() {
        return indexno;
    }

    @JsonProperty("indexno")
    public void setIndexno(String indexno) {
        this.indexno = indexno;
    }

    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("vcard")
    public String getVcard() {
        return vcard;
    }

    @JsonProperty("vcard")
    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    @JsonProperty("loginname")
    public String getLoginname() {
        return loginname;
    }

    @JsonProperty("loginname")
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("org_unit")
    public Object getOrgUnit() {
        return orgUnit;
    }

    @JsonProperty("org_unit")
    public void setOrgUnit(Object orgUnit) {
        this.orgUnit = orgUnit;
    }

    @JsonProperty("socialnetworks")
    public List<Object> getSocialnetworks() {
        return socialnetworks;
    }

    @JsonProperty("socialnetworks")
    public void setSocialnetworks(List<Object> socialnetworks) {
        this.socialnetworks = socialnetworks;
    }

    @JsonProperty("work_location")
    public Object getWorkLocation() {
        return workLocation;
    }

    @JsonProperty("work_location")
    public void setWorkLocation(Object workLocation) {
        this.workLocation = workLocation;
    }

    @JsonProperty("job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("job_title")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("refresh_url")
    public Object getRefreshUrl() {
        return refreshUrl;
    }

    @JsonProperty("refresh_url")
    public void setRefreshUrl(Object refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    @JsonProperty("job_description")
    public String getJobDescription() {
        return jobDescription;
    }

    @JsonProperty("job_description")
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @JsonProperty("also_known_as")
    public Object getAlsoKnownAs() {
        return alsoKnownAs;
    }

    @JsonProperty("also_known_as")
    public void setAlsoKnownAs(Object alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    @JsonProperty("facilities")
    public List<Object> getFacilities() {
        return facilities;
    }

    @JsonProperty("facilities")
    public void setFacilities(List<Object> facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
