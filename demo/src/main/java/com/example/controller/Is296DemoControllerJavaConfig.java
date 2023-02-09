package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.vo.Datasource;
import com.example.vo.DatasourceJavaConfig;

public class Is296DemoControllerJavaConfig {
	private DatasourceJavaConfig ds;
	
	public Is296DemoControllerJavaConfig(DatasourceJavaConfig ds) {
		System.out.println("Is296DemoControllerJavaConfig instantiated");
		this.ds = ds;
	}
	
	@GetMapping("/homebase") 
	public String getHomePage() {
		return "home";
	}
	

}
