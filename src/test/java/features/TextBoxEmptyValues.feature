Feature: Verify first Name entered empty




Scenario Outline: Verify first Name entered empty

Given Click magellanixFirstName
Then Enter magellanixLastName <LastName>
Then Verify Mandatory Field TextBox Validation <path>

Examples: 

|LastName|path|
||//div[@id='cont_80001']/span|



Scenario Outline: Verify last Name entered empty

Given Click magellanixLastName
Given Enter email<email>
Then Verify Mandatory Field TextBox Validation <path>
Examples: 

|email|path|
||//div[@id='cont_80002']/span|



Scenario Outline: Verify Email entered empty

Given Click Email
Given Enter phoneNumber <phoneNumber>
Then Verify Mandatory Field TextBox Validation <path>
Examples: 

|phoneNumber|path|
||//div[@id='cont_80003']/span|



Scenario Outline: Verify PhoneNumber entered empty

Given Click PhoneNumber
Given Enter City <city>
Then Verify Mandatory Field TextBox Validation <path>
Examples: 

|city|path|
||//div[@id='cont_80004']/span|


Scenario Outline: Verify city entered empty


Given Enter City <city>
Then Click PhoneNumber
Then Verify Mandatory Field TextBox Validation <path>
Examples: 

|city|path|
||//div[@id='cont_80007']/span|