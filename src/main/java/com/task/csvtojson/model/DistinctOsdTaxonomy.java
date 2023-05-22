
package com.task.csvtojson.model;

import java.util.LinkedHashMap;
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
    "ag_shop_url",
    "item_group",
    "business_center",
    "attribute_group",
    "rank"
})
@Generated("distinctOsdTaxonomy")
@Builder
public class DistinctOsdTaxonomy {

    @JsonProperty("ag_shop_url")
    private String agShopUrl;
    @JsonProperty("item_group")
    private String itemGroup;
    @JsonProperty("business_center")
    private String businessCenter;
    @JsonProperty("attribute_group")
    private String attributeGroup;
    @JsonProperty("rank")
    private Integer rank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
