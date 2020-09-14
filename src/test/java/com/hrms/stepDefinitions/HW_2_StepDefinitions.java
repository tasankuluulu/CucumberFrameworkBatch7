package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

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
		click(empList.empList);
		boolean check = false;

		for (int i = 0; i < ExcelUtility.getRowsCount(); i++) {

			for (int n = 1; n < empList.IDs.size(); n++) {
				String str = empList.IDs.get(n).getText();
//				ExcelUtility.openExcel(Constants.EXCELFILE_PATH);
//				ExcelUtility.getSheet("HW_2");

				List<Map<String, String>> list = ExcelUtility.excelToListMap(Constants.EXCELFILE_PATH, "HW_2");
				if (str.contains(list.get(i).get("Emp ID"))) {
					click(empList.CheckBoxes.get(n));
					click(empList.deleteBtn);
					click(empList.okBtn);
				} else {
					click(empList.nextBtn);
				}
			}

		}
	}

	@When("add employee with login details")
	public void add_employee_with_login_details() {

	}
}
