package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/** Can work with Cucumber as well, sorts results */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {
	/*
	 * Rest Assured - Java library specifically developed to automate REST endpoints
	 * Given (precondition) - Preparing your request When (action) - What action
	 * will you perform, what type of call are you making? Then - Verification
	 * 
	 */

	/** Concatenetes with the endpoint during run time */
	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2MzU3NzksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY3ODk3OSwidXNlcklkIjoiMTMzNSJ9.SBKt3DAdNMVfSFT0Y16b9VZZo8wgecE2bEM1DvPCQvc";
	static String employeeID;

	// @Test
	public void sampleTest() {
		/** BaseURI for all endpoints */

		/** JWT */

		/** Preparing request for /getOneEmployee.php */
		/** Using .log().all() to print out everything being sent with the request */
		RequestSpecification prepairingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application-json").queryParam("employee_id", "8625").log().all();

		/** Making call to /getOneEmployee.php */
		Response getOneEmployeeResponse = prepairingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** One way to print response object */
//		System.out.println(getOneEmployeeResponse.asString());

		/** Second way to print response object using rest assured prettyPrint() */
//		getOneEmployeeResponse.prettyPrint();

		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	@Test
	public void aPOSTcreateEmployee() {
		/** Preparing request for creating an employee */
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"emp_firstname\": \"FirstName\",\r\n" + "  \"emp_lastname\": \"LastName1409\",\r\n"
						+ "  \"emp_middle_name\": \"MiddleName1409\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"1985-10-15\",\r\n" + "  \"emp_status\": \"Employee\",\r\n"
						+ "  \"emp_job_title\": \"Cloud Architect\"\r\n" + "}");
//				.log().all();

		/** Making call to /createEmployee.php */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
		/** Printing response */
//		createEmployeeResponse.prettyPrint();

		/**
		 * We are storing the emloyee ID as a static global variable to be able to use
		 * woth other calls
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		/** Verifying status code is 201 */
		createEmployeeResponse.then().assertThat().statusCode(201);
		/** Optional: Print employeeID */
//		System.out.println(employeeID);

		/** Verufying response body "Message" is paired with "Entry Created" */
		/**
		 * equalTo() method comes from static Hamcrest package - NEED TO IMPORT MANUALLY
		 */
		/** import static org.hamcrest.Matchers.*; */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

		/** Veifying created employee first name */
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("FirstName"));

		/** Verifying server Apache/2.4.39 (Win64) PHP/7.2.18 */
		createEmployeeResponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
	}

	@Test
	public void bGETcreatedEmployee() {
		/** Preparing request to getcreated employee */
		RequestSpecification getCreatedEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", employeeID);

		/** Storing response for retreiving created employee */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("\r\n" + "/getOneEmployee.php");

		/** Printing response */
//		getCreatedEmployeeResponse.prettyPrint();

		/**
		 * Storing response employee ID into empID to compare with static global
		 * employee ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");

		/** Comparing empID with stored employeeID from created employee call */
		boolean verifyingEmployeeID = empID.equalsIgnoreCase(employeeID);

		/** Asserting to verify the above condition is true */
		Assert.assertTrue(verifyingEmployeeID);
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);

		String response = getCreatedEmployeeResponse.asString();
		JsonPath js = new JsonPath(response);
		empID = js.getString("employee[0].employee_id");
		String employee_firstname = js.getString("employee[0].emp_firstname");
		String employee_middlename = js.getString("employee[0].emp_middle_name");
		String employee_lastname = js.getString("employee[0].emp_lastname");
		String employee_birthday = js.getString("employee[0].emp_birthday");
		String employee_gender = js.getString("employee[0].emp_gender");
		String employee_jobTitle = js.getString("employee[0].emp_job_title");
		String employee_status = js.getString("employee[0].emp_status");

		Assert.assertEquals(employeeID, empID);
		Assert.assertTrue(employeeID.contentEquals(empID));
		Assert.assertEquals("FirstName", employee_firstname);
		Assert.assertEquals("MiddleName1409", employee_middlename);
		Assert.assertEquals("LastName1409", employee_lastname);
		Assert.assertEquals("1985-10-15", employee_birthday);
		Assert.assertEquals("Male", employee_gender);
		Assert.assertEquals("Cloud Architect", employee_jobTitle);
		Assert.assertEquals("Employee", employee_status);
	}

