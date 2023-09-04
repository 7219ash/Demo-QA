package ALert_Frame_windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Nested_frames 
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
		driver.findElement(By.xpath("(//li[@id='item-3'])[2]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		org.openqa.selenium.JavascriptExecutor je=(org.openqa.selenium.JavascriptExecutor)driver;
		 je.executeScript("window.scrollBy(0,-250)");
		}
	
	@Test (priority=1)
	public void PrentframeTochild_frame()
	{
		
//		driver.switchTo().frame("frame1");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		String yj=driver.findElement(By.xpath("//iframe[@id='frame1']/body[@xpath='1']")).getText();
//		System.out.println("pradnya=   "+yj);
//				
//		driver.switchTo().defaultContent();
		
	}
	
	@Test (priority=2)
	public void Child_To_parent()
	{
//		driver.switchTo().frame("frame2");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		String j=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")).getText();
//		System.out.println("uk is the=   "+j);
//		driver.switchTo().defaultContent();
	
		
		
		
		
		driver.switchTo().frame("frame1");

		
		
	}
	 
	
	@AfterTest
	public void Close_browser()
	{
		driver.quit();
	}
	
}
