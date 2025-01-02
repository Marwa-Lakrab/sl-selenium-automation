package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class VerifyColorOne {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		String url = "https://demoqa.com/buttons";
		driver.get(url);

		driver.manage().window().maximize();
		
		//Get Element Color 
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		
		System.out.println("the color is"+color);
		
		Color color1 = Color.fromString(color);//format string in object class color
		System.out.println("the color1 is"+color1);
		
		String actualcolor = color1.asHex();
		
		assertEquals("#007bff",actualcolor);
		System.out.println("the actual color is"+actualcolor);
		

	}

}
