package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardEvent2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement fullname = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement adresse = driver.findElement(By.id("currentAddress"));
		WebElement padresse = driver.findElement(By.id("permanentAddress"));
		
		fullname.sendKeys("Marwa Lakrab");
		email.sendKeys("marwa@gmail.com");
		
		adresse.sendKeys("21 mourouj");
		adresse.sendKeys(Keys.CONTROL, "a");
		adresse.sendKeys(Keys.CONTROL, "c");
		padresse.sendKeys(Keys.CONTROL, "v");

//		WebElement btnsubmit = driver.findElement(By.id("submit"));
//		btnsubmit.click();
//		System.out.println("button clicked");
		
		//Click With JavascriptExecutor
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnsubmit);
		System.out.println("button clicked using JavascriptExecutor");
		
		String nametext = driver.findElement(By.id("name")).getText();
		assertEquals("Name:Marwa Lakrab",nametext);
		System.out.println("Verified name");
	
//		driver.quit();

	}

}
