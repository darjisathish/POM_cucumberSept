package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksTesting5 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Projects\\SeleniumPrograms-master\\executables\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		
		driver.get("http://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[6]/div[1]/h4[2]")).click();
	   	WebElement block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]/div"));
	    List<WebElement> links=block.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    
	    for(int i=0;i<links.size();i++)
	    {
	    	System.out.println(links.get(i).getText());
	    	links.get(i).click();
	    	System.out.println(driver.getCurrentUrl());
	    	driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("html/body/div[6]/div[1]/h4[2]")).click();
		   	block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]/div"));
		    links=block.findElements(By.tagName("a"));
	    }
	    
	 }

}