//	@Test
	public void cGETallEmployees() {
		/** Preparing request to get all employees */
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);

		/** Storing response into getAllEmployeesResponse */
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");

		/** Printing the response */
//		getAllEmployeesResponse.prettyPrint();

		/** Storing response as a String */
		String response = getAllEmployeesResponse.asString();

		/**
		 * Creating object of JsonPath and passing response as a String as an argument
		 */
		JsonPath js = new JsonPath(response);

		/** Retreiving the size of the array (the number of object in the array) */
		int count = js.getInt("Employees.size()");
//		System.out.println(count);

//		for (int i = 0; i < count; i++) {
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
////			System.out.println(id);
//			if (allEmployeeIDs.contentEquals(employeeID)) {
//				System.out.println("Employee ID: " + employeeID + " is present in the body");
//				String firstNameOfEmpId = js.getString("Employees[" + i + "].emp_firstname");
//				System.out.println(firstNameOfEmpId);
//				break;
//			}
//		}

		/** for loop to print first names of all employees */
//		for(int i = 0; i <count; i++) {
//			String emp_firstname = js.getString("Employees[" + i + "].emp_firstname");
//			System.out.println(emp_firstname);
//		}

	}

//	@Test
	public void eGETUdatedEmployee() {
		/** Preparing request to get updated employee */
		RequestSpecification getUpdatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).param("employee_id", employeeID);

		/** Storing respinse in getUodatedEmployeeResponse */
		Response getUpdatedEmployeeResponse = getUpdatedEmployeeRequest.when().get("/getOneEmployee.php");

		/** Storing getUpdatedEmployeeResponse as a String */
		String response = getUpdatedEmployeeResponse.asString();

		/** Creating a JsonPath object and passing the response as an argument */
		JsonPath js = new JsonPath(response);

		/** Retreiving the employee ID from the response */
		String empID = js.getString("employee[0].employee_id");

		/** Verifying the employee ID */
		Assert.assertEquals(employeeID, empID);

		/** Retreiving the first name */
		String empFirstName = js.getString("employee[0].emp_firstname");
		Assert.assertEquals("FirstName", empFirstName);

	}

	@Test
	public void dPUTupdateCreatedEmployee() {
		/** Preparing request to update the employee */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token)
				.body("{\r\n" + "  \"employee_id\": \"" + employeeID + "\",\r\n"
						+ "  \"emp_firstname\": \"UpdatedName\",\r\n" + "  \"emp_lastname\": \"LastName1959\",\r\n"
						+ "  \"emp_middle_name\": \"MiddleName1959\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"1984-10-15\",\r\n" + "  \"emp_status\": \"Freelance\",\r\n"
						+ "  \"emp_job_title\": \"Developer\"\r\n" + "}")
				.log().all();

		/** Storing response into getCreatedEmployeeResponse */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().put("\r\n" + "/updateEmployee.php");

		/** Storing getCreatedEmployeeResponse as a String */
		String response = getCreatedEmployeeResponse.asString();

		/**
		 * Creating object of JsonPath and passing response as a String as an argument
		 */
		JsonPath js = new JsonPath(response);

		/** Retreiving the employee ID from the response */
		String empID = js.getString("employee[0].employee_id");

		/** Comparing if employee ID equels ti the employee ID after the update */
		Assert.assertEquals(employeeID, empID);

		/** Comparing if the updated first name is correct */
		String empFirstName = js.getString("employee[0].emp_firstname");
		Assert.assertEquals("UpdatedName", empFirstName);

	}
}
