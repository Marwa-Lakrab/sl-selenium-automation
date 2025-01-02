package testTwo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait;
	private static String filePath = "C:\\Users\\marwa\\OneDrive\\Bureau\\Documents\\Proservices\\Formation automatisation des tests\\Data\\fichier.txt";
	
	@BeforeMethod
	public void setUp() {
		driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://blueimp.github.io/jQuery-File-Upload/";
//		driver.get(url);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Test
	public void robotTest() throws InterruptedException {
		// Click on add files button
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button ")).click();
		uploadFileWithRobot(filePath);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}

	// File upload by robot Class
	public void uploadFileWithRobot(String pathFile) {
		StringSelection stringSelection = new StringSelection(pathFile);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
     }
}
