Feature: Country Select with Value



Scenario Outline: Country Select with Value DE(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|DE|//div[@id='cont_80006']/label|Street name and house number|
|DE|//div[@id='cont_80008']/label|Zip/Post Code|
|NO|//div[@id='cont_80006']/label|Street name and house number|
|NO|//div[@id='cont_80008']/label|Zip/Post Code|
|SE|//div[@id='cont_80006']/label|Street name and house number|
|SE|//div[@id='cont_80008']/label|Zip/Post Code|
|GB|//div[@id='cont_80006']/label|Street name and house number|
|GB|//div[@id='cont_80008']/label|Zip/Post Code|
