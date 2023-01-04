#Author: S M Tarek

@para
Feature:  Parameterizarion  Login Functionality  

  #@login1
  Scenario: Parameterizarion the login functionality using valid credential
    Given User is on Amazon Homepage
    And User click on signinbutton
    When User input "smtk123@gmail.com" as username
    And User click on Continuebutton
    And User input "Yaamin@321" as password
    And User click on loginbutton
    #Then User validate the landing page
    #And User validate the page tittle
    #And User click on LogoutButton
    Then User click on LogoutButton

