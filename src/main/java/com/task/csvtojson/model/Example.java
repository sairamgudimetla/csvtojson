package com.task.csvtojson.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Example {
	
	public static void main(String[] args) throws IOException {
		
		
		/*
		 * BufferedReader fileReader = new BufferedReader(new
		 * FileReader("offer_17-FI_customer_offers_v_periscope_P10_wk1.csv"));
		 * 
		 * String row = ""; List<String> lst = new ArrayList<String>();
		 * 
		 * //Map<String,List<CustPayload>> ml = new HashMap<>(); List<Object> ls = new
		 * ArrayList<Object>(); try { while ((row = fileReader.readLine()) != null) {
		 * String[] data = row.split(",",2); ls = Arrays.asList(data);
		 * 
		 * } // System.out.println(ls.stream().collect(Collecto)); // List<String> dist
		 * = lst.stream().distinct().collect(Collectors.toList()); //
		 * dist.forEach(System.out::println);
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */
		 
//		Scanner sc = new Scanner(new File("D:\\New folder\\csvtojson\\customer_offer_payload.csv"));  
//		sc.useDelimiter(",");   //sets the delimiter pattern  
//		while (sc.hasNext())  //returns a boolean value  
//		{  
//			System.out.println(sc.next());  //find and returns the next complete token from this scanner  
//		}   
//			sc.close();  //closes the scanner  
//		}
		
		/*
		 * Workbook wb = new HSSFWorkbook(); try (FileOutputStream fb = new
		 * FileOutputStream("Example.csv")) {
		 * 
		 * Sheet s1 = wb.createSheet("Payload");
		 * 
		 * Row row = s1.createRow(0); Cell cell = row.createCell(0);
		 * cell.setCellValue("sysco_cust_id"); Cell cell2 = row.createCell(1);
		 * cell2.setCellValue("cust_payload");
		 * 
		 * wb.write(fb);
		 * 
		 * } catch (FileNotFoundException e) { System.out.println(e); }
		 */
		
		LocalDate da = LocalDate.now();
		
		System.out.println(da);
		LocalDateTime lod = LocalDateTime.now();
		System.out.println(lod);
		
		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
		
		
		
		
		
		
		
		
		
		
		
	}
}