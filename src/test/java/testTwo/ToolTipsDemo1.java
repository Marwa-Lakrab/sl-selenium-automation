package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsDemo1 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement tooltip = driver.findElement(By.id("toolTipButton"));

		actions.moveToElement(tooltip).perform();

	}

}
