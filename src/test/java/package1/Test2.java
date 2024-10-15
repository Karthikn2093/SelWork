package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	public WebDriver driver;
	
	@BeforeClass

	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
	}

	@Test
	public void test1() throws Exception {
		
		driver.findElement(By.linkText("Element")).click();
		
		
	}


	@AfterClass
	public void tearDown() {

		driver.quit();

	}

}
