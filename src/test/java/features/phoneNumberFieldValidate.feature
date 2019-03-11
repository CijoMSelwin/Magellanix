Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Login(Positive)

Given Enter phoneNumber <phoneNumber>
Then Click magellanixLastName
And Get Path <path> and Common Assert <AssertData>
Examples: 

|phoneNumber|AssertData|path|
|testinvalidephone|Please provide this information.|//div[@id='cont_80004']/span|