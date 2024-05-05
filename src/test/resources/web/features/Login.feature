@Login
Feature: Un cliente potencial quiere logear en clockify

  @Login_User_Pass @Successfull
  Scenario: Login successful with user and password
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When The client set the email "camposcarlosh@yahoo.com"
    When The client set the password "123456+"
    When The client click on log in button
    Then The client verify is in the Dashboard with profile "CA"


  @Login_Email @Do
  Scenario: Login successful with email
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When The client set the email "camposcarlosh@yahoo.com"
    When The client click on log in button
    Then The client verify is in the Enter Code Page with email "camposcarlosh@yahoo.com"