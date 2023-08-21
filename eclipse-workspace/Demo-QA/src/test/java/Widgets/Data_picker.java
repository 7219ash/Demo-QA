package Widgets;

import java.time.Duration;

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
	
	@Test
	public void Datepicker() throws InterruptedException
	{
		//driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		WebElement Rh=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));      // click on the month dropdown
		Select st=new Select(Rh);
		st.selectByIndex(9);
		Thread.sleep(2000);
		
//		WebElement hr=driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']"));                // // click on the year dropdown
//		Select mt=new Select(hr);
//		mt.selectByValue("1996");
//		driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']")).click();
		
		Thread.sleep(7500);
		
		WebElement dr=driver.findElement(By.xpath("//div[@class='react-datepicker__month']"));                // // click on the Date dropdown
		Select yc=new Select(dr);
		yc.selectByValue("18");
		Thread.sleep(9000);
		 
		
		 
		
		String as=driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).getText();
		System.out.println(as);
		
	}
	
    @AfterTest
    public void End_browser()
    {
    	driver.quit();
    }
	
	
}
