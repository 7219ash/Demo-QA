package Widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
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
		driver.get("https://demoqa.com/");
		Thread.sleep(4000);	
		driver.manage().window().maximize();
		Thread.sleep(3500);
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='item-3'])[3]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	

//	@Test(priority=1)
//	public static void Default_Slider() 
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(02));
//		//Get default value  of slider
//		String r=driver.findElement(By.xpath("//input[@id='sliderValue']")).getDomAttribute("value");
//		String l="25";
//        Assert.assertEquals(r, l);			
//	}
	
	@Test(priority=2)
	public void Select_slider_82() throws InterruptedException
	{
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));        
        WebElement slider = driver.findElement(By.xpath("//div[@class='range-slider__tooltip__arrow']"));
        for(int i=0;i<=30;i++){
                       act.clickAndHold(slider).perform();
                       
                        Thread.sleep(2000);
                    }
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        String bh=driver.findElement(By.xpath("//input[@id='sliderValue']")).getDomAttribute("value");
		System.out.println(bh);
		
		
	}
	
	
	@AfterTest
	public void End_browser()
	{
		driver.quit();
	}
	

}
