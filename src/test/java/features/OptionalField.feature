Feature: Optional Field



Background: first test case
Given Start Test Case appForm

Scenario Outline:Optional Field(Positive)

Given Verify<webElementXpath> and WebElement <webElementVerifyText>


Examples: 

|webElementXpath|webElementVerifyText|
|//div[@id='cont_80021']/label|Hear more about career opportunities |
|//div[@id='cont_80011']/label|Cover Letter|