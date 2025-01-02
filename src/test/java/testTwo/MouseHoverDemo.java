package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demoqa.com/menu/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
//		WebElement menuItem2 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		WebElement menuItem2 = driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]"));
		actions.moveToElement(menuItem2).perform();
		System.out.println("Item Element is moved");
		

	}

}
