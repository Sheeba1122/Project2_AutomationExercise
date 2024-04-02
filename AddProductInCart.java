package automatioExercise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AddProductInCart extends AddProductInCart_ID {
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
	public void addProduct() {
		AddProductInCart_ID p = PageFactory.initElements(driver, AddProductInCart_ID.class);
	//	System.out.println(p.homepage.isDisplayed() + " : " + p.homepage.isEnabled() + " : " + p.homepage.getText());
		Assert.assertEquals(p.homepage.isEnabled(), true);
		p.productpage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.product1.click();
		System.out.println("Product1 added in the cart");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.continueshopping.click();
		p.product2.click();
		System.out.println("Product2 added in the cart");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.viewcart.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test(priority=2)
	public void productprice() {
		
		AddProductInCart_ID p = PageFactory.initElements(driver, AddProductInCart_ID.class);
		Assert.assertEquals(p.item1,true);
		System.out.println(p.item1);
		AssertJUnit.assertEquals(p.item2,true);
		System.out.println(p.item2);
		System.out.println(p.p1price.isDisplayed() + ": Item1 price is Displayed");
		System.out.println(p.p1quantity.isDisplayed() + ": Item2 price is Displayed");
		System.out.println(p.item1totalprice.isDisplayed() + ": Item1 quantity is Displayed");
		System.out.println(p.p2price.isDisplayed() + ": Item2 quantity is Displayed");
		System.out.println(p.p2quantity.isDisplayed() + ": Item1 totalprice is Displayed");
		System.out.println(p.item2totalprice.isDisplayed() + ": Item2 totalprice is Displayed");
		}
	
	
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
