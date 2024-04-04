package automatioExercise;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ProductPage extends ProductPage_ID {
	
	@BeforeTest
	public void launchapp() {
		System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		driver = new FirefoxDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@Test(priority=1)
	public void productpage() {
		ProductPage_ID p = PageFactory.initElements(driver, ProductPage_ID.class);
		System.out.println(p.homepage.isDisplayed() + " : "  + p.homepage.isEnabled() + " : " + "Homepage is visible" );
		p.productpage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(p.allproducts.isDisplayed() + " : " + p.allproducts.getText() + " : " + p.allproducts.isEnabled());
		
		List<WebElement> productlist = p.productlist; //driver.findElements(By.xpath("//*[@alt='ecommerce website products']/following::p"));
		
		
		for(WebElement plist : productlist) {
			System.out.println(plist.getText());
		}
	}
	@Test(priority=2)
	public void productDetails() {
		ProductPage_ID p = PageFactory.initElements(driver, ProductPage_ID.class);
		p.product1.click();
		
		System.out.println(p.productdetails.isDisplayed() + " : " + p.productdetails.getText() + " : " + "Product details visible");
		System.out.println(p.pname.isDisplayed() + " : " + p.pname.getText() + ": " + "Product name is visible");
		System.out.println(p.pcategory.isDisplayed() + " : " + p.pcategory.getText() + ": " + "Product category is visible" );
		System.out.println(p.pprice.isDisplayed() + " : " + p.pprice.getText() +  " : " + "Product price is visible");
		System.out.println(p.pavailability.isDisplayed() + " : " + p.pavailability.getText() + " : " + "Product availability");
		System.out.println(p.pconditions.isDisplayed() + " : " + p.pconditions.getText() + " : " + "Product condition");
		System.out.println(p.pbrand.isDisplayed() + " : " + p.pbrand.getText() + " : " + "Product brand visible");
		
	}
	
	@AfterTest
	public void closeApp() {
	driver.quit();
	}
}
