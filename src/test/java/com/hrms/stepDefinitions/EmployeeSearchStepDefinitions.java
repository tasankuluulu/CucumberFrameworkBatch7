package com.hrms.stepDefinitions;

import org.apache.poi.ss.formula.IStabilityClassifier;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchStepDefinitions extends CommonMethods {
	@When("navigate to employee list")
	public void navigate_to_employee_list() {
		click(dashboard.pim);
		click(empList.empList);
	}

	@When("enter a valid employee ID {string}")
	public void enter_a_valid_employee_ID(String empID) throws InterruptedException {
		Thread.sleep(2000);
		sendText(empList.id, empID);
		GlobalVariables.empId = empID;
	}

	@Then("click on Search Button")
	public void click_on_Search_Button() {
		click(empList.searchBtn);
	}

	@Then("verify the table is displayed")
	public void verify_the_table_is_displayed() {
		Assert.assertTrue(empList.isTableDisplayed());
	}

	@When("get first name from the table")
	public void get_first_name_from_the_table() {
		System.out.println(empList.getFirstNameFromTable());
	}

	@Then("validate first names from UI against DB")
	public void validate_first_names_from_UI_against_DB() {
		Assert.assertEquals(DBStepDefinitions.dbData, empList.getFirstNameFromTable());
	}

}
