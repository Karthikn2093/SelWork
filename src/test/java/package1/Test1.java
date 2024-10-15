package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public WebDriver driver;

	@BeforeClass

	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

	@Test(enabled = false)
	public void test1() throws Exception {

		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		dropdown.selectByIndex(2);

		String text = dropdown.getFirstSelectedOption().getText();
		System.out.println(text);

		Thread.sleep(3000);
	}

	@Test
	public void test2() throws Exception {

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);
	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}

}
