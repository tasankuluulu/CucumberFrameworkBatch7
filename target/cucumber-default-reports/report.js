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
  "name": "enter employee \"19784A\" inside ID field",
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
  "name": "verify if employee \"19784A\" is presented with the given employee \"Anwarii sa\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.HW_3StepDefinitions.verify_if_employee_is_presented_with_the_given_employee(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
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
  "status": "passed"
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "search using name");
formatter.after({
  "status": "passed"
});
});