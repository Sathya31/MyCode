Feature: Delete a Lead
#Background:
#Given Browser
#And Maximize
#And Load Url
#And Wait	
FindLead fl=new FindLead();
WebElement lead = fl.eleFirstlinktext;
String lID = lead.toString();
Scenario Outline: Delete a Lead in leaftaps
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
And Get firstlinktext
And click on first link
And Click on Delete button
And click Find lead link
And Enter FirstLeadID as lID
And Click Find lead button
Then verify lead is deleted successfully
Examples:
|uname|pwd|ph|fName|lName|
|DemoSalesManager|crmsfa|9|Sathya|kumari|