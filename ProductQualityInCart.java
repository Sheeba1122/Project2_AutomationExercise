package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductQualityInCart {
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
	public void productQuality() {
		ProductQualityInCartID p = PageFactory.initElements(driver, ProductQualityInCartID.class);
		System.out.println(p.homepage.isDisplayed() + " : "  + p.homepage.isEnabled() + " : " + "Homepage is visible" );
		p.viewproduct.click();
		p.quantity.clear();
		p.quantity.sendKeys("4");
		p.addtocart.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	@Test(priority=2)
	public void viewCart() {
		ProductQualityInCartID p = PageFactory.initElements(driver, ProductQualityInCartID.class);
		p.viewcart.click();
		p.product1.isDisplayed();
		System.out.println("Product is Displayed : "+ p.product1.getText());
		p.displayquantity.isDisplayed();
		System.out.println("Product Quantity is : "+ p.displayquantity.getText());
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
}
