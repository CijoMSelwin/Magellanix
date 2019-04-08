Feature: GenderSelect



Background: first test case
Given Start Test Case appForm

Scenario Outline: GenderSelect(Positive)

Given Select Gender <Gender>

Examples: 

|Gender|
|Female|
|Male|
|Non-binary|
|Prefer not to say|