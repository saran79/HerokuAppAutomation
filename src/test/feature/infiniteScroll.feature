Feature: Infinite Scroll-Validation

  Scenario: Verify whether we can click Infinite Scroll link
    Given I navigate to the provided Url
    When I click the infinite scroll link
    Then I should be able to view the infinite scroll page
  @infinite
  Scenario: Validate by Scrolling to the Bottom of the page and back
    Given I navigate to the provided Url
    When I click the infinite scroll link
    And I scroll down to the Bottom of the page twice
    And I Scroll Up to the Top of the page
    Then I should be able to validate the text "Infinite Scroll"


