Feature: Country Select as France and Ui Verification


Background: first test case
Given Start Test Case tcsForm

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
And Assert agreeToCareerOppurtunityText
And Assert agreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|
|FR|First Name|
