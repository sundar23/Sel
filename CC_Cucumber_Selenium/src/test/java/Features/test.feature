Feature: Validate whether user can successfully lodge a claim for policy type “Worker's Compensation”	
 
    Scenario: Verification of Login
    Given Open the Chrome browser and launch the application
    When Enter the Username and Password
    And Click the submit button and Activities page displayed
    And User provides type as Worker's Compensation,Type of claim and Loss date
    And User provides basic information of Policy, Insured details, Location details and Policy Level Coverages
    And Click Next button and Basic information page displayed 
    And User Provides the Reported By information and Injured Worker Name
    And Click Next button and Claim Information page displayed
    And User Provides the Incident details, Injured worker details,Incident location and Injury details
    And Click Next button and Save and Assign Claim page should be displayed
    And Click Finish button
    Then New Claim is saved