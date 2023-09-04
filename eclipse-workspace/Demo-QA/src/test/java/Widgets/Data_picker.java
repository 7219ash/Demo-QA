package Widgets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data_picker
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
		driver.findElement(By.xpath("(//li[@id='item-2'])[3]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	
	
	@Test(priority=0)
	public void Select_date() throws InterruptedException, ParseException
	{
		
		
	    driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']")).click();
	    //data which we can put
	    String date="16";
		String month="December";
		String year="1997";
		
		// select the month
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		monthdropdown.click();
		Select monthpicker =new Select(monthdropdown);
		monthpicker.selectByVisibleText(month);
		
		
		
		//select the year
		driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']")).click();
	    WebElement yeardropdown=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Select years=new Select(yeardropdown);
		years.selectByVisibleText(year);
        
		
	    
	    
	    //select the date
      driver.findElement(By.xpath("//div[@class='react-datepicker__week']//div[not(contains(@class,'outside-month') ) and text()="+date+"]")).click();
      Thread.sleep(12000);
      
      
	}
	
	
	@Test(priority=1)
	public void Select_DateANDTime() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)"); 
		// Format is here Month date year Time
		
		String Date="22";
		String Month="August";
		String Year="1986";
		String Time="16:50";
		
		//Month 
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--scroll']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--scroll']/div[1]/div[text()='"+Month+"']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		
		//select year
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--scroll']")).click();
		int v=Integer.parseInt(Year);
		int k=2023-v;
		int h=k-4;
		for(int i=0;i<h;i++)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.findElement(By.xpath("//a[@class='react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous']")).click();
		}		
		driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--scroll']/div[1]/div[text()='"+Year+"']")).click();
		
		//select Date
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[not(contains(@class,'outside-month')) and text()='"+Date+"'] ")).click();
		
		// Select Time in hour
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		Thread.sleep(3000);
		WebElement io=driver.findElement(By.xpath("//div[@class='react-datepicker__time-container ']//ul[@class='react-datepicker__time-list']/li[text()='06:35']"));
		io.click();
	}
	
	
    @AfterTest
    public void End_browser()
    {
    	driver.quit();
    }
	
	
}
