package com.task.csvtojson.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.csvtojson.model.CustPayload;
import com.task.csvtojson.model.DistinctOsdTaxonomy;
import com.task.csvtojson.servive.CjService;

@RestController
public class CjController {

	@Autowired
	CjService cjService;
	
	@GetMapping("/convert")
	public Set<DistinctOsdTaxonomy> convert() throws FileNotFoundException {
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("taxonomy_all.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(fileReader);
		return cjService.convert(fileReader);
	
	}
	@GetMapping("/getCollection/{custId}")
	public CustPayload getCollection(@PathVariable("custId") String customerId) throws IOException {
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("D:\\offer_17-FI_customer_offers_v_periscope_P10_wk1.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		CustPayload custPayload = null;
		
		Workbook wb = new HSSFWorkbook();
		try (FileOutputStream fb = new FileOutputStream("cust_payload.csv")) {

			custPayload = cjService.getCollection(customerId, fileReader);
			
			Sheet s1 = wb.createSheet("Payload");

			int rowNum = s1.getLastRowNum();
			System.out.println(rowNum);

			Row row = s1.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("sysco_cust_id");
			Cell cell2 = row.createCell(1);
			cell2.setCellValue("cust_payload");
			Row row1 = s1.createRow(rowNum + 2);
			Cell cell1 = row1.createCell(0);
			cell1.setCellValue(customerId);
			Cell cell21 = row1.createCell(1);
			ObjectMapper obj = new ObjectMapper();
			cell21.setCellValue(obj.writeValueAsString(custPayload));
			wb.write(fb);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		fileReader.close();
		return custPayload;
	}
}
