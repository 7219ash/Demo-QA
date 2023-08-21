package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Radio_Button
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
		driver.findElement(By.xpath(" //div[@class='element-list collapse show']//ul[@class='menu-list']//li[3]")).click();
	    
	}
	
	@Test(priority=1)
	public void without_selectednaybutton() throws InterruptedException
	{
	    boolean y=true;
		boolean k=false;		 
        y=driver.findElement(By.xpath("//label[@for='yesRadio']")).isSelected();
			 if(y==false)
			 {
				 y=driver.findElement(By.xpath("//label[@for='impressiveRadio']")).isSelected();
			 }
			 if(y==false)
			 {
				 y=driver.findElement(By.xpath("//label[@for='noRadio']")).isSelected();
			 }
			 
		 if(y==k)
		 {
		   System.out.println("Any button not selected");
		 }
		 else
		 {
			 System.out.println("Any button not selected");
		 }
		 Thread.sleep(6000);
	 }
	 
	@Test(priority=2)
	public void yes_radio_button() throws InterruptedException
	{
		Thread.sleep(4000);
		Actions go=new Actions(driver);
		go.moveToElement(driver.findElement(By.xpath("//input[@id='yesRadio']"))).click().build().perform();
		Thread.sleep(3500);
		System.out.println(driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected());
		Thread.sleep(4000);
	
	}
	
	
	@Test(priority=3)
	public void Immpessive_radio_button() throws InterruptedException
	{
		
		driver.findElement(By.xpath(" //div[@class='element-list collapse show']//ul[@class='menu-list']//li[3]")).click();
		
		Actions gto=new Actions(driver);
		gto.moveToElement(driver.findElement(By.xpath("//input[@id='impressiveRadio']"))).click().build().perform();
		Thread.sleep(3500);
		String result=driver.findElement(By.xpath("//span[@class='text-success']")).getText();
		System.out.println("Are you selected  "+ " "+result);
	}
	
	
	@AfterTest
	public void endbrowser()
	{
		driver.close();
	}
	
	

}
