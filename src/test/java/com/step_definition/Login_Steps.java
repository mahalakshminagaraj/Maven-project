package com.step_definition;

import com.base_class.Base_Class;
import com.pom_class.Book_Hotel;
import com.pom_class.Booking_Confirmation_Page;
import com.pom_class.Login_page;
import com.pom_class.Search_Hotel;
import com.pom_class.Select_Hotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Steps extends Base_Class{
	
	public static Login_page lp = new Login_page(driver);
	public static Search_Hotel sh = new Search_Hotel(driver);
	public static Select_Hotel seh = new Select_Hotel(driver);
	public static Book_Hotel bh = new Book_Hotel(driver);
	public static Booking_Confirmation_Page bcp = new Booking_Confirmation_Page(driver);
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
		openUrl("https://adactinhotelapp.com/");
	}
	
	@When("^user enter the username in Username field$")
	public void user_enter_the_username_in_Username_field() throws Throwable {
        sendkeys(lp.getUsername() , "8838725177maha");
	}

	@When("^user enter the password in Password field$")
	public void user_enter_the_password_in_Password_field() throws Throwable {
        sendkeys(lp.getPassword(), "30012002@20");
	}

	@Then("^user click the Login button and It navigate to next page$")
	public void user_click_the_Login_button_and_It_navigate_to_next_page() throws Throwable {
        clickElement(lp.getLogin());
	}
	
	@When("^user select Location$")
	public void user_select_Location() throws Throwable {
       dropdownValue(sh.getLocation(), "New York");
	}

	@When("^user select Hotel$")
	public void user_select_Hotel() throws Throwable {
       dropdownValue(sh.getHotels(), "Hotel Sunshine");
	}

	@When("^user select Room Type$")
	public void user_select_Room_Type() throws Throwable {
       dropdownIndex(sh.getType(), 2);
	}

	@When("^user select Number of Rooms$")
	public void user_select_Number_of_Rooms() throws Throwable {
       dropdownIndex(sh.getNos(), 2);
	}
	@When("^user enter Check In Date$")
	public void user_enter_Check_In_Date() throws Throwable {
       sendkeys(sh.getCheckin(), "23/05/2022");
	}

	@When("^user enter Check Out Date$")
	public void user_enter_Check_Out_Date() throws Throwable {
       sendkeys(sh.getCheckout(), "25/05/2022");
	}

	@When("^user select Adults per Room$")
	public void user_select_Adults_per_Room() throws Throwable {
       dropdownValue(sh.getAdults(), "2");
	}

	@When("^user select Children per Room$")
	public void user_select_Children_per_Room() throws Throwable {
       dropdownValue(sh.getChildren(), "1");
	}

	@Then("^user click the Search button and It navigate to next page$")
	public void user_click_the_Search_button_and_It_navigate_to_next_page() throws Throwable {
       clickElement(sh.getSearch());
	}

	@When("^user click the button below select$")
	public void user_click_the_button_below_select() throws Throwable {
       clickElement(seh.getButton());
	}

	@Then("^user click the Continue button$")
	public void user_click_the_Continue_button() throws Throwable {
       clickElement(seh.getClickcontinue());
	}

	@When("^user enter the Firtname in First Name field$")
	public void user_enter_the_Firtname_in_First_Name_field() throws Throwable {
       sendkeys(bh.getFirstname(), "Maha");
	}

	@When("^user enter the Lastname in Last Name field$")
	public void user_enter_the_Lastname_in_Last_Name_field() throws Throwable {
       sendkeys(bh.getLastname(), "lakshmi");
	}

	@When("^user enter the Address in Billing Address field$")
	public void user_enter_the_Address_in_Billing_Address_field() throws Throwable {
        sendkeys(bh.getAddress(), "8/217 J Udhayam nagar, Arulpuram, Tirupur");
	}

	@When("^user enter Credit Card Number$")
	public void user_enter_Credit_Card_Number() throws Throwable {
        sendkeys(bh.getCardnumber(), "1234567890123456");
	}

	@When("^user select Credit Card Type$")
	public void user_select_Credit_Card_Type() throws Throwable {
        dropdownIndex(bh.getCardtype(), 2);
	}
	@When("^user select Expiry Month$")
	public void user_select_Expiry_Month() throws Throwable {
        dropdownValue(bh.getExpmonth(), "1");
	}

	@When("^user select Expiry Year$")
	public void user_select_Expiry_Year() throws Throwable {
        dropdownValue(bh.getExpyear(), "2015");
	}

	@When("^user enter CVV number$")
	public void user_enter_CVV_number() throws Throwable {
        sendkeys(bh.getCvvnumber(), "1234");
	}

	@Then("^user click Book Now button$")
	public void user_click_Book_Now_button() throws Throwable {
        clickElement(bh.getBooknow());
	}
	
	@When("^user click the Logout button$")
	public void user_click_the_Logout_button() throws Throwable {
        clickElement(bcp.getClicklogout());
	}


	



}
