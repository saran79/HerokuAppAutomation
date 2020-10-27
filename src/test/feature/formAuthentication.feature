Feature: Form Authentication-Validation

 Scenario: Validate form Authentication with invalid username and valid password
   Given I navigate to the provided Url
   When I click the Form Authentication Link
   And I ll taken to the Form Authentication page
   And I enter the Username as "tomsmith"
   And I enter the Password as "shss"
   And I click the Submit button
   Then I should not be allowed to login with wrong password

  Scenario: Validate form Authentication with  invalid username and valid password
    Given I navigate to the provided Url
    When I click the Form Authentication Link
    And I ll taken to the Form Authentication page
    And I enter the Username as "toms"
    And I enter the Password as "SuperSecretPassword!"
    And I click the Submit button
    Then I should not be allowed to login with wrong Username

  @valid_data
  Scenario: Validate form Authentication with valid username and password
    Given I navigate to the provided Url
    When I click the Form Authentication Link
    And I ll taken to the Form Authentication page
    And I enter the Username as "tomsmith"
    And I enter the Password as "SuperSecretPassword!"
    And I click the Submit button
    And I should be allowed to login Successfully
    And I should be able to click Logout
    Then I should be able to logout successfully
