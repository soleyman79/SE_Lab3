@tag
Feature: Calculator

  Scenario Outline: add two numbers
    Given Operands are <first> & <second> and Operator is <op>
    When Run
    Then Expected Result: <result>

    Examples:
      | first | second | op | result |
      | 1     | 12     | +  | 13     |