Feature: Resume UI Mandate Validation



Background: first test case
Given Start Test Case appForm

Scenario Outline: Resume UI Mandate Validation

Given Click Resume
Then Enter email<email>
And Get Path <path> and Common Assert <AssertData>
Examples: 
|AssertData|path|email|
|Please provide this information.|//div[@id='resume_filename']/span||