package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Checkbox 
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
	}
	
	@Test(priority=1)
	public void Homeselected() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();   // click on check box
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();         
		
		String str=driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).getAttribute("class");
        String d="rct-icon rct-icon-uncheck";
        if(str.equals(d))
        {
        	System.out.println("home box is not selected");
        	System.out.println("First test pass");
        }
        else
        {
        	System.out.println("home box is selected");
        	System.out.println("First test pass");

        }
		
	}
	
	@Test(priority=2)
	public void desktop_commands() throws InterruptedException
	{
		System.out.println("second test start");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click(); 
		driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']//button[@aria-label='Expand all']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='rct-title' and contains(text(),'Commands')]")).click();
		Thread.sleep(5000);
		String rf=driver.findElement(By.xpath("//label[@for='tree-node-commands']/span[1]")).getAttribute("class");
		System.out.println("After command click:"+rf);
		String yh="rct-icon rct-icon-check";
		if(rf==yh)
		{
			System.out.println("Commands is selected");
		}
		else
		{
			System.out.println("Commands is not selected");
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void select_Workspace() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Radio Button']")).click();
        driver.findElement(By.xpath("//*[text()='Check Box']")).click();
		driver.findElement(By.xpath("//button[@title='Expand all']")).click();
		driver.findElement(By.xpath("//span[text()='Angular']")).click();
		Thread.sleep(5000);
		String po=driver.findElement(By.xpath("//div[@id='result']/span[2]")).getText();
		System.out.println(" Are you selected :"+ po);
		Thread.sleep(6000);
	}
	
	@Test(priority=4)
	public void Expand_collapse_all() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']//button[@aria-label='Expand all']")).click();
		System.out.println("Expand button is enabled:"+driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']//button[@aria-label='Expand all']")).isEnabled());
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Collapse all']")).click();
		System.out.println("collapse button is enabled:"+driver.findElement(By.xpath("//button[@title='Collapse all']")).isEnabled());
		Thread.sleep(6000);
	}
	
	@AfterTest
	public void End_Browser()
	{
		driver.quit();
	}

}
