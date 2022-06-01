package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/com/file_features/adactin.feature",
glue = "com.step_definition",
monochrome = true,
plugin = {
		"html:Report/Html_Report",
		
		"pretty",
		
		"json:Reports/Cucumber.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
}
		
		)

@RunWith(Cucumber.class)

public class Runner_Class {
    
	public static WebDriver driver;
	
	@BeforeClass
	public static void browslaunch() {
    driver = Base_Class.browserLaunch();
	}
	
	@AfterClass
	public static void closebrow() {
	driver.close(); 
    }
}