package Widgets;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.Action;

@Test
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
	 

	@Test(priority=0)
	public void Multicolour() throws AWTException, InterruptedException  
	{
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String[] arr= {"RED", "Black" ,"Yellow","Blue"};
		for(int i=0;i<arr.length;i++)
		{
		driver.findElement(By.xpath("//div[@class='auto-complete__input']/input[@id='autoCompleteMultipleInput']")).sendKeys(arr[i]);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	    Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		ro.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String fv=driver.findElement(By.xpath("//div[@class='auto-complete__input']/input[@id='autoCompleteMultipleInput']")).getText();
        System.out.println(fv);
		
        Thread.sleep(5000);
		}
		Thread.sleep(8000);
	}    
	
	
	@Test(priority=1) 
	public void sinle_color() throws AWTException, InterruptedException
	{
		
		Thread.sleep(7000);
		String r="Red";
		driver.findElement(By.id("autoCompleteSingleContainer")).click();
		driver.findElement(By.xpath("//input[@id='autoCompleteSingleInput']")).sendKeys(r);
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(2));
        Robot tx=new Robot();
        
        tx.keyPress(KeyEvent.VK_ENTER);
		tx.keyRelease(KeyEvent.VK_ENTER);
		String w=driver.findElement(By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']")).getText();
		Assert.assertEquals(w,r);	
		
	}
	    
	
	
	@AfterTest
	public void End_browser()
	{
		driver.quit();
	}

}
