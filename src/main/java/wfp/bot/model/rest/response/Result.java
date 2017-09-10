/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wfp.bot.model.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"uuid",
"country",
"contact_time",
"display_name",
"position_title",
"picture_url",
"detail",
"extension",
"foodsat",
"email",
"indexno",
"title",
"edit_url",
"org_unit",
"loginname",
"refresh_url",
"job_description",
"work_location",
"also_known_as",
"mobile",
"phone",
"workstation",
"duty_station"
})
public class Result {

@JsonProperty("id")
private Integer id;
@JsonProperty("uuid")
private String uuid;
@JsonProperty("country")
private String country;
@JsonProperty("contact_time")
private String contactTime;
@JsonProperty("display_name")
private String displayName;
@JsonProperty("position_title")
private String positionTitle;
@JsonProperty("picture_url")
private String pictureUrl;
@JsonProperty("detail")
private String detail;
@JsonProperty("extension")
private String extension;
@JsonProperty("foodsat")
private String foodsat;
@JsonProperty("email")
private String email;
@JsonProperty("indexno")
private String indexno;
@JsonProperty("title")
private String title;
@JsonProperty("edit_url")
private Object editUrl;
@JsonProperty("org_unit")
private Object orgUnit;
@JsonProperty("loginname")
private String loginname;
@JsonProperty("refresh_url")
private Object refreshUrl;
@JsonProperty("job_description")
private String jobDescription;
@JsonProperty("work_location")
private Object workLocation;
@JsonProperty("also_known_as")
private Object alsoKnownAs;
@JsonProperty("mobile")
private Object mobile;
@JsonProperty("phone")
private String phone;
@JsonProperty("workstation")
private String workstation;
@JsonProperty("duty_station")
private String dutyStation;

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("uuid")
public String getUuid() {
return uuid;
}

@JsonProperty("uuid")
public void setUuid(String uuid) {
this.uuid = uuid;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
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

@JsonProperty("extension")
public String getExtension() {
return extension;
}

@JsonProperty("extension")
public void setExtension(String extension) {
this.extension = extension;
}

@JsonProperty("foodsat")
public String getFoodsat() {
return foodsat;
}

@JsonProperty("foodsat")
public void setFoodsat(String foodsat) {
this.foodsat = foodsat;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("indexno")
public String getIndexno() {
return indexno;
}

@JsonProperty("indexno")
public void setIndexno(String indexno) {
this.indexno = indexno;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("edit_url")
public Object getEditUrl() {
return editUrl;
}

@JsonProperty("edit_url")
public void setEditUrl(Object editUrl) {
this.editUrl = editUrl;
}

@JsonProperty("org_unit")
public Object getOrgUnit() {
return orgUnit;
}

@JsonProperty("org_unit")
public void setOrgUnit(Object orgUnit) {
this.orgUnit = orgUnit;
}

@JsonProperty("loginname")
public String getLoginname() {
return loginname;
}

@JsonProperty("loginname")
public void setLoginname(String loginname) {
this.loginname = loginname;
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

@JsonProperty("work_location")
public Object getWorkLocation() {
return workLocation;
}

@JsonProperty("work_location")
public void setWorkLocation(Object workLocation) {
this.workLocation = workLocation;
}

@JsonProperty("also_known_as")
public Object getAlsoKnownAs() {
return alsoKnownAs;
}

@JsonProperty("also_known_as")
public void setAlsoKnownAs(Object alsoKnownAs) {
this.alsoKnownAs = alsoKnownAs;
}

@JsonProperty("mobile")
public Object getMobile() {
return mobile;
}

@JsonProperty("mobile")
public void setMobile(Object mobile) {
this.mobile = mobile;
}

@JsonProperty("phone")
public String getPhone() {
return phone;
}

@JsonProperty("phone")
public void setPhone(String phone) {
this.phone = phone;
}

@JsonProperty("workstation")
public String getWorkstation() {
return workstation;
}

@JsonProperty("workstation")
public void setWorkstation(String workstation) {
this.workstation = workstation;
}

@JsonProperty("duty_station")
public String getDutyStation() {
return dutyStation;
}

@JsonProperty("duty_station")
public void setDutyStation(String dutyStation) {
this.dutyStation = dutyStation;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

}

