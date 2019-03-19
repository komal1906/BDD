#Author: Komal
@HotelBooking
Feature: HotelBooking

Scenario: check the title
Given User is on hotel booking application page
Then Check the title of the page

Scenario: Successful hotel booking application with all valid data
Given User is on hotel booking application page
When user enters all valid data
Then navigate to hotel booking form page

Scenario: Failure in hotel booking application on leaving the User Name empty
Given User is on hotel booking application page
When user leaves user Name blank 
And clicks the Login button
Then display alert username msg

Scenario: Failure in hotel booking on leaving the password empty
Given User is on hotel booking application page
When user leaves password blank And clicks the button
Then display alert password msg

Scenario: Failure in hotel booking entering both username and password wrong
Given User is on hotel booking application page
When user entry wrong details And clicks the button
Then display alert msg box