package com.ama20;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class TestBase {
	
	//public static Properties config = new Properties();
	//public static Properties OR = new Properties();
	//public static FileInputStream fis;
	
     public static WebDriver driver;
     public static Logger log = Logger.getLogger("devpinoyLogger");
     
     
     @BeforeSuite
	public void Open() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
		
		
	}
	
	
	
	@AfterSuite
	public void Close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
