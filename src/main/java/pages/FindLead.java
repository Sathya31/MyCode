package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{

	public FindLead() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhnumberlink;
	@And ("click Phone tab")
	public FindLead clickPhonelink() {
		click(elePhnumberlink);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhonenumber;
	@And ("Enter Phone number as (.*)")
	public FindLead enterPhoneNumber(String data) {
		type(elePhonenumber, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindleadBtn;
	@And ("Click Find lead button")
	public FindLead clickFindLeadBtn() {
		click(eleFindleadBtn);
		return this;
	}


	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	public WebElement eleFirstlink;
	@And ("click on first link")
	public ViewLead clickFirstlink() {
		clickWithNoSnap(eleFirstlink);
		return new ViewLead();
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	public WebElement eleMergerFirstlink;

	public MergeLead clickMergeFirstlink() {
		clickWithNoSnap(eleMergerFirstlink);
		switchToWindow(0);
		return new MergeLead();
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	public WebElement eleFirstlinktext;
	@And ("Get firstlinktext")
	public String getFirstlink() {
		String leadID = getText(eleFirstlinktext);
		return leadID;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleFirstLeadId;
	@And ("Enter FirstLeadID as (.*)")
	public String enterFirstLeadID(String data) {
		FindLead fl=new FindLead();
		WebElement lead = fl.eleFirstlinktext;
		String lID = lead.toString();
		type(eleFirstLeadId, lID);
		return lID;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadId;
	@And ("Enter LeadID as (.*)")
	public FindLead enterLeadID(String data) {
		type(eleLeadId, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyError;
	@Then ("verify lead is deleted successfully")
	public FindLead verifyError() {
		verifyExactText(eleVerifyError, "No records to display");
		return this;	
	}
	
}


