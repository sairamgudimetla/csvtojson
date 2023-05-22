package com.task.csvtojson.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Component;

import com.task.csvtojson.model.CustPayload;
import com.task.csvtojson.model.DistinctOsdTaxonomy;
import com.task.csvtojson.model.Item;
import com.task.csvtojson.model.OfferAttributes;
import com.task.csvtojson.model.OsdTaxonomy;

@Component
public class ResponseTransformer {
	
	List<Double> maxVal = new ArrayList<Double>();
	
	public CustPayload mapData(String[] data, List<Item> item, Set<DistinctOsdTaxonomy> distSet) {
		
		Date da = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
	    String date= formatter.format(da); 
		
		return CustPayload.builder()
		.accountId(data[0])
		.offerArchetype("C10")
		.offerStatus("ACTIVE")
		.offerAttributes(maptOfferAttributes(data, item, distSet))
		.campaignId(date+"-c10.1-209")
		.siteId("001")
		.offerId(UUID.randomUUID().toString().replace("-", ""))
		.offerDescription("Product Description")
		.sellerId("USBL")
		.offerNumber("DTC-"+data[40])
		.customerFacingText(data[8])
		.campaignName(data[39])
		.offerSubArchetype("C10.1")
		.sampleGroup(data[2])
		.build();
			
		
	}

	private OfferAttributes maptOfferAttributes(String[] data, List<Item> item, Set<DistinctOsdTaxonomy> distSet) {
		return OfferAttributes.builder()
				.shopUrl(data[26])
				.items(item)
				.distinctOsdTaxonomies(distSet)
				.rewardType("PERCENT")
				.maxRewardValue(Collections.max(maxVal))
				.build();
	}

	public DistinctOsdTaxonomy mapDistTaxonomy(String[] data) {
		
		return DistinctOsdTaxonomy.builder()
			.agShopUrl(data[27])
			.itemGroup(data[10])
			.businessCenter(data[9])
			.attributeGroup(data[33])
			.rank(Integer.parseInt(data[13]))
			.build();
	}

	public Item mapItems(String[] data) {
		
		maxVal.add(Double.parseDouble(data[6]));
		
		return Item.builder()
			.description(data[15])
			.sizeValue(data[18])
			.shopUrl(data[28])
			.supcPerAgRank(Integer.parseInt(data[12]))
			.rewardType(data[31].toUpperCase())
			.productId(Integer.parseInt(data[45]))
			.brandName(data[19])
			.currentPrice(Double.parseDouble(data[16]))
			.osdTaxonomy(mapTaxonomies(data))
			.sizeUnitOfMeasure(data[20])
			.imageUrls(mapImageUrl(data))
			.pack(Integer.parseInt(data[17]))
			.rewardValue(Double.parseDouble(data[6]))
			.rank(Integer.parseInt(data[24]))
			.build();
	}

	private List<String> mapImageUrl(String[] data) {
		List<String> imgUrl = new ArrayList<String>();
		
		imgUrl.add(data[29]);
		
		return imgUrl;
	}

	private OsdTaxonomy mapTaxonomies(String[] data) {
		
		return OsdTaxonomy.builder()
				.itemGroup(data[10])
				.businessCenter(data[9])
				.hierarchyId(Integer.parseInt(data[21]))
				.attributeGroup(data[33])
				.attributes(Collections.emptyList())
				.build();
		
	}

}
