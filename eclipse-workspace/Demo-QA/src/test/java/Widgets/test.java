package Widgets;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test
{
	static WebDriver driver;
	public static void main(String[] args)

	{
	    driver = new FirefoxDriver();
	    driver.get("https://demoqa.com/slider");
	    driver.switchTo().frame(0);
	    slider();
	}

	public static void slider()
	{
	    WebElement slider = driver.findElement(By.id("//input[@type='range']"));
	    WebElement drag=driver.findElement(By.xpath("//div[@class='range-slider__tooltip__arrow']"));	
		Point p=drag.getLocation();
		int x=p.getX();
		int y=p.getY();
	    Actions move = new Actions(driver);
	    org.openqa.selenium.interactions.Action action  = move.dragAndDropBy(slider, ((width*25)/100), 0).build();
	    action.perform();
	    System.out.println("Slider moved");
	}
	
	

}
