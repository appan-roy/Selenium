$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/CucumberDemo.feature");
formatter.feature({
  "name": "Test OrangeHRM Login Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberDemo.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"Admin\" and valid \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberDemo.I_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberDemo.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberDemo.the_application_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Features/DataDrivenTesting.feature");
formatter.feature({
  "name": "Test OrangeHRM Login Scenario using Data Driven Approach",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Open chrome and launch application",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "close the application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin12"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Open chrome and launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenTesting.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters valid \"Admin\" and valid \"admin12\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenTesting.I_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.the_application_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Open chrome and launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenTesting.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters valid \"Admin\" and valid \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenTesting.I_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.the_application_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Open chrome and launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "DataDrivenTesting.Open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters valid \"Admin\" and valid \"admin1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataDrivenTesting.I_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTesting.the_application_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
});