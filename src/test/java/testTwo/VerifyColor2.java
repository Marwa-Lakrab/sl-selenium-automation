package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyColor2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		String url = "https://demoqa.com/buttons";
		driver.get(url);

		driver.manage().window().maximize();
		
		//Get Element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("color");
		System.out.println("the color is"+color);
		
		String[] hexvalue = color.replace("rgba(", "").replace(")","").split(",");
		System.out.println(hexvalue);
		
		int hexvalue1 = Integer.parseInt(hexvalue[0]);
		hexvalue[1] = hexvalue[1].trim();
		System.out.println(hexvalue[1]);
		
		int hexvalue2 = Integer.parseInt(hexvalue[1]);
		hexvalue[2] = hexvalue[2].trim();
		System.out.println(hexvalue[2]);
		
		int hexvalue3 = Integer.parseInt(hexvalue[2]);
		System.out.println(hexvalue[3]);
		
		String actualcolor = String.format("#%02x%02x%02x", hexvalue1,hexvalue2,hexvalue3);
		System.out.println("Actual color is"+actualcolor);
		
		assertEquals("#ffffff",actualcolor);
		
//		driver.quit();
		
	}

}
