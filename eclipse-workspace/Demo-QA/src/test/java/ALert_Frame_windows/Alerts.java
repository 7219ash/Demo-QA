package ALert_Frame_windows;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts 
{
   WebDriver driver;
	//completed
	@BeforeTest
	public void setup()  
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("(//li[@id='item-1'])[2]")).click();		
	}
	

	@Test (priority=0)
	public void Check_Alerts()
	{
		// click button to see alert
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	
	@Test(priority=1)
	public void five_second_button() throws InterruptedException
	{
	
		//click on the button 5 seconds on
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Thread.sleep(7000);
	    Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}	
	@Test(priority=2)
	public void confirm_box_ok()
	{
	
		//  On button click, confirm box will appear
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Alert alt=driver.switchTo().alert();
		alt.accept();
        String vb=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        System.out.println(vb);
	}
	@Test(priority=3)
	public void confirm_box_cancle()
	{
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Alert alt=driver.switchTo().alert();
		alt.dismiss();
        String tb=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        System.out.println(tb);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	} 
       
	@Test(priority=4)
	public void promtbox_send_message() throws InterruptedException
	{
	        
        //   On button click, prompt box will appear
		String n="uks";
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    Alert alt=driver.switchTo().alert();
        alt.sendKeys(n);
        Thread.sleep(5000);

        alt.accept();
        String yt=driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
        String[] hn=null;
        hn = yt.split(" ");
        Assert.assertEquals(n,hn[2]);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        
	}
	 
	@Test(priority=5)
	public void promtbox_cancle()  throws InterruptedException
	{
		//promt box click on cancle button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		String n="grt";
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    Alert alt=driver.switchTo().alert();
        alt.sendKeys(n);
        Thread.sleep(5000);
        
        alt.dismiss();
        Thread.sleep(3000);
      boolean eb=driver.findElement(By.xpath("//button[@id='promtButton']")).isDisplayed();
      System.out.println(eb);
      boolean gb=true;
      Assert.assertEquals(eb, gb);
        
    
}
	
	@AfterTest
	public void endbrowser()
	{
		driver.close();
	}
	

}
