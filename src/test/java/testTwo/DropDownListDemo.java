package testTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {
		  

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/select-menu";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement selectmenu = driver.findElement(By.id("oldSelectMenu"));
		Select dropdownlist = new Select(selectmenu);
		selectmenu.click();		
		
		//Select The Option By Index
//		dropdownlist.selectByIndex(5);

		//Select The Option By Value
//        dropdownlist.selectByValue("9");
		//Select The Option By Visible text
		dropdownlist.selectByVisibleText("Yellow");
		

	}

}
