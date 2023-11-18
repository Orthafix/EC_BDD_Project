Feature: Calculator

  Scenario: Add two numbers
    Given I have two numbers 10 and 20
    When I add the two numbers
    Then I get the result 30

  Scenario: Subtract two numbers
    Given I have two numbers 40 and 20
    When I subtract the two numbers
    Then I get the result 20