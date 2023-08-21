package ALert_Frame_windows;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts 
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
		driver.findElement(By.xpath("(//li[@id='item-1'])[2]")).click();		
	}
	
	
	@Test
	public void Check_Alerts() throws InterruptedException
	{
		// click button to see alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		//click on the button 5 seconds on
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(7000);
		alt.accept();
		
		
		
		//  On button click, confirm box will appear
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		alt.accept();
        String vb=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        System.out.println(vb);
		
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		alt.dismiss();
        String tb=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        System.out.println(tb);
        Thread.sleep(2000);
        
        
        
        //   On button click, prompt box will appear
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(3000);
        alt.sendKeys("Ashish");
        alt.accept();
        String yt=driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
        System.out.println(yt);		
        Thread.sleep(5000);
        
	}
	
	@AfterTest
	public void endbrowser()
	{
		driver.close();
	}
	

}
