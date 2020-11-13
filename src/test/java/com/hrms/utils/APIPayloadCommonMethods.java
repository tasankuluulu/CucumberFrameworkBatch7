package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {
	public static String createEmployeeBody() {
		String createEmployeeBody = "{\r\n" + "  \"emp_firstname\": \"FirstName\",\r\n"
				+ "  \"emp_lastname\": \"LastName1409\",\r\n" + "  \"emp_middle_name\": \"MiddleName1409\",\r\n"
				+ "  \"emp_gender\": \"M\",\r\n" + "  \"emp_birthday\": \"1985-10-15\",\r\n"
				+ "  \"emp_status\": \"Employee\",\r\n" + "  \"emp_job_title\": \"Cloud Architect\"\r\n" + "}";
		return createEmployeeBody;
	}

	public static String createEmployeePayload() {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "FirstName");
		obj.put("emp_lastname", "LastName1409");
		obj.put("emp_middle_name", "MiddleName1409");
		obj.put("emp_gender", "M");
		obj.put("emp_birthday", "1985-10-15");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Cloud Architect");

		return obj.toString();
	}

	public static String createEmployeePayloadMoreDynamic(String firstName, String lastName, String middleName,
			String gender, String dob, String employeeStatus, String employeeJobTitle) {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", firstName);
		obj.put("emp_lastname", lastName);
		obj.put("emp_middle_name", middleName);
		obj.put("emp_gender", gender);
		obj.put("emp_birthday", dob);
		obj.put("emp_status", employeeStatus);
		obj.put("emp_job_title", employeeJobTitle);

		return obj.toString();
	}

}
