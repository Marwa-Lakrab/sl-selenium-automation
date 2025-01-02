package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demoqa.com/slider/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement slider = driver.findElement(By.id("sliderContainer"));
//		slider.click();
		actions.moveToElement(slider, 30, 0).click().build().perform();
		System.out.println("Move the slide in horizantal direction");
		
		String value = driver.findElement(By.id("sliderValue")).getAttribute("value");
		System.out.println("the value of attribute is"+value);
		
		assertEquals("74",value);
//		driver.quit();
	

	}
	

}
