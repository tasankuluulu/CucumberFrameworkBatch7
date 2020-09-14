Feature: Add employee
	@HW
  Scenario: without login details
    When go to PIM, Add Employee
    And add employee without login details
    Then verify if it is added

  #Scenario: with login details
    #When go to PIM, Add Employee
    #And add employee with login details
    #Then verify if it is added
