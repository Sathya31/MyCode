package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLead";
		testDescription="Merger lead and verify";
		testNodes="MergeLead";
		category="Sanity";
		authors="Sathya";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void megeLead(String Uname,String pwd,String ph1,String ph2) {
		FindLead flp = new FindLead();		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.mergeLead()
		.clickFromLeadIcon()
		.clickPhonelink()
		.enterPhoneNumber(ph1)
		.clickFindLeadBtn();
		String lID= flp.getFirstlink();
		flp.clickMergeFirstlink()
		.clickToLeadIcon()
		.clickPhonelink()
		.enterPhoneNumber(ph2)
		.clickFindLeadBtn()
		.clickMergeFirstlink()
		.clickMergeBtn()
		.findLead()
		.enterLeadID(lID)
		.clickFindLeadBtn()
		.verifyError();

	}
}
