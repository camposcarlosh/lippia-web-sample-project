@Workspace
Feature: Un cliente quiere crear un workspace

  @NewWorkspace @Successfull
  Scenario: Create a new workspace
    Given The client is on Dashboard page logged with email "camposcarlosh@yahoo.com" and password "123456+"
    When The client click on workspace active button
    When The client click on manage button
    When The client click on create new workspace button
    When The client input workspace name with day and hour
    When The client click on create button
    When The app refresh the page
    Then The client verify exist the workspace