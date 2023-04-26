package com.task.csvtojson.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.csvtojson.model.DistinctOsdTaxonomies;
import com.task.csvtojson.servive.CjService;

@RestController
public class CjController {

	@Autowired
	CjService cjService;
	
	@GetMapping("/convert")
	public List<DistinctOsdTaxonomies> convert() throws FileNotFoundException {
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("taxonomy_all.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(fileReader);
		return cjService.convert(fileReader);
	
	}
}
