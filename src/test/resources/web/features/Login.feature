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

  @Login_Email @Successfull
  Scenario: Login successful with email
    Given The client is on home page
    When The client click on log in button on landing page
    When The client set the email "camposcarlosh@yahoo.com"
    When The client click on log in button
    Then The client verify is in the Enter Code Page with email "camposcarlosh@yahoo.com"

  @CheckCodeFallido @Successfull
  Scenario Outline: Email login failed for <causa_fallo>
    Given The client is on verify code page with mail <email>
    When The client set the code <cod1>-<cod2>-<cod3>-<cod4>-<cod5>-<cod6> that recived for email
    Then Show error Message: "You've maxed out your attempts. Check your email to proceed."

    Examples:
      | email                   | cod1 | cod2 | cod3 | cod4 | cod5 | cod6 | causa_fall        |
      | camposcarlosh@yahoo.com | 1    | 2    | 3    | 4    | 5    |      | Código incorrecto |
      | camposcarlosh@yahoo.com | A    | 3    | 5    | 8    | B    | C    | Código Vencido    |


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