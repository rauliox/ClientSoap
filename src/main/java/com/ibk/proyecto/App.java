package com.ibk.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@ComponentScan({ "com.ibk.proyecto"})
public class App {
	
	public static void main(String args[]){
		SpringApplication.run(App.class, args);
		
	}
}
