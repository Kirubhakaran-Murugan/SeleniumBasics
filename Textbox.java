package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class TextBox {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/Edit.html");

		//Enter email address
		WebElement Emailbox = driver.findElement(By.id("email"));
		Emailbox.sendKeys("kirubhakaran@gmail.com");
		Thread.sleep(500);

		//Appending the text 
		//when we use sendkeys in the textbox it will only append the text not override
		//incase if you want to override then clear the existing text first and then use sendkeys to pass the text
		WebElement Append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Append.sendKeys("Testing");
		Thread.sleep(500);
		
		//Retrieve the text present in the textbox		
		WebElement GetText = driver.findElement(By.name("username"));
		//here the text is present inside the attribute called value, so we are using getattribute method
		String value1 = GetText.getAttribute("value");
		System.out.println(value1);
		
		//Taking screenhost using TakesScreenshot Interface
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\kirubhakaran.murugan\\Pictures\\Screenshots//image1.png");
		org.openqa.selenium.io.FileHandler.copy(source, Destination);
		
		
		//Clear the text
		WebElement clearText = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearText.clear();
		Thread.sleep(2000);

		driver.quit();

	}
}