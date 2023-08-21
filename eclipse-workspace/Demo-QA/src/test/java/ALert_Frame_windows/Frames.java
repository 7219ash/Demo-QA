package ALert_Frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames 
{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(4000);	
		driver.manage().window().maximize();
		Thread.sleep(3500);
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='item-2'])[2]")).click();  
		
	}
	
//	@Test
//	public void frames() throws InterruptedException
//	{
//		String o,p;
//		org.openqa.selenium.JavascriptExecutor ms=(org.openqa.selenium.JavascriptExecutor)driver;
//		ms.executeScript("window.scrollBy(0,500)");
//        driver.switchTo().frame(1);
//        o=driver.getTitle();
//        System.out.println(o);
//        Thread.sleep(3000);
//        driver.switchTo().frame(2);
//		p=driver.getTitle();
//		System.out.println(p);
//		Thread.sleep(4000);
//		
//	
//	} 
	
	
	@Test (priority=2)
	public void Frame() throws InterruptedException
	{
		Thread.sleep(2000);
		//Switch to Frame using Index
        driver.switchTo().frame(1);
        
        //Identifying the heading in webelement
        WebElement frame1Heading= driver.findElement(By.xpath("//h1[1]"));
        
        //Finding the text of the heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading text
        System.out.println(frame1Text);
        
	}

	@AfterTest
	public void end_browser()
	{
		driver.quit();
	}
	
	
	
}
