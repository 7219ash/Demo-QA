package Widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class progressbar 
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
		driver.findElement(By.xpath("(//li[@id='item-4'])[3]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	@Test
	public void progressbar() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		String p=driver.findElement(By.xpath("//div[@id='progressBar']")).getText();
		System.out.println(p);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
         Thread.sleep(22000);
		String buttonName=driver.findElement(By.xpath("//button[@id='resetButton']")).getText();
		String j="Reset";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		if(j.equals(buttonName))
		{
			System.out.println("Start button showing");
		}
		else
		{	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

			driver.findElement(By.xpath("//button[@id='startStopButton']")).click();

			System.out.println("reset button showing");
		}
		driver.findElement(By.xpath("//button[@id='resetButton']")).click();
		Thread.sleep(7000);
		
	}
	
	
	@AfterTest
	public void End_browser()
	{
		driver.close();
	}
	

}
