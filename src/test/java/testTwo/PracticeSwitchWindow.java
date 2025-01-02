package testTwo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		driver.switchTo().window(handle);
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handle1: driver.getWindowHandles()) {
			
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		

	}

}
