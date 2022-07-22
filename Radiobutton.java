package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kirubhakaran.murugan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//Are you enjoying the classes?
		//yes
		WebElement Radio1 = driver.findElement(By.id("yes"));
		Radio1.click();
		
		Thread.sleep(3000);
		//Are you enjoying the classes?
		//no
		WebElement Radio2 = driver.findElement(By.id("no"));
		Radio2.click();
		
		
		//Find default selected radio button
		WebElement DefaultRadio = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));		
		Boolean Unchecked = DefaultRadio.isSelected();
		System.out.println("Unchecked is"+ Unchecked);
		Thread.sleep(3000);
		
		WebElement DefaultRadio2 = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		Boolean Checked = DefaultRadio2.isSelected();
		System.out.println("Checked is"+ Checked);
		
		//otherwise we can also use below if else if condition to check which radio button is selected
		
		/*
		 * if(DefaultRadio.isSelected()) {
		 * 
		 * System.out.println("Unchecked radio button is selected"); }else
		 * if(DefaultRadio2.isSelected()) {
		 * System.out.println("Checked radio button is selected"); }else {
		 * System.out.println("No Radio button is selected"); }
		 */
		
		//Select your age group (Only if choice wasn't selected)
		WebElement ageRadio = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
			ageRadio.click();
			Thread.sleep(3000);
			driver.quit();
	}

}
