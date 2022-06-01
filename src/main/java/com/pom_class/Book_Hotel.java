package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	public Book_Hotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="cc_num")
	WebElement cardnumber;
	
	@FindBy(id="cc_type")
	WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	WebElement expyear;
	
	@FindBy(id="cc_cvv")
	WebElement cvvnumber;
	
	@FindBy(id="book_now")
	WebElement booknow;
	
	
	
	
	
	
	
}
