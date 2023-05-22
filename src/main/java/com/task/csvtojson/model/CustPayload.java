
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
    "account_id",
    "offer_archetype",
    "offer_status",
    "offer_attributes",
    "campaign_id",
    "site_id",
    "offer_id",
    "offer_description",
    "seller_id",
    "offer_number",
    "customer_facing_text",
    "campaign_name",
    "offer_sub_archetype",
    "sample_group"
})
@Generated("custPayload")
@Builder
public class CustPayload {

    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("offer_archetype")
    private String offerArchetype;
    @JsonProperty("offer_status")
    private String offerStatus;
    @JsonProperty("offer_attributes")
    private OfferAttributes offerAttributes;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("offer_id")
    private String offerId;
    @JsonProperty("offer_description")
    private String offerDescription;
    @JsonProperty("seller_id")
    private String sellerId;
    @JsonProperty("offer_number")
    private String offerNumber;
    @JsonProperty("customer_facing_text")
    private String customerFacingText;
    @JsonProperty("campaign_name")
    private String campaignName;
    @JsonProperty("offer_sub_archetype")
    private String offerSubArchetype;
    @JsonProperty("sample_group")
    private String sampleGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
