$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "QA UI Test Case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the google main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_is_on_the_google_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user search \"Roof Stack Yazılım\" on google",
  "keyword": "When "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_search_on_google(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selected \"https://roofstacks.com\" link from the options",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_selected_link_from_the_options(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Home Page - Roof Stacks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks to \"Career\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_clicks_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Engineering Careers - Roof Stacks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"Product\" position",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_selects_position(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Product - Roof Stacks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"Lead Product Tester\" position",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_selects_position(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Lead Product Tester - Roof Stacks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks to Send CV button",
  "keyword": "When "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_clicks_to_Send_CV_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends to \"xxx@gmail.com\" as an email address",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_sends_to_as_an_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user upload a file to send CV",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_upload_a_file_to_send_CV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks to upload button",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_user_clicks_to_upload_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the percent should be \"100%\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstacks.step_definitions.taskStepDef.the_percent_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});