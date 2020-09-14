package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HW_LoginStepDefinitions extends CommonMethods {
	@Given("go to HW HRMS login page")
	public void go_to_hw_hrms_login_page() {
		setUp();
	}

	@When("enter valid password only and login")
	public void enter_valid_password_only_and_login() {
		login.login("", ConfigsReader.getPropValue("password"));
	}

	@Then("varify error message for empty username")
	public void varify_error_message_for_empty_username() {
		Assert.assertEquals(login.ERROR_MESSAGE_BLANK_USERNAME, login.errorMsg.getText());
	}

	@Then("HW quit the browser")
	public void hw_quit_the_browser() {
		tearDown();
	}
	
	@When("enter valid username only and login")
	public void enter_valid_username_only_and_login() {
	    login.login(ConfigsReader.getPropValue("username"), "");
	}

	@Then("varify error message for empty password")
	public void varify_error_message_for_empty_password() {
	    Assert.assertEquals(login.ERROR_MESSAGE_BLANK_PASSWORD, login.errorMsg.getText());
	}
}
