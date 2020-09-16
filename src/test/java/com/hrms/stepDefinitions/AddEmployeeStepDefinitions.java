package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {
	@Then("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		click(dashboard.pim);
		click(addEmp.addEmpBtn);
	}

	@Then("enter first and last name")
	public void enter_first_and_last_name() {
		sendText(addEmp.firstName, "John");
		sendText(addEmp.lastName, "Wick");
	}

	@Then("click on save Button")
	public void click_on_save_Button() {
		click(addEmp.save);
	}

	@Then("verify the employee is added successfully")
	public void verify_the_employee_is_added_successfully() {
		Assert.assertEquals("John Wick", addEmp.empInfo.getText());
	}

	@When("enter first name as {string}, middle name as {string} and last name as {string}")
	public void enter_first_name_as_middle_name_as_and_last_name_as(String firstName, String middleName,
			String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
		sendText(addEmp.middleName, middleName);
	}

	@Then("verify that {string} is added successfully")
	public void verify_that_is_added_successfully(String fullName) {
		Assert.assertEquals(fullName, addEmp.empInfo.getText());
	}

	@When("enter employee {string}, {string} and {string}")
	public void enter_employee_and(String firstName, String middleName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
		sendText(addEmp.middleName, middleName);
	}

	@Then("verify that {string}, {string} and {string} is successfully added")
	public void verify_that_and_is_successfully_added(String firstName, String middleName, String lastName) {
		String fullName = firstName + " " + middleName + " " + lastName;
		String fullProfileName = addEmp.empInfo.getText();
		Assert.assertEquals(fullName, fullProfileName);

	}
	
	

}
