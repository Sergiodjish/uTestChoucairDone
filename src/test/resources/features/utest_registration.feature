#Autor : Sergio Alejandro Diaz Gutierrez
@stories
Feature: uTest website register
  As a user, I want to register on uTest website
  @scenario1
  Scenario: User registration on uTest website
    Given than Sergio wants to register on uTest website
    When he fills all required personal information
      | strFirstName | strLastName | strEmail | strBirthMonth | strBirthDay | strBirthYear | strCity | strZip | strCountry | strComputer | strComputerVersion | strComputerLanguage | strMobileDevice | strMobileModel | strMobileOs | strPassword |
      | Sergio       | Alejandro    | aljandroguti@hotmail.com | April | 14   | 1999         | Neiva | 410001 | Colombia   | Windows     | 11                 | Spanish             | Xiaomi          | Redmi Note 10S   | Android 12  | Choucair2021* |
    Then he completes the registration process successfully
      | strCompleted |
      | Complete Setup |
