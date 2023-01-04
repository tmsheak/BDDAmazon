#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@data
Feature: Valid and invalid login Test

  Scenario Outline: Boundary Test for Login
    Given User is on Amazon Homepage
    And User click on signinbutton
    When User enter valid username <userName>
    #When User enter <userName> as valid username
    And User click on Continuebutton
    #And User enter <password> as valid username
    And User enter valid password <password>
    And User click on loginbutton
    #Then User validate the landing page
    #And User validate the page tittle
    #And User click on LogoutButton
    Then User click on LogoutButton

    Examples: 
      | userName            | password     |
      | "smtk123@gmail.com" | "Yaamin@321" |
      | "smtk13@gmail.com"  | "Yaamin@321" |
      | "smtk23@gmail.com"  | "Yaamin@321" |
