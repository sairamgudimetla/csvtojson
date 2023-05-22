
package com.task.csvtojson.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item_group",
    "business_center",
    "hierarchy_id",
    "attribute_group",
    "attributes"
})
@Generated("osdTaxonomy")
@Builder
public class OsdTaxonomy {

    @JsonProperty("item_group")
    private String itemGroup;
    @JsonProperty("business_center")
    private String businessCenter;
    @JsonProperty("hierarchy_id")
    private Integer hierarchyId;
    @JsonProperty("attribute_group")
    private String attributeGroup;
    @JsonProperty("attributes")
    private List<Object> attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
