Feature: Booking a hotel in Adactin Application

Scenario: Login to the Application
Given user launch the Application
When user enter the username in Username field
And user enter the password in Password field
Then user click the Login button and It navigate to next page

Scenario: User search the hotel 
When user select Location
And user select Hotel
And user select Room Type
And user select Number of Rooms
And user enter Check In Date
And user enter Check Out Date
And user select Adults per Room
And user select Children per Room
Then user click the Search button and It navigate to next page

Scenario: User select Hotel
When user click the button below select
Then user click the Continue button

Scenario: User book a hotel
When user enter the Firtname in First Name field 
And user enter the Lastname in Last Name field
And user enter the Address in Billing Address field
And user enter Credit Card Number 
And user select Credit Card Type
And user select Expiry Month 
And user select Expiry Year 
And user enter CVV number
Then user click Book Now button

Scenario: User Logout the Application  
When user click the Logout button
