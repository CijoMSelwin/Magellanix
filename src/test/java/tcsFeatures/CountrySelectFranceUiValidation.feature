Feature: Country Select as France and Ui Verification



Scenario Outline: Country Select with Value France(Positive)

Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
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
And Select utilisingContinousimprovementDropdown <contimprovementValue>
And Verify utilisingContinousimprovementlabel <contimprovementLabel>
And Verify personalVehiclerequirementlabel <pvreq>
And Select personalVehicleDropdown Yes
And Verify cleanUkDrivingLicenselabel <uklabel>
And Select ukDrivingLicenseDropdownDropdown Yes
And Assert agreeToCareerOppurtunityText
And Assert agreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|contimprovementValue|contimprovementLabel|uklabel|pvreq|
|FR|First Name|How would you describe your Gender?|Yes|Do you have previous experience of utilising Continuous Improvement to drive change?|Do you hold a valid and clean UK Driving License?|This position requires use of a personal vehicle during business hours. Are you able to meet this requirement?|

