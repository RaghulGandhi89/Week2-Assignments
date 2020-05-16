package week2.day1.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		// Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Navigated to Home page");
		
		driver.findElementByXPath("//img[@alt='Link']").click();
		System.out.println("Returned to Hyperlinks page");
		
		// Find where am supposed to go without clicking me?
		
		String link = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println(link);
		
		// Verify am I broken?
		
		 String testlink = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		 // System.out.println(broken.getAttribute("href"));
		 System.out.println(testlink);
		 driver.get(testlink);
		 String output = driver.findElementByTagName("h1").getText();
		 System.out.println(output);
		 	 
		 if (output.equals("HTTP Status 404 – Not Found"))
		   {
			 System.out.println("The link broken since the response code is HTTP Status 404");
			}
		 else
		 System.out.println("The link broken is not broken");
		
		
		
		
		
			

	}

}
