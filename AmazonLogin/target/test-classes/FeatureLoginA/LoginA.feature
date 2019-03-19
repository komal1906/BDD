#Author: Komal
@HotelBooking
Feature: Amazon Application


Scenario: Successful Login Amazon application with valid data
Given User is on Amazon application page
When user enters valid data
Then navigate to shopping form page

Scenario: Failure Amazon application on leaving the MobileNo empty
Given User is on Amazon application page
When user leaves MobileNo empty
And clicks the continue button
Then display alert mobileNo msg

Scenario: Failure Amazon application on leaving the password empty
Given User is on Amazon application page
When user leaves password empty
And clicks the Login button
Then display alert password msg

Scenario: Failure Amazon application on enter the MobileNo wrong
Given User is on Amazon application page
When user enters MobileNo wrong
And clicks the continue button
Then display alert mobileNo msg box

Scenario: Failure Amazon application on enter the password wrong
Given User is on Amazon application page
When user enters password wrong
And clicks the Login button
Then display alert password msg box