package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RadhikaBhoi\\Desktop\\Test cases\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("radhika");
	    driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	    driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	    driver.findElement(By.cssSelector(".rest-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("radhika");
	    driver.findElement(By.cssSelector("input[type='pass']")).sendKeys("input[type*type='pass']");
	    
		
	}

}
