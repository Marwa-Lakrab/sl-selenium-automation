package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillData {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.fr/";
		driver.get(url);

		driver.manage().window().maximize();

		WebElement input = driver.findElement(By.id("APjFqb"));
//		input.sendKeys("Selenium");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='Selenium';", input);
		
//		WebElement btnRecherche = driver.findElement(By.name("btnK"));
//		btnRecherche.click();

		WebElement btnRecherche = driver.findElement(By.name("btnK"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", btnRecherche);
		System.out.println("searched successfully");

//		driver.quit();

	}

}
