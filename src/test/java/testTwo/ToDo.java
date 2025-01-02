package testTwo;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);

		driver.get("https://todomvc.com/examples/react/dist/");

		driver.manage().window().maximize();

		driver.findElement(By.id("todo-input")).clear();
		driver.findElement(By.id("todo-input")).sendKeys("Adopter les bonnes pratiques de test");
		driver.findElement(By.id("todo-input")).sendKeys(Keys.ENTER);

		WebElement checkBox = driver.findElement(By.xpath("//input[@class='toggle']"));
		actions.moveToElement(checkBox).click().perform();

//		driver.findElement(By.xpath("//input[@class='toggle']")).click();
		driver.findElement(By.xpath("//button[@class='clear-completed']")).click();

		boolean isTheTextPresent = driver.getPageSource().contains("Adopter les bonnes pratiques de test");
		assertFalse(isTheTextPresent);
		System.out.println(isTheTextPresent);
//		driver.quit();

	}

}
