package testTwo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class ExecuteLoginEdge {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement btnlogin = driver.findElement(By.id("login-button"));
		btnlogin.click();
	    System.out.println("authentication successfully");
	    
	    String products = driver.findElement(By.xpath("//span[@class='title']")).getText();
	    assertEquals("Products",products);
	    System.out.println(products);
	    System.out.println("passed to the second page");
	    
//	    driver.quit();
	}

}
