Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Country Select with Value DE(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|DE|//div[@id='cont_80006']/label|Street name and house number|
|DE|//div[@id='cont_80008']/label|Zip/Post Code|


Scenario Outline: Country Select with Value NO(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|NO|//div[@id='cont_80006']/label|Street name and house number|
|NO|//div[@id='cont_80008']/label|Zip/Post Code|


Scenario Outline: Country Select with Value SE(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|SE|//div[@id='cont_80006']/label|Street name and house number|
|SE|//div[@id='cont_80008']/label|Zip/Post Code|


Scenario Outline: Country Select with Value GB(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|GB|//div[@id='cont_80006']/label|Street name and house number|
|GB|//div[@id='cont_80008']/label|Zip/Post Code|
