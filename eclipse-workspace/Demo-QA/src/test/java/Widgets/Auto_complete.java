package Widgets;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_complete 
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
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='item-1'])[3]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	@Test
	public void Multicolour() throws AWTException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("//div[@id='autoCompleteMultipleContainer']")).sendKeys("Black");
	//	driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]")).sendKeys("Black");
	//	driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Black");
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		String u=driver.findElement(By.xpath("//div[@id='autoCompleteMultipleContainer']")).getText();
		//String u=driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]")).getText();
		//String u=driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).getText();
	        
		System.out.println(u);
		
	}
	    
	
	@AfterTest
	public void End_browser()
	{
		//driver.quit();
	}

}
