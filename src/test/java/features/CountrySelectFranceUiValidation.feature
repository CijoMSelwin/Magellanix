Feature: Country Select as France and Ui Verification



Scenario Outline: Country Select with Value France(Positive)

Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Assert magellanixLastName
And Assert magellanixContactEmail
And Assert magellanixCellPhone
And Assert magellanixCity
And Assert magellanixCountry
And Assert magellanixResume
And Assert cust_InstrDiversityText
And Assert magellanixGender
And Assert agreeToCareerOppurtunityText
And Assert agreeToDataPrivacyStatement


Examples: 

|CountryCode|
|FR|

