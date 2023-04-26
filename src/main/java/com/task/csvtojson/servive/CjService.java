package com.task.csvtojson.servive;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.task.csvtojson.model.DistinctOsdTaxonomies;

@Service
public class CjService {
	
	public DistinctOsdTaxonomies discTaxonomies;
	
	public CjService(DistinctOsdTaxonomies discTaxonomies) {
		this.discTaxonomies = discTaxonomies;
	}

	public List<DistinctOsdTaxonomies> convert(BufferedReader file) {

		String row = "";
		List<DistinctOsdTaxonomies> lst = new ArrayList<DistinctOsdTaxonomies>();
		try {
			while ((row = file.readLine()) != null)
			{
				String[] discValues = row.split(",");
				discTaxonomies.setBusiness_center(discValues[0]);
				discTaxonomies.setItem_group(discValues[1]);
				discTaxonomies.setAttribute_group(discValues[2]);
				lst.add(discTaxonomies);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lst.stream().distinct().collect(Collectors.toList());
	}

	
}
