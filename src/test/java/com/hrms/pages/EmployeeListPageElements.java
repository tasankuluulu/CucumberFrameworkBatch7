package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPageElements extends BaseClass {

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empList;
	
	@FindBy(id = "empsearch_id")
	public WebElement id;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
	public List<WebElement> empListRows;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
	public List<WebElement> IDs;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[1]")
	public List<WebElement> CheckBoxes;
	
	@FindBy(id = "btnDelete")
	public WebElement deleteBtn;
	
	@FindBy(id = "dialogDeleteBtn")
	public WebElement okBtn;
	
	@FindBy(xpath = "(//a[text()='Next'])[1]")
	public WebElement nextBtn;

	public EmployeeListPageElements() {
		PageFactory.initElements(driver, this);
	}

}
