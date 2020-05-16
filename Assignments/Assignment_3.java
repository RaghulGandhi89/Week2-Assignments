package week2.day1.Assignments;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		Thread.sleep(2000);
		
		// Click button to travel home page
		driver.findElementById("home").click();		
		
		// driver.findElementByClassName("wp-categories-icon svg-image").click();
		// Thread.sleep(2000);
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		// Find position of button (x,y)
		Point position = driver.findElementById("position").getLocation();
		System.out.println(position);
		Thread.sleep(2000);
		
		// Find button color
		// WebElement buttoncolor = driver.findElementById("color").getCssValue("background-color:lightgreen");
		String buttoncolor = driver.findElementById("color").getCssValue("background-color");		
		System.out.println(buttoncolor);
		
		// Find the height and width
		Dimension size = driver.findElementById("size").getSize();
		System.out.println(size);		

	}

}
