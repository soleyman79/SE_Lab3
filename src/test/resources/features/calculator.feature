@tag
Feature: Calculator

  Scenario Outline: add two numbers
    Given Operands: <first> & <second>
    When Run <op>
    Then Expected Result: <result>

    Examples:
      | first | second | op | result |
      | 1     | 12     | ^  | 1     |