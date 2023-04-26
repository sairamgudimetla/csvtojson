package com.task.csvtojson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CsvtojsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvtojsonApplication.class, args);
	}

}
