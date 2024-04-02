package automatioExercise;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search_Product {
	public WebDriver driver;
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public  void goToProductPage() {
		Search_Product_ID p = PageFactory.initElements(driver, Search_Product_ID.class);
		System.out.println(p.homepage.isDisplayed() + " : " +  p.homepage.getText());
		p.productpage.click();
		//Alert a = driver.switchTo().alert();
		//a.accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(p.allproducts.isDisplayed() + ": " + p.allproducts.getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test(priority=2)
	public void search_Product() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(200, 200);");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Search_Product_ID p = PageFactory.initElements(driver, Search_Product_ID.class);
		p.searchtextbox.sendKeys("Top");
		p.searchbtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		je.executeScript("window.scrollBy(500, 500);");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean searchedproduct;
		if(searchedproduct=true) {
			System.out.println(p.searchedproduct.isDisplayed() + ": "+ p.searchedproduct.getText());
			}
		else {
			System.out.println("Not displayed");
	
		
	}
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
