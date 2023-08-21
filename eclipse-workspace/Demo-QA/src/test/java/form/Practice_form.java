package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_form 
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
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
		Thread.sleep(4000);	
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='element-group'][2]//li")).click();		
	}
	
	@Test
	public void Student_form() throws InterruptedException
	{
		Thread.sleep(7000);
		String a="pradnya";     // name
		String b="patil";      // last name
		String c="pradnyapatil@gmail.com";      // email
		String d="3452738916";      // mobile no
		String e="Marathi,Mathamatics,History,Geographi,Hindi,Finance";      // Subject
		String f="A/P-ashish building,Vishrambag ,sangli";      // Current address
		String g="23 oct 1998";
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(a);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(b);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys(c);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(d);
		Thread.sleep(3000);
		org.openqa.selenium.JavascriptExecutor js=(org.openqa.selenium.JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)"); 		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(f);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(g);
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='gender-radio-2']"))).click().build().perform();
	
		driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[5]")).sendKeys(e);
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
	
	

}
