package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit lead and verify";
		testNodes="EditLead";
		category="Sanity";
		authors="Sathya";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String Uname,String pwd,String ph,String fname,String lname) {

		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.findLead()
		.clickPhonelink()
		.enterPhoneNumber(ph)
		.clickFindLeadBtn()
		.clickFirstlink()
		.clickEditBtn()
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickSubmit()
		.verifyText(fname);
	}
}
