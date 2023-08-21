package elements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Links 
{
	
	 
		WebDriver driver;
		
		@Test (priority=1)
		public void Broken_Link() throws InterruptedException 
		{
	              
//	        System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//			ChromeOptions co=new ChromeOptions();
//			co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
//	        driver=new ChromeDriver();  
//			driver.get("https://demoqa.com/");
//			Thread.sleep(4000);	
//			driver.manage().window().maximize();
//			Thread.sleep(3500);
//			driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
//			Thread.sleep(5000);
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,500)");
//			driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-6']")).click();   // click on check box
//			Thread.sleep(5000);
//			JavascriptExecutor jy=(JavascriptExecutor)driver;
//			jy.executeScript("window.scrollBy(0,250)");
//			List<WebElement> links=driver.findElements(By.xpath("//a[2]"));
//			
//			System.out.println("Total links are "+links.size());
//			String uh=driver.findElement(By.xpath("//a[2]")).getText();
//			System.out.println();
//			
//			for(int i=0;i<links.size();i++)
//			{
//				
//				WebElement ele= links.get(i);
//				
//				String url=ele.getAttribute("href");
//				
//				verifyLinkActive(url);
//				
//			}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//			driver.quit();
//			
//		}
//				
//		@Test(priority=2)
//		public void Good_Link() throws InterruptedException
//		{
//			System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//			ChromeOptions co=new ChromeOptions();
//			co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
//	        driver=new ChromeDriver();  
//			driver.get("https://demoqa.com/");
//			Thread.sleep(4000);	
//			driver.manage().window().maximize();
//			Thread.sleep(3500);
//			driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
//			Thread.sleep(5000);
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,500)");
//			driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-6']")).click();   // click on check box
//			Thread.sleep(5000);
//			JavascriptExecutor jy=(JavascriptExecutor)driver;
//			jy.executeScript("window.scrollBy(0,250)");
//			List<WebElement> links=driver.findElements(By.xpath("//a[1]"));
//			
//			System.out.println("Total links are "+links.size());
//			String uh=driver.findElement(By.xpath("//a[1]")).getText();
//			System.out.println();
//			
//			for(int i=0;i<links.size();i++)
//			{
//				
//				WebElement ele= links.get(i);
//				
//				String url=ele.getAttribute("href");
//				
//				verifyLinkActive(url);
//				
//			}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//			driver.quit();			
//		}
//
//	
//		public static void verifyLinkActive(String linkUrl)
//		{
//	        try 
//	        {
//	           URL url = new URL(linkUrl);
//	           
//	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
//	           
//	           httpURLConnect.setConnectTimeout(3000);
//	           
//	           httpURLConnect.connect();
//	           
//	           if(httpURLConnect.getResponseCode()==200)
//	           {
//	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
//	            }
//	           else
//	           {
//	        	   System.out.println(httpURLConnect.getResponseCode());
//	           }
//	        } 
//	        catch (Exception e) 
//	        {
//	           
//	        }
//		
		}
	
		
		@Test(priority=3)
		public void Good_Image() throws InterruptedException
		{
			System.out.println("start at Test Good image check ");
			System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\app\\chrome 103.0.5060.53 driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.setBinary("D:\\Ashish\\app\\chrome 103.0.5060.53\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  	
	        driver=new ChromeDriver();  
			driver.get("https://demoqa.com/");
			Thread.sleep(4000);	
			driver.manage().window().maximize();
			Thread.sleep(3500);
			driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
			Thread.sleep(5000);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-6']")).click();   // click on check box
			Thread.sleep(5000);
			JavascriptExecutor jy=(JavascriptExecutor)driver;
			jy.executeScript("window.scrollBy(0,250)");
			Thread.sleep(7000);
			
			
//			List<WebElement> eleList= driver.findElements(By.tagName("img"));
//			for(int i=0;i<eleList.size();i++)
//			{
//				Response y= 
//				sponse responce= RestAssured
//						.given().contentType("Application/json").get(eleList.get(i).getAttribute("src"));
//				System.out.println("print the Response"+ responce.getStatusCode());
//
//				if(responce.getStatusCode()==200)
//				{
//				System.out.println("print the Response"+ responce.getStatusCode());
//				}
//				if(eleList.get(i).getAttribute("naturalwidth").equals(0))
//			    {
//			    	System.out.println(eleList.get(i).getAttribute("src")+ " is broken");
//	             }
//			    else
//			    {
//			    	System.out.println(eleList.get(i).getAttribute("src")+ " is not broken");
//			    }
//			}
		}
		
		@Test(priority=4)
		public void Broken_image()
		{
			System.out.println("Start at Test Broken link image");
			
		}
	

}
