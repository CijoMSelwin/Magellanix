Feature: Mandate Fields Coke



Background: first test case
Given Start Test Case appForm

Scenario Outline: Mandate Fields Coke(Positive)

Given Verify<webElementXpath> and WebElement <webElementVerifyText>


Examples: 

|webElementXpath|webElementVerifyText|
|//div[@id='cont_80001']/label|First Name|
|//div[@id='cont_80002']/label|Last Name|
|//div[@id='cont_80003']/label|Email|
|//div[@id='cont_80004']/label|Phone Number|
|//div[@id='cont_80006']/label|Street name and house number|
|//div[@id='cont_80007']/label|City|
|//div[@id='cont_80008']/label|Zip/Post Code| 
|//div[@id='cont_80009']/label|Country| 
|//div[@id='cont_80010']/label|Resume / CV|
|//div[@id='cont_80014']/label|How would you describe your Gender?|
