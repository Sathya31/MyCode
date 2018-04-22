package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		//Load URL
		driver.get("http:www.leaftaps.com/opentaps");
		//Enter user
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter pwd
		driver.findElementById("password").sendKeys("crmsfa");
		//Login button
		driver.findElementByClassName("decorativeSubmit").click();
		//Click crmfs link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click My lead
		driver.findElementByLinkText("Leads").click();
		//Click find lead
		driver.findElementByLinkText("Find Leads").click();
		//Enter search value in first name
		//driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("f");
		//Click on <Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		//firstname.click();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String expectedTitle="View Lead | opentaps CRM";
		if(expectedTitle.equals(pageTitle))
		{
			System.out.println("Title is as expected");
		}
		//Click on Edit button
		driver.findElementByXPath("//a[text()='Edit']").click();
		//clear and update company name
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
		//Get entered company name in string variable
		String companyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getText();
		//Click on Update<Button>
		driver.findElementByXPath("//input[@name='submitButton']").click();
		//Again click on Edit button
		driver.findElementByXPath("//a[text()='Edit']").click();
		//Get the updated company name in string variable
		String updateCompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getText();
		//Compare entered company name with updated company name
		if(companyName.equals(updateCompanyName))
		{
			System.out.println("Company name is update properly");
		}
		else
		{
			System.out.println("Not updated properly");
		}
	}



}
