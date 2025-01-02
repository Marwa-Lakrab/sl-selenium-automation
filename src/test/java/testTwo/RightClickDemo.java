package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		// WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		// options.addArguments("--headless");
		// options.setBrowserVersion("119");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/buttons");

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		// Instantiate Actions Class
		Actions actions = new Actions(driver);

		WebElement btnRC = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnRC).perform();
		System.out.println("btn right clicked");

		String msg = driver.findElement(By.id("rightClickMessage")).getText();
		assertEquals("You have done a right click", msg);

		// driver.quit();
	}

}
