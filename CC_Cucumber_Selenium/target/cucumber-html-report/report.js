$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Validate whether user can successfully lodge a claim for policy type “Worker\u0027s Compensation”",
  "description": "",
  "id": "validate-whether-user-can-successfully-lodge-a-claim-for-policy-type-“worker\u0027s-compensation”",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Login",
  "description": "",
  "id": "validate-whether-user-can-successfully-lodge-a-claim-for-policy-type-“worker\u0027s-compensation”;verification-of-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Chrome browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click the submit button and Activities page displayed",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User provides type as Worker\u0027s Compensation,Type of claim and Loss date",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User provides basic information of Policy, Insured details, Location details and Policy Level Coverages",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click Next button and Basic information page displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Provides the Reported By information and Injured Worker Name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Next button and Claim Information page displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Provides the Incident details, Injured worker details,Incident location and Injury details",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click Next button and Save and Assign Claim page should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click Finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "New Claim is saved",
  "keyword": "Then "
});
formatter.match({
  "location": "test.open_the_Chrome_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 15517129977,
  "status": "passed"
});
formatter.match({
  "location": "test.enter_the_Username_and_Password()"
});
formatter.result({
  "duration": 220291016,
  "status": "passed"
});
formatter.match({
  "location": "test.click_the_submit_button()"
});
formatter.result({
  "duration": 62181608,
  "status": "passed"
});
formatter.match({
  "location": "test.user_provides_type_as_Worker_s_Compensation_Type_of_claim_and_Loss_date()"
});
formatter.result({
  "duration": 8722124096,
  "status": "passed"
});
formatter.match({
  "location": "test.user_provides_basic_information_of_Policy_Insured_details_Location_details_and_Policy_Level_Coverages()"
});
formatter.result({
  "duration": 28880498672,
  "status": "passed"
});
formatter.match({
  "location": "test.click_Next_button()"
});
formatter.result({
  "duration": 10086958975,
  "status": "passed"
});
formatter.match({
  "location": "test.user_Provides_the_Reported_By_information_and_Injured_Worker_Name()"
});
formatter.result({
  "duration": 10184686531,
  "status": "passed"
});
formatter.match({
  "location": "test.click_Next_button_and_Claim_Information_page_displayed()"
});
formatter.result({
  "duration": 5049347746,
  "status": "passed"
});
formatter.match({
  "location": "test.user_Provides_the_Incident_details_Injured_worker_details_Incident_location_and_Injury_details()"
});
formatter.result({
  "duration": 10653178229,
  "status": "passed"
});
formatter.match({
  "location": "test.click_Next_button_and_Save_and_Assign_Claim_page_should_be_displayed()"
});
formatter.result({
  "duration": 636454996,
  "status": "passed"
});
formatter.match({
  "location": "test.click_Finish_button()"
});
formatter.result({
  "duration": 5052916234,
  "status": "passed"
});
formatter.match({
  "location": "test.new_Claim_is_saved()"
});
formatter.result({
  "duration": 5080208467,
  "status": "passed"
});
});