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
	/*
	 * Method adds employees from excel file and given store employee ID into excel
	 */
	@When("add employee without login details")
	public void add_employee_without_login_details() {
		List<Map<String, String>> list = ExcelUtility.excelToListMap(Constants.EXCELFILE_PATH, "HW_2");
		int n = 1;
		for (Map<String, String> element : list) {
			click(addEmp.addEmpBtn);
			sendText(addEmp.firstNameTextBox, element.get("FirstName"));
			sendText(addEmp.lastNameTextBox, element.get("LastName"));
			ExcelUtility.saveIntoExcel(Constants.EXCELFILE_PATH, "HW_2", n, 5, addEmp.empId.getAttribute("value"),
					Constants.EXCELFILE_PATH);
			n++;
			click(addEmp.saveBtn);
		}
	}
	 /*
	  * Method uses employee ID from excel file and search them inside employee list, then delete them
	  */
	@Then("verify if it is added")
	public void verify_if_it_is_added() {
		click(empList.empList);
		boolean check = true;
		String str;
		List<Map<String, String>> list = ExcelUtility.excelToListMap(Constants.EXCELFILE_PATH, "HW_2");
		int count = 0;
		while (check) {
			for (int i = 0; i < empList.IDs.size(); i++) {
				str = empList.IDs.get(i).getText();
				for (int n = 0; n < list.size(); n++) {
					if (str.contains(list.get(n).get("Emp ID"))) {
						click(empList.CheckBoxes.get(i));
						click(empList.deleteBtn);
						click(empList.okBtn);
						count++;
						i = 0;
						break;
					}
				}
			}
			if (count == list.size()) {
				check = false;
			} else {
				click(empList.nextBtn);
			}
		}
	}
	@When("add employee with login details")
	public void add_employee_with_login_details() {

	}
}
