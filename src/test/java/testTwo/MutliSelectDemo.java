package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MutliSelectDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demoqa.com/select-menu";
		driver.get(url);

		driver.manage().window().maximize();

		WebElement mutliselectmenu = driver.findElement(By.id("cars"));

		Select multiselect = new Select(mutliselectmenu);

		if (multiselect.isMultiple()) {
			// By Value
			multiselect.selectByValue("volvo");
			multiselect.selectByValue("opel");
			// By Index
			//multiselect.selectByIndex(1);
			//multiselect.selectByIndex(3);
			// By visible text
			//multiselect.selectByVisibleText("Saab");
			//multiselect.selectByVisibleText("Opel");

			System.out.println("Two options selected");
		} else {
			System.out.println("they options not selected");
		}

	  //driver.quit();

	}

}
