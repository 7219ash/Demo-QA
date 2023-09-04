package Widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tabs
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
		driver.findElement(By.xpath("(//li[@id='item-5'])[2]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	@Test(priority=0)
	public void Default_tabs() throws InterruptedException 
	{
		//Validate the default what data is displayed or not
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		boolean ro=driver.findElement(By.xpath("//a[@id='demo-tab-what']")).isDisplayed();
		Assert.assertEquals(ro, true);
		String whatdataget=driver.findElement(By.xpath("//div[@id='demo-tabpane-what']//p[@class='mt-3']")).getText();
		
	}	
	
	
		@Test(priority=1)
		public void check_Origin() throws InterruptedException
		{
			
		//cilck on the origin
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//fetch data from origin
		String Origindataget=driver.findElement(By.xpath("//div[@id='demo-tabpane-origin']//p[@class='mt-3']")).getText();
		String origindata="Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";
		//check the data 
		Assert.assertEquals(origindata, Origindataget, "origin data selected");
		
		}
		
		
         @Test(priority=2)
         public void Refresh_defaulttab()
		{
		// if refresh page default what data is showing
		driver.navigate().refresh();
		boolean ro=driver.findElement(By.xpath("//a[@id='demo-tab-what']")).isDisplayed();
		Assert.assertEquals(ro, true);
		}
		
         
		@Test(priority=3)
		public void select_use_tabs() throws InterruptedException
		{
		//click on the Use and check fetchng data is correct
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Thread.sleep(3000);
		String Usedata="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		driver.findElement(By.xpath("//a[@id='demo-tab-use']")).click();
		Thread.sleep(3000);
		String Usedataget=driver.findElement(By.xpath("//div[@id='demo-tabpane-use']//p[@class='mt-3']")).getText();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Assert.assertEquals(Usedata, Usedataget, "use data selected");
		
		}
		
		
		@Test(priority=4)
	    public void what_tab() throws InterruptedException
	    {
			driver.findElement(By.xpath("//a[@id='demo-tab-what']")).click();
			String WhatData="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
			Thread.sleep(2000);
			String whatdataget=driver.findElement(By.xpath("//div[@id='demo-tabpane-what']/p[@class='mt-3']")).getText();
			Assert.assertEquals(WhatData, whatdataget, "what data selected");
	    }
		
	
	@AfterTest
	public void End_browser()
	{
		driver.quit();
	}
	
	

}
