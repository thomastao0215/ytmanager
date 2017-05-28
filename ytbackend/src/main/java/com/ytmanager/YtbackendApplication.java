package com.ytmanager;


import org.apache.naming.factory.TransactionFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import javax.validation.Valid;
import javax.xml.crypto.Data;

@SpringBootApplication

public class YtbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(YtbackendApplication.class, args);
	}



}
