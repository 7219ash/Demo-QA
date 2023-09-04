package Widgets;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class slider 
{
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		//Maximise browser window
	    driver.manage().window().maximize();
	}
		
	@Test(priority=1)
	public void Default_Slider() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(04));
		//Get default value  of slider
		String r=driver.findElement(By.xpath("//input[@id='sliderValue']")).getDomAttribute("value");
		String l="25";
        Assert.assertEquals(r, l);			
	}

	
	@Test(priority=2)
	public void uj() throws InterruptedException
	{
		    
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	                
	        //Instantiate Action Class        
	        Actions actions = new Actions(driver);
	        //Retrieve WebElemnt 'slider' to perform mouse hover 
	    	WebElement slider = driver.findElement(By.id("sliderContainer"));
	    	Thread.sleep(3000);
	    	//Move mouse to x offset 50 i.e. in horizontal direction
	    	actions.moveToElement(slider,150,0).perform();
	    	Thread.sleep(3000);
	    	slider.click();
	    	System.out.println("Moved slider in horizontal directions");
	    	Thread.sleep(4000);
	    	
	    	driver.quit();
	    	
	}
	@AfterTest
	public void End_browser()
	{
		driver.close();
	}
	

}
