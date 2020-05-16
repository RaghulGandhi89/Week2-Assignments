package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("AtoZCompany");
		driver.findElementById("createLeadForm_firstName").sendKeys("Raghul Gandhi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Govindaswamy");
		Thread.sleep(2000);
		driver.findElementByName("submitButton").click();
		
		//Thread.sleep(2000);
		//driver.close();
		

	}

}
