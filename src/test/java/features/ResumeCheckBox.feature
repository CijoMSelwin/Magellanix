Feature: Resume Select CheckBox and Verify OPtions



Scenario Outline: Resume Select CheckBox and Verify OPtions(Positive)

Given Click Resume
And Get Path <path> and Common Assert <AssertData>
Examples: 

|path|AssertData|
|//a[@id='resume']|LinkedIn|
|(//a[@id='resume'])[2]|Dropbox|
|(//a[@id='input_resume'])|File|

