package testTwo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.manage().window().maximize();
		
		//Scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("refresh with succes");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
//		driver.quit();

		

	}

}
