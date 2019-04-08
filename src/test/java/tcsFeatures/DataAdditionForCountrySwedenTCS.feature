Feature: Country Select and Ui Verification


Background: first test case
Given Start Test Case tcsForm

Scenario Outline: Country Select with Value SE - file select(Positive)

Given Select Country <CountryCode>
Then Enter magellanixFirstName <firstName>
And Enter magellanixLastName <lastName>
And Enter email <email>
And Enter phoneNumber <phoneNumber>
And Enter City <city>
And Click Resume
And Click ResumFile
And Select fileFromLocal and clickEnter <filename>
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click agreeToPersonalDataPrivacyStatementCheckBox
#And click agreeToPersonalityTestCheckBox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|filename|gender|
|SE|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|sample.pdf|Male|


Scenario Outline: Country Select with Value SE - linkedin select(Positive)

Given Select Country <CountryCode>
Then Enter magellanixFirstName <firstName>
And Enter magellanixLastName <lastName>
And Enter email <email>
And Enter phoneNumber <phoneNumber>
And Enter City <city>
And Click Resume
Then Click Linkedin
And Switch to Second Window
Then Enter Text in linkedin Window <EnterLinkedinUrl>
Then Click LinkednSubmit
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click agreeToPersonalDataPrivacyStatementCheckBox
#And click agreeToPersonalityTestCheckBox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|EnterLinkedinUrl|gender|
|SE|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|linkedin.com/test|Male|

