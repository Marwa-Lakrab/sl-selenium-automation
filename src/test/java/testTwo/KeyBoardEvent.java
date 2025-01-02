package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://kodingwindow.com/testapp/";
		driver.get(url);

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.name("username"));
		WebElement Password = driver.findElement(By.name("password"));

		userName.sendKeys("kodingwindow");
		userName.sendKeys(Keys.CONTROL, "a");
		userName.sendKeys(Keys.CONTROL, "c");
		Password.sendKeys(Keys.CONTROL, "v");

		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();

		String currentUrl = "https://kodingwindow.com/shubhamrdarda/?username=kodingwindow&password=kodingwindow&country=1&usertype=on&login=";
		String actualurl = driver.getCurrentUrl();
		assertEquals(currentUrl, actualurl);
		System.out.println("Location pass");

//		driver.quit();

	}

}
