package Selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsValidation {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/pages/Alert.html");

		//AlertBox Click the button to display a alert box.

		WebElement AlertBox = driver.findElement(By.
				xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		AlertBox.click();

		//Alert is a default Interface in selenium which is used to handle the alerts
		//in the below operation we are actually changing the permission from driver to alertbox
		Alert alert =driver.switchTo().alert();
		
		//accept is used to click ok button
		alert.accept();


		//Click the button to display a confirm box.
		WebElement ConfirmtBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmtBox.click();
		
		//in the below operation we are actually changing the permission from driver to alertbox
		Alert confirm =driver.switchTo().alert();
		
		//dismiss is used to click cancel button
		confirm.dismiss();


		//Click the button to display a prompt box.
		WebElement PromptBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		PromptBox.click();
		Alert Prompt =driver.switchTo().alert();
		Prompt.sendKeys("Kirubha is Testing the application");
		Prompt.accept();


		//Click the button to learn line-breaks in an alert.
		WebElement linebreakBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		linebreakBox.click();
		Alert linebreak =driver.switchTo().alert();
		linebreak.accept();

		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage sourcefile = robot.createScreenCapture(rectangle);
		
		File destination = new File("C:\\Users\\kirubhakaran.murugan\\Pictures\\Screenshots\\robotsnap.jpeg");
		ImageIO.write(sourcefile, "jpeg", destination);
		
		
		driver.quit();
		

	}

}
