package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFirstName;
	@And ("Enter Firstname as (.*)")
	public EditLead enterFirstName(String data) {
		eleFirstName.clear();
		type(eleFirstName, data);
		getText(eleFirstName);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLastName;
	@And ("Enter Lastname as (.*)")
	public EditLead enterLastName(String data) {
		eleLastName.clear();
		type(eleLastName, data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;
	@When ("Click on Submit button")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}

}
