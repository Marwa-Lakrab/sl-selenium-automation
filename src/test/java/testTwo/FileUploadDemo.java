package testTwo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);

		driver.manage().window().maximize();

		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		uploadfile.sendKeys("C:\\Users\\marwa\\OneDrive\\Bureau\\Documents\\Proservices\\Formation automatisation des tests\\Data\\fichier.txt");

		driver.findElement(By.id("submitbutton")).click();
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		
		boolean result = checkbox.isSelected();
		System.out.println(result);
		
		String msg = driver.findElement(By.id("res")).getText();
		assertTrue(msg.contains("has been successfully uploaded."));
		System.out.println("File Uploaded");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement actualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
//		String message = actualMessage.getText();
//		assertTrue(message.contains("has been successfully uploaded."));

//		driver.quit();
	}

}
