package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/alerts";
		driver.get(url);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("alertButton"));
		button.click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		String title= driver.getTitle();
		System.out.println("Title of the page is"+title+"!");
		
		//driver.quit();

	}

}
