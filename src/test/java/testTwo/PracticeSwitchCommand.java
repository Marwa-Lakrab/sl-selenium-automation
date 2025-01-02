package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PracticeSwitchCommand {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Switching The Frame By Id
		driver.switchTo().frame("a077aa5e");
		System.out.println("Were are Swtiching to the frame");
		
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		System.out.println("Image is clicked");
		
		driver.switchTo().defaultContent();
		
		WebElement email = driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("marwalakrab@gmail.com");
		System.out.println("successufly switched back to the main page email add");
		
//		driver.close();
//		driver.quit();
	}

}
