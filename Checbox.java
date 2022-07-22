package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		
		//Select the languages that you know?
		
		WebElement javabox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		WebElement sqlbox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		
	
		//Confirm Selenium is checked
		
		WebElement seleniumbox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		
		if(seleniumbox.isSelected()) {
			
			System.out.println("seleniumbox is selected");
		}
		
		//DeSelect only checked checkbox

		WebElement Notselected = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		
		WebElement Selected = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		
		if(Notselected.isSelected()) {
			Notselected.click();
		}else
		{
			Selected.click();
		}
		
		
		//Select all the checkboxes
		
		WebElement allelement1 = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[4]/input"));
		allelement1.click();
		Thread.sleep(3000);
		driver.close();
	}

}

