Feature: Key Presses

  @KeyPress
  Scenario: Validate the Key Presses and Assert the text Displayed
    Given I navigate to the provided Url
    When I click the Key presses link
    And I will be in the Key Presses page
    And I press four keys one after the other
    Then I should be able to validate the displayed text one after the other