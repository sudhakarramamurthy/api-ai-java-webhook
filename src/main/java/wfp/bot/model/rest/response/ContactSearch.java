/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wfp.bot.model.rest.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"count",
"next",
"current_page",
"total_pages",
"previous",
"results"
})
public class ContactSearch {

@JsonProperty("count")
private Integer count;
@JsonProperty("next")
private Object next;
@JsonProperty("current_page")
private Integer currentPage;
@JsonProperty("total_pages")
private Integer totalPages;
@JsonProperty("previous")
private Object previous;
@JsonProperty("results")
private List<Result> results = null;

@JsonProperty("count")
public Integer getCount() {
return count;
}

@JsonProperty("count")
public void setCount(Integer count) {
this.count = count;
}

@JsonProperty("next")
public Object getNext() {
return next;
}

@JsonProperty("next")
public void setNext(Object next) {
this.next = next;
}

@JsonProperty("current_page")
public Integer getCurrentPage() {
return currentPage;
}

@JsonProperty("current_page")
public void setCurrentPage(Integer currentPage) {
this.currentPage = currentPage;
}

@JsonProperty("total_pages")
public Integer getTotalPages() {
return totalPages;
}

@JsonProperty("total_pages")
public void setTotalPages(Integer totalPages) {
this.totalPages = totalPages;
}

@JsonProperty("previous")
public Object getPrevious() {
return previous;
}

@JsonProperty("previous")
public void setPrevious(Object previous) {
this.previous = previous;
}

@JsonProperty("results")
public List<Result> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<Result> results) {
this.results = results;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

}