package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;


//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class DmoAutomation {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver","D:\\edgedriver_win64\\msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
	
	}

}
