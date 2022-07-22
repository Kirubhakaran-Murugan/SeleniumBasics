package Selenium;

import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.List;
import static javax.imageio.ImageIO.write;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//Select by Index
		WebElement Indexdropdown = driver.findElement(By.id("dropdown1"));

		//Object creation for Select class is the first step for dropdown operation
	
		Select select1 = new Select(Indexdropdown);
		select1.selectByIndex(2);
		Thread.sleep(2000);

		//Select by Value
		select1.selectByValue("4");
		Thread.sleep(2000);

		//Select by Visible text
		select1.selectByVisibleText("UFT/QTP");
		Thread.sleep(2000);

		//get the number of dropdown options
		List<WebElement> listofoptions = select1.getOptions();
		
		//Using get size method to get the size/count
		int options = listofoptions.size();
		System.out.println("Number of options are" + options);
		Thread.sleep(2000);	

		//Use sendkeys to select
		Indexdropdown.sendKeys("Selenium");
		Thread.sleep(2000);

		//select all the options in the dropdown
		WebElement selected = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));

		//Object creation for Select class is the first step for dropdown operation
		Select selectall = new Select(selected);
		selectall.selectByValue("1");
		selectall.selectByValue("2");
		selectall.selectByValue("3");
		selectall.selectByValue("4");
		
		//we can also use this xpath to select all the values in the dropdown
		//*[@id='contentblock']/section/div[6]/select/option

		Thread.sleep(2000);

		//Taking screenshot using Robot Class

		/*
		 * Robot robot = new Robot(); Dimension screensize =
		 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle rectangle = new
		 * Rectangle(screensize); BufferedImage source =
		 * robot.createScreenCapture(rectangle); File destination = new File(
		 * "C:\\Users\\kirubhakaran.murugan\\Pictures\\Screenshots//screenshot1.png");
		 * ImageIO.write(source, "png", destination);
		 */

		TakesScreenshot screenshot2 = (TakesScreenshot) driver;
		File source1 = screenshot2.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\kirubhakaran.murugan\\Pictures\\Screenshots\\dropdown.jpeg");
		FileHandler.copy(source1, dest1);		

		driver.quit();		
	}

}



