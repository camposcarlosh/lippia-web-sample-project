@Project
Feature: Un cliente quiere crear un proyecto

  @NewProject @Do
  Scenario: Create a new project
    Given The client is on Dashboard page logged with email "camposcarlosh@yahoo.com" and password "123456+"
    When The client click on project button
    When The client click on create new project button
    When The client input project name "lalala"
   # When The client click on create project button
    #Then The client verify exist the project