Feature: Country Select and Ui Verification


Background: first test case
Given Start Test Case appForm

Scenario Outline: Country Select with Value Gb-files select(Positive)

Given Select Country <CountryCode>
Then Enter magellanixFirstName <firstName>
And Enter magellanixLastName <lastName>
And Enter email <email>
And Enter phoneNumber <phoneNumber>
And enter MagellanixAddress <address>
And Enter City <city>
And enter zip <zip>
And Click Resume
And Click ResumFile
And Select fileFromLocal and clickEnter <filename>
And Select Gender <gender>
And Select personalVehicleDropdown Yes
And Select ukDrivingLicenseDropdownDropdown Yes
And Select utilisingContinousimprovementDropdown Yes
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|filename|gender|
|GB|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|sample.pdf|Male|


Scenario Outline: Country Select with Value Gb- linkedin select(Positive)

Given Select Country <CountryCode>
Then Enter magellanixFirstName <firstName>
And Enter magellanixLastName <lastName>
And Enter email <email>
And Enter phoneNumber <phoneNumber>
And enter MagellanixAddress <address>
And Enter City <city>
And enter zip <zip>
And Click Resume
Then Click Linkedin
And Switch to Second Window
Then Enter Text in linkedin Window <EnterLinkedinUrl>
Then Click LinkednSubmit
And Select Gender <gender>
And Select personalVehicleDropdown Yes
And Select ukDrivingLicenseDropdownDropdown Yes
And Select utilisingContinousimprovementDropdown Yes
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|EnterLinkedinUrl|gender|
|GB|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|linkedin.com/test|Male|


