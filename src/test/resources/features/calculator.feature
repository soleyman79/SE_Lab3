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
      | -6    | 3      | ^  | -216   |
      | 3     | 5      | ^  | 243    |
      | 6     | 2      | ^  | 36     |
      | 10    | 5      | ^  | 100000 | 
      | 0     | 20     | ^  | 0      |
      | 0     | 5      | ^  | 0      |
      | -1    | 5      | +  | 4      |
      | -50   | 5      | +  | -45    |
      | 20    | -30    | +  | -10    |
      | 16    | 14     | +  | 30     |
      | 3     | 49     | +  | 52     |
      | -21   | -34    | +  | -55    |
      | -143  | -13    | +  | -156   |
      | 0     | 150    | +  | 150    |
      | -201  | 0      | +  | -201   |

      
