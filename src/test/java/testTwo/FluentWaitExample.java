package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// Open Browser
		WebDriver driver = new ChromeDriver();

		// Open URL Swag Labs
		driver.get("https://www.saucedemo.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Fill Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Define Fluent Wait With WebDriver Instance And Maximum Timeout
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)) // Maximum Timeout
				.pollingEvery(Duration.ofSeconds(5)) // Polling Interval
				.ignoring(TimeoutException.class);// Exception To Ignore "Optional"

		// Define The Excepted Condition To Wait For
		// ExceptedCondition <WebElement> condition =
		// ExceptedConditions.visibilityOfElementLocated(By.id("login-button"));

		// Wait Until The Condition Is Met Or Timeout Occurs
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));

		element.click();
		System.out.println("Element Clicked Successfully");

		// Check if product is display in the page
		String products = driver.findElement(By.xpath("//span[@class='title']")).getText();

		assertEquals("Products", products);
		System.out.println("You are on the products page");

		// Kill Session
		// driver.quit();

	}

}
