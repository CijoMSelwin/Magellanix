Feature: Country Select and Ui Verification
Background: first test case
Given Start Test Case tcsForm


Scenario Outline: Country Select with Value Gb(Positive)

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
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|city|filename|gender|
|FR|Test|Test|test@gmail.com|99999|chennai|sample.pdf|Male|









Scenario Outline: Country Select with Value Gb(Positive)

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
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|city|EnterLinkedinUrl|gender|
|FR|Test|Test|test@gmail.com|99999|chennai|www.linkedin.com/test|Male|

