package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.hrms.pages.DashboardPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HW_2_StepDefinitions extends CommonMethods {
	@When("go to PIM, Add Employee")
	public void go_to_PIM_Add_Employee() {
		click(dashboard.pim);
		
	}

	@When("add employee without login details")
	public void add_employee_without_login_details() {
		List<Map<String, String>> list = ExcelUtility.excelToListMap(Constants.EXCELFILE_PATH, "HW_2");
		int n = 1;
		for (Map<String, String> element : list) {
			click(addEmp.addEmpBtn);
			sendText(addEmp.firstName, element.get("FirstName"));
			sendText(addEmp.lastName, element.get("LastName"));
			ExcelUtility.saveIntoExcel(Constants.EXCELFILE_PATH, "HW_2", n, 5, addEmp.empId.getAttribute("value"),
					Constants.EXCELFILE_PATH);
			n++;
			click(addEmp.save);
		}

	}

	@Then("verify if it is added")
	public void verify_if_it_is_added() {

	}

	@When("add employee with login details")
	public void add_employee_with_login_details() {

	}
}
