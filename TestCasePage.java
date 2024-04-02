package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasePage {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCasePage() {
		TestCasePageID p = PageFactory.initElements(driver, TestCasePageID.class);
		System.out.println(p.homepage.isDisplayed() + " : " + p.homepage.getText());
		p.textcasepage.click();
		System.out.println(p.textcasepage.isDisplayed() + " : " + p.textcasepage.isEnabled() + " : " + p.textcasepage.getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
}
