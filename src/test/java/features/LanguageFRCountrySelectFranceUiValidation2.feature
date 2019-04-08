Feature: Country Select as France and Ui Verification


Background: first test case
Given Start Test Case appForm

Scenario Outline: Country Select with Value France(Positive)

Given Select Country <CountryCode>
Then Assert magellanixFirstName
And Verify magellanixFirstNameLabel <FirstName>
And Assert magellanixLastName
And Verify magellanixlastnameLabel Nom de famille
And Assert magellanixContactEmail
And Verify magellanixemailLabel Adresse e-mail
And Assert magellanixCellPhone
And Verify magellanixphoneLabel Numéro de téléphone
And Assert magellanixCity
And Verify magellanixcityLabel Ville
And Assert magellanixCountry
And Verify magellanixcountryLabel Pays
And Assert magellanixResume
And Verify magellanixresumeLabel CV
And Assert cust_InstrDiversityText
And Assert magellanixGender
And Verify magellanixgenderLabel <genderlabel>
And Assert agreeToCareerOppurtunityText
And Assert agreeToDataPrivacyStatement


Examples: 

|CountryCode|FirstName|genderlabel|
|FR|Prénom|Quel est votre genre ?|

