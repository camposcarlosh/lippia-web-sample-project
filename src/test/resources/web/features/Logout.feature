@Logout
Feature: Un cliente quiere desloguearse de clockify

  @Successfull
  Scenario: Logout successful
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When The client set the email "camposcarlosh@yahoo.com"
    When The client set the password "123456+"
    When The client click on log in button
    When The client click on profile button
    When The client click on close session button
    Then The client verify is in the login page