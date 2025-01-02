package testTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverCommand {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);

		driver.manage().window().maximize();
		
        String titlepage = driver.getTitle();
        
        int titlelenght = titlepage.length();
        System.out.println("title of the page is"+" "+titlepage);
        
        System.out.println("length of the page is"+" "+titlelenght);
        
        String actualurl = driver.getCurrentUrl();
        
        if(actualurl.equals(url)) {
        	System.out.println("Actual url is correct: URL opened");
        }
        else {
        	System.out.println("Actual url is correct: URL opened");
        }
        System.out.println("Actual URL is"+actualurl);	
        System.out.println("Expected URL is"+url);	
        
        String sourcepage = driver.getPageSource();
        
        int lenghtpagesource = sourcepage.length();
        
        System.out.println("source lenght of the source page is"+" "+lenghtpagesource);
//        driver.quit();
	}

}
