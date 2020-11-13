Feature: Name validations against DB
	@dbValidation
  Scenario: First name validation against DB - searching by employee ID
    When login with valid credentials
    And verify the dashboard is displayed
    When navigate to employee list
    And enter a valid employee ID "0056266"
    Then click on Search Button
    And verify the table is displayed
    When get first name from the table
    Then get first name from the db
    Then validate first names from UI against DB
    
    
