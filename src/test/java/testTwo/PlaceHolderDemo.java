package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlaceHolderDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement placeholder = driver.findElement(By.id("toolTipTextField"));
		
		String text = placeholder.getAttribute("placeholder");
		System.out.println("the placeholder is"+" "+text);
		
//		driver.quit();

	}

}
