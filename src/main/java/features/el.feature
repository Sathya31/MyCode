Feature: Edit a Lead
#Background:
#Given Browser
#And Maximize
#And Load Url
#And Wait
@Smoke @Regression
Scenario Outline: Edit a Lead in leaftaps
And Enter User name as <uname>
And Enter Password as <pwd>
When Click on Login button
#Then Verify login success
And click on crmsfa link
And click Leads link
And click Find lead link
And click Phone tab
And Enter Phone number as <ph>
And Click Find lead button
And click on first link
And Click on Edit button
And Enter Firstname as <fName>
And Enter Lastname as <lName>
When Click on Submit button
Then verify lead is updated successfully as <fName>
Examples:
|uname|pwd|ph|fName|lName|
|DemoSalesManager|crmsfa|9|Sathya|kumari|