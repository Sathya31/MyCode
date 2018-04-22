package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	
	public MergeLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//input[@name='partyIdFrom']/following::a[1]")
	private WebElement eleFromLeadIcon;
	
	public FindLead clickFromLeadIcon() {
		clickWithNoSnap(eleFromLeadIcon);
		switchToWindow(1);
		return new FindLead();		
	}

	@FindBy(how=How.XPATH,using="//input[@name='partyIdTo']/following::a[1]")
	private WebElement eleToLeadIcon;
	
	public FindLead clickToLeadIcon() {
		clickWithNoSnap(eleToLeadIcon);
		switchToWindow(1);
		return new FindLead();		
	}

	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeBtn;
	
	public ViewLead clickMergeBtn() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		clickWithNoSnap(eleMergeBtn);
		acceptAlert();
		return new ViewLead();		
	}
	
	
	
}
