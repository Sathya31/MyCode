package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadLink;
	@And ("click on CreateLeadbutton")
	public CreateLead createlead() {
		click(eleCreateLeadLink);
		return new CreateLead();

	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadLink;
	@And ("click Find lead link")
	public FindLead findLead() {
		click(eleFindLeadLink);
		return new FindLead();
	}

		@FindBy(how=How.LINK_TEXT,using="Merge Leads")
		private WebElement eleMergeLeadLink;
		
		public MergeLead mergeLead() {
			click(eleMergeLeadLink);
			return new MergeLead();

		}

	}
