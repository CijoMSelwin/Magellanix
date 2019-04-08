Feature: Coverletter

Background: first test case
Given Start Test Case appForm

Scenario Outline: Coverletter Using File(Positive)

Given Click coverLetter
Then Select coverFile
And Select fileFromLocal and clickEnter<fileName>
And Get Path <path> and Common Assert <AssertData>
Then Remove coverFile

Examples: 
|fileName|path|AssertData|
|sample.pdf|//div[@id='cover_letter_filename']/span|sample.pdf|
|SamplemsWord.doc|//div[@id='cover_letter_filename']/span|SamplemsWord.doc|
|Sampletxt.txt|//div[@id='cover_letter_filename']/span|Sampletxt.txt|




Scenario Outline: Coverletter Using File(Negative)

Given Click coverLetter
Then Select coverFile
And Select fileFromLocal and clickEnter<fileName>
And Get Path <path> and Common Assert <AssertData>


Examples: 
|fileName|path|AssertData|
|Sample30Mb.pdf|//div[@id='cover_letter_filename']/span|File size should be less than or equal to 5MB|
|jpeg.jpg|//div[@id='cover_letter_filename']/span|jpeg.jpg Supported file types: MSWord, PDF and plain text format|