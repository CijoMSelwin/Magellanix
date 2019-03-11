Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Country Select with Value SE(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|SE|//div[@id='cont_80017']/label|I consent to my personal data being added to CCEP’s group wide candidate database|
|SE|//div[@id='cont_80018']/label|I consent to be subjected to personality tests and video interviews on online platforms provided by third parties, which will pass my personal data to CCEP. |


Scenario Outline: Country Select with Value DE(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|DE|//div[@id='cont_80017']/label|I consent to my personal data being added to CCEP’s group wide candidate database|



Scenario Outline: Country Select with Value NL(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|NL|//div[@id='cont_80017']/label|I consent to my personal data being added to CCEP’s group wide candidate database|
|NL|//div[@id='cont_80019']/label|I hereby consent to my personal data being stored for 1 year.|


Scenario Outline: Country Select with Value ES(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|ES|//div[@id='cont_80017']/label|I consent to my personal data being added to CCEP’s group wide candidate database|
|ES|//div[@id='cont_80019']/label|I hereby consent to my personal data being stored for 1 year.|



Scenario Outline: Country Select with Value PT(Positive)

Given Select Country <CountryCode>
And Get Path <path> and Common Assert <AssertData>
Examples: 

|CountryCode|path|AssertData|
|PT|//div[@id='cont_80017']/label|I consent to my personal data being added to CCEP’s group wide candidate database|
|PT|//div[@id='cont_80019']/label|I hereby consent to my personal data being stored for 1 year.|