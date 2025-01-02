package testTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		
//		driver.findElement(By.name("username")).clear();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		String usernametext = username.getAttribute("name");
		username.clear();
		username.sendKeys("Admin");
		

		WebElement Pwd = driver.findElement(By.name("password"));
		String pwdtxt = Pwd.getAttribute("placeholder");
		Pwd.clear();
		Pwd.sendKeys("admin123");
		
	    System.out.println(usernametext);
	    System.out.println(pwdtxt);
	    
	    //Dimension ==> Height / Width
	    Dimension dimension = username.getSize();
	    System.out.println("Height : "+dimension.height);
	    System.out.println("Width : "+dimension.width);
	    
	    //Point ==> X, Y
	    Point point = Pwd.getLocation();
	    System.out.println("X coordinate : "+point.x);
	    System.out.println("Y coordinate : "+point.y);
	    
	    WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));

	    
	    //Verifier si le boutton est affiché vrai / faux
	    boolean result = loginbtn.isDisplayed();
	    System.out.println(result);
	    
	    //Vérifier si le boutton est activé vrai/ faux
	    boolean result1 = loginbtn.isEnabled();	
	    System.out.println(result1);
	    
	    //Vérifier si le boutton existe
	    List<WebElement> login = driver.findElements(By.xpath("//button[@type='submit']"));
	    if(login.size() != 0) {
	    	System.out.println("The button exist");
	    }
	    else {
	    	System.out.println("The button doesnt exist");
	    }
	
//		driver.quit();

	}

}
