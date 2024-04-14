Feature: LoginPage Validation

@tag1
Scenario: Validate the valid username and password
    Given Login to the application 
    When Enter the username "Sowmyashri13"
    And Enter the password "sowmya_13"
    And Enter the login button
    Then Validate the Homepage
   

