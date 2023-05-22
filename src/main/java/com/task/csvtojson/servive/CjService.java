package com.task.csvtojson.servive;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import com.task.csvtojson.model.CustPayload;
import com.task.csvtojson.model.DistinctOsdTaxonomy;
import com.task.csvtojson.model.Item;
import com.task.csvtojson.util.ResponseTransformer;

@Service
public class CjService {
	
	ResponseTransformer res;
	public CjService(ResponseTransformer resp) {

		this.res = resp;

	}
	
	public Set<DistinctOsdTaxonomy> convert(BufferedReader file) {

		String row = "";
		Set<DistinctOsdTaxonomy> distSet = new LinkedHashSet<DistinctOsdTaxonomy>();
		try {
			while ((row = file.readLine()) != null)
			{
				String[] discValues = row.split(",");
			
				/*
				 * DistinctOsdTaxonomy discTaxonomies = new DistinctOsdTaxonomy();
				 * 
				 * discTaxonomies.setBusinessCenter(discValues[0]);;
				 * discTaxonomies.setItemGroup(discValues[1]);;
				 * discTaxonomies.setAttributeGroup(discValues[2]);
				 */
				//distSet.add();
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return distSet;
	}

	public CustPayload getCollection(String customerId, BufferedReader file) {

		String row = "";
		String[] data = null;
		CustPayload custPayload = null;
		List<Item> item = new ArrayList<Item>();
		String[] currentData = null;
		Set<DistinctOsdTaxonomy> distSet = new LinkedHashSet<DistinctOsdTaxonomy>();
		try {
			while ((row = file.readLine()) != null) {

				data = row.split(",");
//				Set<String> cust_id = new LinkedHashSet<String>();
//				cust_id.add(data[0]);
				
				if(data[0].equals(customerId)) {
					//	String[] customerData = new String(data);
					currentData = data;
					item.add(res.mapItems(data));
					distSet.add(res.mapDistTaxonomy(data));
					custPayload = res.mapData(currentData, item, distSet);
				}
				
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return custPayload;
	}

}
