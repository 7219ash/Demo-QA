package elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class webtable2 
{
WebDriver driver;
	
	
	@BeforeMethod
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
	
	@Test (priority=2)
	public void row_50_select() throws InterruptedException
	{
		  // Verify that in webtable selected 50 rows count
		
	    Thread.sleep(4000);
	    Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		Thread.sleep(7000);
		act.moveToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-label='rows per page']/option[@value='50']")).click();
		Thread.sleep(4000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@role='rowgroup']"));
		System.out.println(ele.size());
		
				
	}
	
	@Test(priority=1)
	public void Row_5_select() throws InterruptedException
	{
		Thread.sleep(4000);
	    Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		Thread.sleep(7000);
		act.moveToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-label='rows per page']/option[@value='5']")).click();
		Thread.sleep(4000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@role='rowgroup']"));
		System.out.println(ele.size());
	}
	
	@Test(priority=3)
	public void Row_25_select() throws InterruptedException
	{
		Thread.sleep(4000);
	    Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		Thread.sleep(7000);
		act.moveToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-label='rows per page']/option[@value='25']")).click();
		Thread.sleep(4000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@role='rowgroup']"));
		System.out.println(ele.size());
	}
	
	@Test(priority=4)
	public void Row_100_select() throws InterruptedException
	{
		Thread.sleep(4000);
	    Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		Thread.sleep(7000);
		act.moveToElement(driver.findElement(By.xpath("//select[@aria-label='rows per page']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-label='rows per page']/option[@value='100']")).click();
		Thread.sleep(4000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@role='rowgroup']"));
		System.out.println(ele.size());
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}

		

}
