package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.support.locators.RelativeLocator;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
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
		
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		//driver.findElement(By.id("user_name")).sendKeys("Testing");
		//driver.findElement(By.className("form_input")).sendKeys("standard_user");
	
		//Css selector
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		//here we can identifying the element through the xpath
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		//now we are going to use the locator by.tagname(
		//driver.findElement(By.tagName("input")).sendKeys("Testing");
		//LInktext:- Locates anchor element whose visible text mstches the search values
		//partial link:- text	Locates anchor elements whose visible text contains the search value. If multiple elements are matching, only the first one will be selected.
		//driver.findElement(By.linkText("Support Features")).click();
		driver.findElement(By.partialLinkText("Support")).click();
		//Relative Locator;
		// 1 above(), 2 below,3 toLeftOf, 4. toRightzOf,5. near
		// find Element method accept the new method withTagName() which return the relativelocator:
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.withTagName("input").above(password)).sendkeys("Testing";)
		driver.findElement(RelativeLocator.withTagName("input").below(password)).click();
		//driver.findElement(RelativeLocator.withTagName("input").above(element));



 
		 
		

	}

}
//Locator in the selinium  webdrivwer
//
