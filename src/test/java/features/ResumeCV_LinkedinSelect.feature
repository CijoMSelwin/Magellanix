Feature: Open CocoCola Form 
Validate UI Opions




Scenario Outline: Resume Select Using linkedin(Positive)

Given Click Resume
Then Click Linkedin
And Switch to Second Window
Then Enter Text in linkedin Window <EnterLinkedinUrl>
Then Click LinkednSubmit
And Get Path <path> and Common Assert <AssertData>
Then Remove coverFile

Examples: 
|EnterLinkedinUrl|path|AssertData|
|www.linkedin.com/test|//div[@id='resume_filename']/span|https://www.linkedin.com/test|

Scenario Outline: Resume Select Using File(Positive)

Given Click Resume
Then Click ResumFile
And Select fileFromLocal and clickEnter<fileName>

And Get Path <path> and Common Assert <AssertData>
Then Remove coverFile

Examples: 
|fileName|path|AssertData|
|sample.pdf|//div[@id='resume_filename']/span|sample.pdf|