package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new lead and verify";
		testNodes="CreateLead";
		category="Sanity";
		authors="Sathya";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String Uname,String pwd,String cname,String fname,String lname,String vname) {
		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.createlead()
		.enterCompName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickSubmit()
		.verifyText(vname);
		//.verifyLoggedName(vName)
		//.clickLogOut();			
	}

}
