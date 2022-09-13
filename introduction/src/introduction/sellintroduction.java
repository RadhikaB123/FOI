package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sellintroduction {

	public static void main (String[] args){
		
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RadhikaBhoi\\Desktop\\Test cases\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		


		//Firefox

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RadhikaBhoi\\Desktop\\Test cases\\driver\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
//
//		WebDriver driver1 = new FirefoxDriver();
		
		

		//Microsoft Edge

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\RadhikaBhoi\\Desktop\\Test cases\\driver\\edgedriver_win64\\edgedriver.exe");
//        WebDriver driver2 = new EdgeDriver();
        
        
        
		
		
        driver.get("https://www.w3schools.com/");

		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

	    driver.close();

//		driver.quit();



	}

}
