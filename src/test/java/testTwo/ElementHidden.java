package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHidden {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			String url = "https://www.letskodeit.com/practice";
			driver.get(url);
			driver.manage().window().maximize();
			
			WebElement hidebtn = driver.findElement(By.id("hide-textbox"));
			hidebtn.click();
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			
//			WebElement hiddenfiled = driver.findElement(By.id("displayed-text"));
			executor.executeScript("document.getElementById('displayed-text').value='Selenium';");
			String value = (String) executor.executeScript("return document.getElementById('displayed-text').value");
			
			Thread.sleep(3000);
			WebElement showbtn = driver.findElement(By.id("show-textbox"));
			showbtn.click();
			System.out.println("Value Entred In Hidden Filed Value : "+value);
	}

}
