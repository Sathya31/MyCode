Feature: Create a Lead
#Background:
#Given Browser
#And Maximize
#And Load Url
#And Wait
@Smoke
Scenario Outline: Create a Lead in leaftaps
And Enter User name as <uname>
And Enter Password as <pwd>
When Click on Login button
#Then Verify login success
And click on crmsfa link
And click Leads link
And click on CreateLeadbutton
And Enter Company name as <cName>
And Enter First name as <fName>
And Enter Last name as <lName>
When Click on Create Lead button
#Then verify lead is created successfully
Examples:
|uname|pwd|cName|fName|lName|
|DemoSalesManager|crmsfa|infy|Nayan|sharma|
|DemoSalesManager|crmsfa|FSS|Sathya|Kumari|