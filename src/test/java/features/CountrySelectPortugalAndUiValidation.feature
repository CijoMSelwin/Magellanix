Feature: Country Select and Ui Verification


Background: first test case
Given Start Test Case appForm

Scenario Outline: Country Select with Value Gb(Positive)

Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel First Name
And Assert magellanixLastName
And Verify magellanixlastnameLabel Last Name
And Assert magellanixContactEmail
And Verify magellanixemailLabel Email
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Phone Number
And Assert magellanixCity
And Verify magellanixcityLabel City
And Assert magellanixCountry
And Verify magellanixcountryLabel Country
And Assert magellanixResume
And Verify magellanixresumeLabel Resume / CV
And Assert cust_InstrDiversityText
And Assert magellanixGender
And Verify magellanixgenderLabel <genderlabel>
And Select utilisingContinousimprovementDropdown Yes
And Verify utilisingContinousimprovementlabel <contimprovementLabel>
And Verify personalVehiclerequirementlabel <pvreq>
And Select personalVehicleDropdown Yes
And Verify cleanUkDrivingLicenselabel <uklabel>
And Select ukDrivingLicenseDropdownDropdown Yes
And Assert agreeToDataPrivacyStatement
And Assert agreeToCareerOppurtunityText
And Assert agreeToPersonalDataPrivacyStatementText





Examples: 

|CountryCode|genderlabel|contimprovementLabel|pvreq|uklabel|
|PT|How would you describe your Gender?|Do you have previous experience of utilising Continuous Improvement to drive change?|This position requires use of a personal vehicle during business hours. Are you able to meet this requirement?|Do you hold a valid and clean UK Driving License?|



