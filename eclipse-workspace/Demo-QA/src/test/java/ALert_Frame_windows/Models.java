package ALert_Frame_windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Models 
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
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='item-4'])[2]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		//org.openqa.selenium.JavascriptExecutor je=(org.openqa.selenium.JavascriptExecutor)driver;
		 //je.executeScript("window.scrollBy(0,-250)");
		}
	
      @Test(priority=0)
      public void small_Model()
      {
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	  driver.findElement(By.id("showSmallModal")).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	  String np=driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-sm']")).getText();
    	  System.out.println("Selected box is:-> "+ np);
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
    	  String yb=driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
    	  System.out.println("Dilog box message:->"+ yb);
    	  driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

      }
      
      @Test(priority=1 )
      public void Large_Model()
      {
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    	  driver.findElement(By.id("showLargeModal")).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	  String np=driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']")).getText();
    	  System.out.println("Selected box is:-> "+ np);
    	  String yb=driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	  System.out.println("Dilog box message:->"+ yb);
    	  driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

      }
      
      @AfterTest
      public void End_browsre()
      {
    	  driver.quit();
      }
	
	
}
