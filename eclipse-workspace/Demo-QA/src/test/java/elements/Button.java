package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class Button 
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
		driver.findElement(By.xpath("//div[@class='category-cards']/div[1]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='text'])[5]")).click();
		
	}
	
	
	
	@Test(priority=1)
	public void click_me() throws InterruptedException
	{
		Thread.sleep(3000);
//	    Actions act=new Actions(driver);
//	    Thread.sleep(4000);
		//act.moveToElement(driver.findElement(By.xpath("//button[@id='uLKNf']"))).click().perform();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
		String ed=driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
		System.out.println(ed);	
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void Right_click_me() throws InterruptedException
	{
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).contextClick().perform();
		String ty=driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
		System.out.println(ty);
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void Double_click() throws InterruptedException
	{
		Thread.sleep(4000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]")).click();
		Actions fc=new Actions(driver);
		fc.moveToElement(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).doubleClick().build().perform();
		String rd=driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		System.out.println(rd);
		Thread.sleep(5000);
		System.out.println("=======================");
	}
	
	
	@AfterTest
	public void endbrowser()
	{
		driver.quit();
	}
	
	

}