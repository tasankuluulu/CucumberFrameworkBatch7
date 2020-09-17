$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HW_3.feature");
formatter.feature({
  "name": "Search employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HW_3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "search using ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter employee \"\u003cID\u003e\" inside ID field",
  "keyword": "When "
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify if employee \"\u003cID\u003e\" is presented with the given employee \"\u003cFirst Name\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID",
        "First Name"
      ]
    },
    {
      "cells": [
        "19784A",
        "Anwarii sa"
      ]
    },
    {
      "cells": [
        "11539A",
        "Eliza"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.go_to_employee_list()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on WINDOWS (220f58df41b7eacd97ac8d5b3dd4ccde)] -\u003e id: menu_pim_viewEmployeeList] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-S12839G\u0027, ip: \u002710.0.1.150\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\cutte\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51183}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 220f58df41b7eacd97ac8d5b3dd4ccde\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.hrms.utils.CommonMethods.waitForClickability(CommonMethods.java:80)\r\n\tat com.hrms.utils.CommonMethods.click(CommonMethods.java:84)\r\n\tat com.hrms.stepDefinitions.HW_3StepDefinitions.go_to_employee_list(HW_3StepDefinitions.java:17)\r\n\tat ✽.go to employee list(file:///C:/Users/cutte/eclipse-workspace/CucumberFrameworkBatch7/src/test/resources/features/HW_3.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "search using ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HW_3"
    }
  ]
});
formatter.step({
  "name": "enter employee \"19784A\" inside ID field",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.enter_employee_inside_ID_field(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.click_search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify if employee \"19784A\" is presented with the given employee \"Anwarii sa\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "search using ID");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.go_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search using ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HW_3"
    }
  ]
});
formatter.step({
  "name": "enter employee \"11539A\" inside ID field",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.enter_employee_inside_ID_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.click_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if employee \"11539A\" is presented with the given employee \"Eliza\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[11539A]\u003e but was:\u003c[7618]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(HW_3StepDefinitions.java:43)\r\n\tat ✽.verify if employee \"11539A\" is presented with the given employee \"Eliza\"(file:///C:/Users/cutte/eclipse-workspace/CucumberFrameworkBatch7/src/test/resources/features/HW_3.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "search using ID");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "search using name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter employee \"\u003cFirst Name\u003e\" into First Name field",
  "keyword": "When "
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify if employee \"\u003cFirst Name\u003e\" is presented with the given employee \"\u003cID\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID",
        "First Name"
      ]
    },
    {
      "cells": [
        "19784A",
        "Anwarii sa"
      ]
    },
    {
      "cells": [
        "11539A",
        "Eliza"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.go_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search using name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HW_3"
    }
  ]
});
formatter.step({
  "name": "enter employee \"Anwarii sa\" into First Name field",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.enter_employee_into_First_Name_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.click_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if employee \"Anwarii sa\" is presented with the given employee \"19784A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Anwarii sa]\u003e but was:\u003c[7618]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(HW_3StepDefinitions.java:43)\r\n\tat ✽.verify if employee \"Anwarii sa\" is presented with the given employee \"19784A\"(file:///C:/Users/cutte/eclipse-workspace/CucumberFrameworkBatch7/src/test/resources/features/HW_3.feature:23)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", "search using name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.go_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search using name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HW_3"
    }
  ]
});
formatter.step({
  "name": "enter employee \"Eliza\" into First Name field",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.enter_employee_into_First_Name_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.click_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if employee \"Eliza\" is presented with the given employee \"11539A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Eliza]\u003e but was:\u003c[7618]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(HW_3StepDefinitions.java:43)\r\n\tat ✽.verify if employee \"Eliza\" is presented with the given employee \"11539A\"(file:///C:/Users/cutte/eclipse-workspace/CucumberFrameworkBatch7/src/test/resources/features/HW_3.feature:23)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png", "search using name");
formatter.after({
  "status": "passed"
});
});