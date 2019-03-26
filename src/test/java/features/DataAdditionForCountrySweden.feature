Feature: Country Select and Ui Verification



Scenario Outline: Country Select with Value SE - file select(Positive)

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
And Select LeanManufactureExperience <lean>
And Select CommercialVehicleExperience <Cve>
And Select ManagingPeopleExperience <mpe>
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click agreeToPersonalDataPrivacyStatementCheckBox
And click agreeToPersonalityTestCheckBox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|filename|gender|lean|Cve|mpe|
|SE|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|sample.pdf|Male|Yes|Yes|Yes|


Scenario Outline: Country Select with Value SE - linkedin select(Positive)

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
And Select LeanManufactureExperience <lean>
And Select CommercialVehicleExperience <Cve>
And Select ManagingPeopleExperience <mpe>
And click agreeToDataPrivacyStatementcheckBox
And click agreeToCareerOppurtunitycheckbox
And click agreeToPersonalDataPrivacyStatementCheckBox
And click agreeToPersonalityTestCheckBox
And click Submit




Examples: 

|CountryCode|firstName|lastName|email|phoneNumber|address|city|zip|EnterLinkedinUrl|gender|lean|Cve|mpe|
|SE|Test|Test|test@gmail.com|99999|no 1 S|chennai|611011|linkedin.com/test|Male|Yes|Yes|Yes|

