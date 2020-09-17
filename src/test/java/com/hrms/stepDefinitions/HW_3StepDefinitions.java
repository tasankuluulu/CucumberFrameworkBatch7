package com.hrms.stepDefinitions;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HW_3StepDefinitions extends CommonMethods {

	@When("go to employee list")
	public void go_to_employee_list() {
		login.login();
		click(dashboard.pim);
		click(empList.empList);
	}

	@When("enter employee {string} inside ID field")
	public void enter_employee_inside_ID_field(String ID) {
		sendText(empList.id, ID);
	}

	@When("enter employee {string} into First Name field")
	public void enter_employee_into_First_Name_field(String firstName) {
		sendText(empList.empName, firstName);
	}

	@Then("click search Button")
	public void click_search_Button() {
		
		click(empList.searchBtn);
	}

	@Then("verify if employee {string} is presented with the given employee {string}")
	public void verify_if_employee_is_presented_with_the_given_employee(String string, String string2) throws InterruptedException {
		Thread.sleep(3000);
	}

}
