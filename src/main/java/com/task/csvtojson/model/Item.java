
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
    "description",
    "size_value",
    "shop_url",
    "supc_per_ag_rank",
    "reward_type",
    "product_id",
    "brand_name",
    "current_price",
    "osd_taxonomy",
    "size_unit_of_measure",
    "image_urls",
    "pack",
    "reward_value",
    "rank"
})
@Generated("Items")
@Builder
public class Item {

    @JsonProperty("description")
    private String description;
    @JsonProperty("size_value")
    private String sizeValue;
    @JsonProperty("shop_url")
    private String shopUrl;
    @JsonProperty("supc_per_ag_rank")
    private Integer supcPerAgRank;
    @JsonProperty("reward_type")
    private String rewardType;
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("brand_name")
    private String brandName;
    @JsonProperty("current_price")
    private Double currentPrice;
    @JsonProperty("osd_taxonomy")
    private OsdTaxonomy osdTaxonomy;
    @JsonProperty("size_unit_of_measure")
    private String sizeUnitOfMeasure;
    @JsonProperty("image_urls")
    private List<String> imageUrls;
    @JsonProperty("pack")
    private Integer pack;
    @JsonProperty("reward_value")
    private Double rewardValue;
    @JsonProperty("rank")
    private Integer rank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
