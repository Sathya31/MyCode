package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	@Then("verify lead is updated successfully as (.*)")
	public ViewLead verifyText(String data) {
		verifyExactText(eleFirstName, data);
		System.out.println(data+" Updated successfully");
		return this;
		
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditBtn;
	@And ("Click on Edit button")
	public EditLead clickEditBtn() {
		clickWithNoSnap(eleEditBtn);
		return new EditLead();
	}
		
		@FindBy(how=How.LINK_TEXT,using="Delete")
		private WebElement eleDeleteBtn;
		@And ("Click on Delete button")
		public MyLeads clickDeleteBtn() {
			clickWithNoSnap(eleDeleteBtn);
			return new MyLeads();
}
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFindLeadLink;

		public FindLead findLead() {
			click(eleFindLeadLink);
			return new FindLead();
		}
		
}