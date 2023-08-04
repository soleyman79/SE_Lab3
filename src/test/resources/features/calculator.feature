@tag
Feature: Calculator

  Scenario Outline: add two numbers
    Given Operands: <first> & <second>
    When Run <op>
    Then Expected Result: <result>

    Examples:
      | first | second | op | result |
      | 1     | 12     | ^  | 1      |
      | -3    | 1      | ^  | -3     |
      | -2    | 4      | ^  | 16     |
      | 3     | 5      | ^  | 243    |
      | 6     | 2      | ^  | 36     |
      | 10    | 5      | ^  | 100000 |      
