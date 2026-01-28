package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "Firefox";//external Configuration -xlx,csv
	public static WebDriver driver;
	//public static FirefoxDriver driver1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver is the inteface and chromedriver is the implemenatation of that interface;
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		driver.close();
		

	}

}
//Locator in the selinium  webdrivwer
//
