package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	@And ("Enter Company name as (.*)")
	public CreateLead enterCompName(String data) {
		type(eleCompName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And ("Enter First name as (.*)")
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And ("Enter Last name as (.*)")
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;
	@When ("Click on Create Lead button")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}

}
