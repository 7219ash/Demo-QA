package ALert_Frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browse_window 
{
	WebDriver driver;
	
	@BeforeMethod
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
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='item-0'])[3]")).click();
		
	}
	
	@Test
	public void New_tab() throws InterruptedException
	{
		String fd=driver.getCurrentUrl();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		String hg=driver.getCurrentUrl();
		System.out.println(fd);
		System.out.println(hg);
		if(fd.equals(hg))
		{
			System.out.println("new tab is not open");
		}
		else
		{
			System.out.println("New tab is open");
		}
		Thread.sleep(10000);
	}
	
	
	@Test
	public void New_window() throws InterruptedException
	{
		String jh=driver.getCurrentUrl();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		String db=driver.getCurrentUrl();
		System.out.println(jh);
		System.out.println(db);
		if(jh.equals(db))
		{
			System.out.println("new window is not open");
		}
		else
		{
			System.out.println("New window is open");
		}
		Thread.sleep(10000);		
		
	}
	
	@Test
	public void New_window_message() throws InterruptedException
	{
		String mn="Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization";
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		String sf=driver.getTitle();
		System.out.println(mn);
		System.out.println(sf);
		if(mn.equals(sf))
		{
			System.out.println("new window is open");
		}
		else
		{
			System.out.println("New window is not open");
		}
		Thread.sleep(10000);
			
	}
	
	@AfterMethod
	public void Endbrowser()
	{
		driver.quit();
	}

}
