package week2.day1.Assignments;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");
        driver.findElementById("email").sendKeys("raghulgandhi89@gmail.com");
        
        driver.findElementByXPath("//input[@value='Append ']").sendKeys("After text Append", Keys.TAB);

		// driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
        driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
        driver.findElementByXPath("//input[@value='Clear me!!']").clear();
        
        //boolean fname = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
        //System.out.print(fname);
        
       boolean checkDisabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
       System.out.println(checkDisabled);
       
       if (checkDisabled)
       {
    	   System.out.println("The field is enabled");
       }
       else
    	   System.out.println("The field is disabled");
    	   	
	}

}
