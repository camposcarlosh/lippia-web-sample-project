@Tracker
Feature: Registro de horas trabajadas

Background:
  Given The client is on tracker page logged with email "chc152535@gmail.com" and password "123456+"

  @NewTrackerManual @Punto1a @Do
  Scenario Outline: Create a new time tracker whith manual option
    When The client click on Manual option
    When The client input <input> Time-Entry-Desciption name with day and hour
    When The client input Time-Init <timeIn> Time-Out <timeOut> Day <day>
    When The client click on init button
    Then The client verify <existe> exist time entry

    Examples:
      | timeIn | timeOut | day        | input | existe |
      | 1015   | 1020    | 01/06/2024 |new    |SI      |

  @NewTrackerTemp @Punto1b @Do
  Scenario: Create a new time tracker whith temporizador option
    When The client click on Temporizador option
    When The client input new Time-Entry-Desciption name with day and hour
    When The client click on init button
    When The client click on stop button
    Then The client verify SI exist time entry

  @CancelTracker @Punto2 @Do
  Scenario: Cancel a new time tracker
    When The client click on Temporizador option
    When The client input new Time-Entry-Desciption name with day and hour
    When The client click on init button
    When The client click on manage time entry button
    When The client click on Discard option
    When The client click on Discard button
    Then The client verify NO exist time entry

  @UpdateTracker @Punto3 @Do
  Scenario: Update a time tracker existent
    When The client add a new tracker entry
    When The client update Time-Entry-Desciption name
    When The client select the project option, enter a new project and associate
    When The client select the tag option, enter a new tag and associate
    When The client update billable
    When The client update input Time-Init = 1410 Time-Out = 1530
    Then The client verify SI exist time entry