package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement Element1 = driver.findElement(By.linkText("Go to Home Page"));
		Element1.click();
		
		Thread.sleep(3000);
		driver.navigate().back();		
		Thread.sleep(3000);	
		WebElement Element3 = driver.findElement(By.partialLinkText("Home"));
		Element3.click();
		
		driver.quit();
	}

}
