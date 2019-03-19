#Author:Komal 
Feature: Reset functionality on login page of application
Scenario Outline: Verfication of reset button with number of credential
Given Open the Firefox and Launch the application
When Enter the Username <username> and Password <password>
Then Reset the credential
Examples: 
      |username  | password | 
      |"User11"|"password11" |
      |"User22"|"password22" |
      |"User33"|"password33" |
