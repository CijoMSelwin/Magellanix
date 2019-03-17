Feature: Country Select and Ui Verification



Scenario Outline: Country Select with Value Gb(Positive)

Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Assert magellanixLastName
And Assert magellanixContactEmail
And Assert magellanixCellPhone
And Assert magellanixCity
And Assert magellanixCountry
And Assert magellanixResume
And Assert magellanixCoverLetter
And Assert cust_InstrDiversityText
And Assert magellanixGender
And Assert agreeToDataPrivacyStatement
And Assert agreeToCareerOppurtunityText
And Assert agreeToPersonalDataPrivacyStatementText
And Assert agreeToPersonalityTestText




Examples: 

|CountryCode|
|PL|


