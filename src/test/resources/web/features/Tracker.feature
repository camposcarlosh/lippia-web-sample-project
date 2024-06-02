@Tracker
Feature: Registro de horas trabajadas
Background:
  Given The client is on Dashboard page logged with email "chc152535@gmail.com" and password "123456+"
  When The client click on tracker button

  @NewTrackerManual @Do
  Scenario Outline: Create a new time tracker whith manual option
    When The client click on Manual option
    When The client input Time-Entry-Desciption name with day and hour
    When The client input Time-Init <timeIn> Time-Out <timeOut> Day <day>
    When The client click on init button
    Then The client verify exist time entry

    Examples:
      | timeIn | timeOut | day        |
      | 1015   | 1020    | 01/06/2024 |

  @NewTrackerTemp @Do
  Scenario: Create a new time tracker whith temporizador option
    When The client click on Temporizador option
    When The client input Time-Entry-Desciption name with day and hour
    When The client click on init button
    When The client click on stop button
    Then The client verify exist time entry

  @CancelTracker @Do
  Scenario: Cancel a new time tracker
    When The client click on Temporizador option
    When The client input Time-Entry-Desciption name with day and hour
    When The client click on init button
    When The client click on manage time entry button
    When The client click on Discard option
    When The client click on Discard button
    Then The client verify exist time entry