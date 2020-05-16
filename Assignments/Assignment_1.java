package week2.day1.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.findElementById("username").sendKeys("Demosalesmanager"); // 2. Enter UserName and Password Using Id Locator
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click(); // 3. Click on Login Button using Class Locator
		driver.findElementByLinkText("CRM/SFA").click(); // 4. Click on CRM/SFA Link
		driver.findElementByLinkText("Leads").click(); // 5. Click on Leads Button
        driver.findElementByLinkText("Create Lead").click(); // 6. Click on create Lead Button
        driver.findElementById("createLeadForm_companyName").sendKeys("AtoZCompany"); // 7. Enter CompanyName using id Locator
        driver.findElementById("createLeadForm_firstName").sendKeys("Apple"); // 8. Enter FirstName using id Locator
        driver.findElementById("createLeadForm_lastName").sendKeys("Orange"); // 9. Enter LastName using id Locator
               
        // 10. Select value as Employee in Source Using SelectbyVisible text		
        WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
        Select Sourcedropdown = new Select(Source);
        Sourcedropdown.selectByVisibleText("Employee");
         
        // 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue               
        WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
        Select MarketingCampaigndropdown = new Select(MarketingCampaign);
        MarketingCampaigndropdown.selectByValue("9001");
        
        // 12. Select value as Corporation in OwnerShip field Using SelectbyIndex
        WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select Ownershipdropdown = new Select(Ownership);
        Ownershipdropdown.selectByIndex(5);      
        Thread.sleep(2000);
        
        //  13. Select value as India in Country Field Using SelectbyVisibletext
        WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select Countrydropdown = new Select(Country);
        Countrydropdown.selectByVisibleText("India");
        
        // 14. Click on create Lead Button Using name Locator
        driver.findElementByName("submitButton").click();
        
        // 15. Get the Title of the resulting Page
        // System.out.println(driver.getTitle());
        System.out.println(driver.getTitle());
	
	}

}
