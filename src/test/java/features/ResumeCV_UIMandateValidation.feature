Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Login(Positive)

Given Click Resume
Then Enter email<email>
And Get Path <path> and Common Assert <AssertData>
Examples: 
|AssertData|path|email|
|Please provide this information.|//div[@id='resume_filename']/span|