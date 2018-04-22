package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete lead and verify";
		testNodes="DeleteLead";
		category="Sanity";
		authors="Sathya";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String Uname,String pwd,String ph) {
		FindLead flp = new FindLead();		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.findLead()
		.clickPhonelink()
		.enterPhoneNumber(ph)
		.clickFindLeadBtn();
		String lID= flp.getFirstlink();
		flp.clickFirstlink()
		.clickDeleteBtn()
		.findLead()
		.enterLeadID(lID)
		.clickFindLeadBtn()
		.verifyError();
	}
}
