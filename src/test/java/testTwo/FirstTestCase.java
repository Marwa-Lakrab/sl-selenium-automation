package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

//import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {
		// Open Chrome Browser
		// System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Delete Cookies
		driver.manage().deleteAllCookies();

		// Open URL Swag Labs
		driver.get("https://www.saucedemo.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Fill Username
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill Password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Thread.sleep(3000);

		// Click On Login Button
		// driver.findElement(By.id("login-button")).click();

		// click On Login Button With Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnLogin;

		btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		btnLogin.click();

		// Print Log Message In The Screen
		System.out.println("Successfully authentication");

		// Check if product is display in the page
		String products = driver.findElement(By.xpath("//span[@class='title']")).getText();
//		String swag = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();

		assertEquals("Products",products);
		// Soft Assert
//		SoftAssertions softAssertions = new SoftAssertions();
//		softAssertions.assertThat("Product").isEqualTo(products);
//		softAssertions.assertThat("Swag Lab").isEqualTo(swag);

//		System.out.println("Soft Assert");
//		softAssertions.assertAll();

		// Close Browser //Kill Session
		// driver.quit();
		// driver.close();
	}

}
