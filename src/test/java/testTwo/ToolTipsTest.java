package testTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsTest {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://regularlabs.com/tooltips";
		driver.get(url);

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement tooltips = driver
				.findElement(By.xpath("//a[@class='modal_link mx-1 my-2 button-free rl_modals_element']"));

		actions.moveToElement(tooltips).perform();

		String text = tooltips.getAttribute("title");
		System.out.println("the title is" + " " + text);

		assertEquals("Tooltips Free", text);
	}

}
