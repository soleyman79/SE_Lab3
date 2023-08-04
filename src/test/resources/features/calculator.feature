@tag
Feature: Calculator

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | -2     | 0      |
      | -3    | -4     | -7     |
      | 0     | 0      | 0      |