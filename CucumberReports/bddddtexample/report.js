$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/bddddtexample/New Feature File.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  As a user, I want to login to Cura System\n  so that I can make an appointment.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with a valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "I navigate to Cura System homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I click Make Appointment button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter username \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click Log in button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to login successfully",
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
        "John Doe",
        "ThisIsNotAPassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with a valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "I navigate to Cura System homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinition.I_navigate_to_Cura_System_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Make Appointment button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinition.I_click_makeAppointment_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username John Doe and password ThisIsNotAPassword",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinition.I_enter_valid_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Log in button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinition.I_click_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinition.I_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with an invalid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@InValid"
    }
  ]
});
formatter.step({
  "name": "I navigate to Cura System homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I click Make Appointment button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter an invalid username \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click Log in button",
  "keyword": "And "
});
formatter.step({
  "name": "I should NOT be able to login successfully",
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
        "Jane Doe",
        "ThisIsNotAPassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with an invalid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@InValid"
    }
  ]
});
formatter.step({
  "name": "I navigate to Cura System homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinition.I_navigate_to_Cura_System_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Make Appointment button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinition.I_click_makeAppointment_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter an invalid username Jane Doe and password ThisIsNotAPassword",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinition.I_enter_invalid_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Log in button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinition.I_click_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should NOT be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinition.I_login_unsuccessfully()"
});
formatter.result({
  "status": "passed"
});
});