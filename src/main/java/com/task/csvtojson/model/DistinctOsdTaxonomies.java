package com.task.csvtojson.model;

import org.springframework.stereotype.Component;

@Component
public class DistinctOsdTaxonomies {
	
	public String getAttribute_group() {
		return attribute_group;
	}
	public void setAttribute_group(String attribute_group) {
		this.attribute_group = attribute_group;
	}
	public String getItem_group() {
		return item_group;
	}
	public void setItem_group(String item_group) {
		this.item_group = item_group;
	}
	public String getBusiness_center() {
		return business_center;
	}
	public void setBusiness_center(String business_center) {
		this.business_center = business_center;
	}
	String attribute_group;
	String item_group;
	String business_center;

}
