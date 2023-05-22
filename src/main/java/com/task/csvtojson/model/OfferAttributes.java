
package com.task.csvtojson.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    "shop_url",
    "items",
    "distinct_osd_taxonomies",
    "reward_type",
    "max_reward_value"
})
@Generated("offerAttributes")
@Builder
public class OfferAttributes {

    @JsonProperty("shop_url")
    private String shopUrl;
    @JsonProperty("items")
    private List<Item> items;
    @JsonProperty("distinct_osd_taxonomies")
    private Set<DistinctOsdTaxonomy> distinctOsdTaxonomies;
    @JsonProperty("reward_type")
    private String rewardType;
    @JsonProperty("max_reward_value")
    private Double maxRewardValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
