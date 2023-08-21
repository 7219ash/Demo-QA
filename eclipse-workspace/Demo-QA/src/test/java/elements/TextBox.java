package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TextBox 
{
WebDriver driver;
	
	
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
        driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(4000);	
		driver.manage().window().maximize();
		Thread.sleep(3500);
		
	}
	
	@Test
	public void tc1() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
		driver.findElement(By.xpath("//ul[@class='menu-list']/li[1]")).click();
		// fill the information in Textbox 
		String a="pradnya Patil";
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(a);     // Name
        String b="pradnya@xt.com";
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys(b);      //Email
		String c="pune";
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(c);        // current address
		String d="mumbai";
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(d);    // permanent address
		Thread.sleep(15000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"))).click().build()
		.perform();		    

	Thread.sleep(7000);
	System.out.println("---------------------hsbdjab--------");	
		
	 String w=driver.findElement(By.xpath("//p[@id='name']")).getText();
	 String z=driver.findElement(By.xpath("//p[@id='email']")).getText();
     String x=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
	 String y=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		 
	 String p=w.replace("Name:","");
	 String q=z.replace("Email:","");
	 String r=x.replace("Current Address :","");
	 String s=y.replace("Permananet Address :","");
	 
		
	  //  Check (Assert class)
      Assert.assertEquals(p, a);
      Assert.assertEquals(q, b);
      Assert.assertEquals(r, c);
      Assert.assertEquals(s, d);	
      
	}
	
	@AfterTest
	public void end()
	{
		driver.quit();
	}
	

}
