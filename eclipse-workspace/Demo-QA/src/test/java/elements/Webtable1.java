package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Webtable1 
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
		driver.findElement(By.xpath("//div[@class='category-cards']")).click();
		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='element-group']//li[4]//span)[1]")).click();
	}
	
	@Test
	public void ADD_data_table() throws InterruptedException 
	{
		
		// In this Method We have ADD the data in webtable also update and delete the data on webtable
		
		//ADD
	   driver.findElement(By.id("addNewRecordButton")).click();
	   String p="pradnya";
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6']/input[@id='firstName']")).sendKeys(p);
	   String Q="patil";
	   Thread.sleep(2000);

	   driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6']//input[@id='lastName']")).sendKeys(Q);
	   Thread.sleep(2000);

	   String r="pradnyap@gmail.com";
	   driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//input[@id='userEmail']")).sendKeys(r);
	   Thread.sleep(2000);

	   String s="22";
	   driver.findElement(By.xpath("//div[@id='age-wrapper']//input[@id='age']")).sendKeys(s);
	   Thread.sleep(2000);

	   String t="30000";
	   driver.findElement(By.xpath("//div[@id='salary-wrapper']//input[@id='salary']")).sendKeys(t);
	   
	   Thread.sleep(2000);
	   String u="Developer";
	   driver.findElement(By.xpath("//div[@id='department-wrapper']//input[@id='department']")).sendKeys(u);
	   driver.findElement(By.xpath("//button[@id='submit']")).click();
	   Thread.sleep(5000);
	   
	   //update
	   driver.findElement(By.xpath("//div[@class='rt-tbody']/div[4]//div[@class='action-buttons']//span[@id='edit-record-4']  ")).click();
	   String yu="7867";
	   driver.findElement(By.xpath("//div[@id='salary-wrapper']//input[@id='salary']")).clear();
	   driver.findElement(By.xpath("//div[@id='salary-wrapper']//input[@id='salary']")).sendKeys(yu);
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//button[@id='submit']")).click();
	   Thread.sleep(3000);
       String j=driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group'][4]/div//div[5]")).getText();    
	   System.out.println(j);
	   System.out.println("------------------------------------------------------------------");
	  	
	   if(j==t)
	   {
		  System.out.println("Before and after putting value are same"); 
	   }
	   else
	   {
		 if(j==yu)
		 {
			System.out.println("value is putted is updated"); 
		 }
		 else
		 {
			 System.out.println("value is putted is updated");
		 }
	   }
	   
	   //delete
	   driver.findElement(By.id("searchBox")).sendKeys("pradnya");
	   Thread.sleep(3000);
	  
	   driver.findElement(By.xpath("//div[@class='action-buttons']/span[2]")).click();
	   
	   Thread.sleep(14000);
	   
	   
	   
	}
	
	@AfterTest
	public void end()
	{
	  driver.close();
	}
	

}
