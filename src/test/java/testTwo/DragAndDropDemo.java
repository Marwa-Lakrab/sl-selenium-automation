package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/droppable/";
		driver.get(url);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		// Instantiate Actions Class
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		actions.dragAndDrop(source, target).perform();

		// Verify text changed into Dropped!
		String textTarget = target.getText();// Dropped!

		if (textTarget.equals("Dropped!")) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		assertEquals("Dropped!",textTarget);
		// driver.quit();

	}

}
