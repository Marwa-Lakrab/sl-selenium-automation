package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
		
		//Instantiate Actions Class
		Actions actions = new Actions(driver);
		
		//Click On Button Double Click Me
		WebElement btnDC = driver.findElement(By.id("doubleClickBtn"));
		
		actions.doubleClick(btnDC).perform();
		System.out.println("btn double clicked");
		
	
		String msg = driver.findElement(By.id("doubleClickMessage")).getText();
		assertEquals("You have done a double click",msg);
		
//		driver.quit();

	}

}
