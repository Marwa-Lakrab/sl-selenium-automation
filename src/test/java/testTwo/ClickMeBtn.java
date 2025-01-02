package testTwo;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ClickMeBtn{

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		String url = "https://demoqa.com/buttons";
		driver.get(url);

		driver.manage().window().maximize();
		
		driver.findElement(By.id("ysMzh")).click();
		
		System.out.println("btn is clicked");
		
//	
//		String msg = driver.findElement(By.id("doubleClickMessage")).getText();
//		assertEquals("You have done a double click",msg);
		
//		driver.quit();

	}

}
