package Widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Accordian 
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
		driver.findElement(By.xpath("(//li[@id='item-0'])[4]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		}
	
	@Test (priority=1)
	public void Select_first() throws InterruptedException
	{
		
		String xc=driver.findElement(By.xpath("//div[@id='section1Content']")).getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String xd="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		Assert.assertEquals(xd, xc, "yes it is not ok");	
		Thread.sleep(16000);
		
	}
	
	@Test (priority=2)
	public void Select_second()
	{
		org.openqa.selenium.JavascriptExecutor hn=(org.openqa.selenium.JavascriptExecutor)driver;
		hn.executeScript("window.scrollBy(0,100)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.findElement(By.xpath("//div[@id='section2Heading']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String c=driver.findElement(By.xpath("//div[@id='section2Content']")).getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String d="Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";
		Assert.assertEquals(d, c, "yes it is  not ok");	
		
	}
	
	@Test (priority=3)
	public void Select_Third()
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		org.openqa.selenium.JavascriptExecutor hn=(org.openqa.selenium.JavascriptExecutor)driver;
		hn.executeScript("window.scrollBy(0,400)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.id("section3Heading")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String w=driver.findElement(By.xpath("//div[@id='section3Content']")).getText();
		System.out.println(w);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String e="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		Assert.assertEquals(e, w, "yes it is not ok");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

	}
		
	@AfterTest
	public void End_browser()
	{
		driver.quit();
	}
	
}
