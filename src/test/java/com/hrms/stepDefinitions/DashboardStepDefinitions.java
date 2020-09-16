package com.hrms.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;


public class DashboardStepDefinitions extends CommonMethods {
	@Then("verify the following dashboard tabs")
	public void verify_the_following_dashboard_tabs(DataTable dashboardTabs) {
		List<String> expectedDashTabs = dashboardTabs.asList();
		List<String> actualDashTabs = new ArrayList<>();

		for (WebElement dashTab : dashboard.dashTabs) {
			actualDashTabs.add(dashTab.getText());
		}
		System.out.println(expectedDashTabs);
		System.out.println(actualDashTabs);
		Assert.assertEquals(expectedDashTabs, actualDashTabs);

		for (int i = 0; i < expectedDashTabs.size(); i++) {
			for (int n = 0; n < dashboard.dashTabs.size(); n++) {
				if (expectedDashTabs.get(i).equals(dashboard.dashTabs.get(n).getText())) {
					System.out.println("comparing like that");
					break;
				}

			}
		}
	}
}
