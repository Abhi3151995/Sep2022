package Trial;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{

public static void main(String[] args) throws InterruptedException
	
	{
	
	//Launch Browser
	 System.setProperty("webdriver.chrome.driver","D:\\Automation support\\chromedriver.exe");
	 
	 
      ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//Open Application	
		driver.navigate().to("https://www.flipkart.com/");
		
		
	//Cancel Login Window
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		
	//Click on My Prfile
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElementByXPath("//*[@class='_1_3w1N']")).build().perform();
		
		driver.findElementByXPath("//*[text()='My Profile']").click();
		
	//Enter Username
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9595952980");
		
	//Enter Password
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("Abhi@3151995");
		
	//Click on Login Button	
		driver.findElementByXPath("(//*[text()='Login'])[3]").click();
	
    //Click On Manage Address
		Thread.sleep(5000);
		driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
	//Click on Add Address
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
	//Enter Adress 	
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Abhi shete");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[2]").sendKeys("8329046687");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[3]").sendKeys("414001");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[4]").sendKeys("Delhigate");
		driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("Bagroja hadko");

		driver.findElementByXPath("(//*[text()='Home'])[1]").click();
		
	//Save Address
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']").click();

	
	}
	
	
}
