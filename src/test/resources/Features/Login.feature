#Author: S M Tarek


Feature:  Verify  Login Functionality  

  @login1
  Scenario: Verify the login functionality using valid credential
    Given User is on Amazon Homepage
    And User click on signinbutton
    When User input valid username
    And User click on Continuebutton
    And User input valid password
    And User click on loginbutton
   # Then User validate the landing page
    #And User validate the page tittle
    #And User click on LogoutButton
    #Then User click on LogoutButton

