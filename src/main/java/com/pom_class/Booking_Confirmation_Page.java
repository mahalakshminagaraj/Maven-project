package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	public WebDriver driver;
	public Booking_Confirmation_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	WebElement clicklogout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClicklogout() {
		return clicklogout;
	}
}
