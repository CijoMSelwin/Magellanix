Feature: Open CocoCola Form 
Validate UI Opions






Scenario Outline: Coverletter Using File(Positive)

Given Click coverLetter
Then Select coverFile
And Select fileFromLocal and clickEnter<fileName>

And Get Path <path> and Common Assert <AssertData>

Then Remove coverFile
Examples: 
|fileName|path|AssertData|
|sample.pdf|//div[@id='cover_letter_filename']/span|sample.pdf|