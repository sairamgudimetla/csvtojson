package com.task.csvtojson.model;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DistinctOsdTaxonomies {
	
	String attribute_group;
	String item_group;
	String business_center;
//	String ag_shop_url;
//	String rank;
	
	public DistinctOsdTaxonomies(String attribute_group, String business_center, String item_group) {
		this.attribute_group = attribute_group;
		this.business_center = business_center;
		this.item_group = item_group;
//		this.ag_shop_url = ag_shop_url;
//		this.rank = rank;
	}

}
