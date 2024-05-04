@Login
Feature: Un cliente potencial quiere logear en clockify

  @Regression @Successfull
  Scenario: The client is on home page
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When The client set the email "camposcarlosh@yahoo.com"
    When The client set the password "123456+"
    When The client click on log in button
    Then The client verify is in the Dashboard with profile "CA"


