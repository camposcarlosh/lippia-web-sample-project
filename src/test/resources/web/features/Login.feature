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


  @Login_Email @Fail
  Scenario: Login successful with email
    Given The client is on home page
    When The client click on log in button on landing page
    When The client set the email "camposcarlosh@yahoo.com"
    When The client click on log in button
    Then The client verify is in the Enter Code Page with email "camposcarlosh@yahoo.com"

  #-- Pruebo este escenario forzando que inicie en la página indicada
  #   para ver si ese es el error
  #   pero tampoco encuentra los elementos
  #   TestNGSecuencialRunner.runScenario » NoSuchElement no such element: Unable to ...
  @Login_Email @Fail
  Scenario: Login successful with email
    Given The client is on Enter Code Page
    Then The client verify is in the Enter Code Page with email "camposcarlosh@yahoo.com"

  @LoginHabilitado @Successfull
  Scenario: button is enabled in Login Manual
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When The client set the email "camposcarlosh@yahoo.com"
    When The client set the password "123456+"
    Then the 'Iniciar Sesión' button is enabled

  @LoginManualFallido @Successfull
  Scenario Outline: Manual login failed for <causa_fallo>
    Given The client is on home page
    When The client click on log in button on landing page
    When The client click on log in Manually button
    When Set the email <correo>
    When Set the password <pass>
    When The client click on log in button
    Then Show error Message <caso> : <mensaje>

    Examples:
      | correo                  | pass   | mensaje                   | causa_fallo               | caso |
      | camposcarlosh@yahoo.com | 12345  | Password is not valid     | Contraseña incorrecta     | 1    |
      | camposcarloshyahoo.com  | 123456 | Email format is not valid | Formato Correo incorrecto | 2    |
      | camposcarlosh@yahoocom  | 123456 | Email format is not valid | Formato Correo incorrecto | 2    |