Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Login(Positive)

Given Enter email<email>
Then Click magellanixLastName
And Get Path <path> and Common Assert <AssertData>
Examples: 

|email|AssertData|path|
|testinvalidemail|Please enter a valid email address|//div[@id='cont_80003']/span|