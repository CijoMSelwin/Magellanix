Feature:  Email


Background: first test case
Given Start Test Case appForm



Scenario Outline: Email(Positive)

Given Enter email<email>
Then Click magellanixLastName
And Get Path <path> and Common Assert <AssertData>
Examples: 

|email|AssertData|path|
|testinvalidemail|Please enter a valid email address|//div[@id='cont_80003']/span|