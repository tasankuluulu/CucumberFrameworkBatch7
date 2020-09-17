@HW_3
Feature: Search employee

  Background: 
    When go to employee list

  Scenario Outline: search using ID
    When enter employee "<ID>" inside ID field
    Then click search Button
    And verify if employee "<ID>" is presented with the given employee "<First Name>"

    Examples: 
      | ID     | First Name            |
      | 19784A | Anwarii sa            |
      | 11539A | Eliza                 |
      #| 10024A | ELizaUpdatedFirstName |
      #| 14919A | Prince Tugba          |
      #|   7131 | Abdul                 |

  Scenario Outline: search using name
    When enter employee "<First Name>" into First Name field
    Then click search Button
    And verify if employee "<First Name>" is presented with the given employee "<ID>"

    Examples: 
      | ID     | First Name            |
      | 19784A | Anwarii sa            |
      | 11539A | Eliza                 |
      #| 10024A | ELizaUpdatedFirstName |
      #| 14919A | Prince Tugba          |
      #|   7131 | Abdul                 |
