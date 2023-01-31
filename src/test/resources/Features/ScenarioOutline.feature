@data
Feature: Valid and invalid login Test

  Scenario Outline: Boundary Test for Login
    Given User is on Amazon Homepage
    And User click on signinbutton
    When User enter valid username <userName>
    And User click on Continuebutton
    And User enter valid password <password>
    #And User click on loginbutton
    Then User click on LogoutButton
    #need valid credential to run the test, take care yourself, below dummy data
    Examples: 
      | userName            | password     |
      | "21tsm@gmail.com" | "Meah@342"   |
      | "21tar@gmail.com" | "Meah@2017"  |
      | "smtk2@gmail.com"   | "Yamin@321" |
