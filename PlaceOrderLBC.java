package automatioExercise;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class PlaceOrderLBC {
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
	public void loginpage() throws Exception{
		PlaceOrderLBC_ID p =PageFactory.initElements(driver, PlaceOrderLBC_ID.class);
		p.homepage.click();
		Assert.assertEquals(p.homepage.isEnabled(),true);
		p.login.click();
		FileInputStream f = new FileInputStream("F:\\AutomationTesting\\Assignments\\ProjectSelenium\\Project2\\Signin.xls");
		Workbook wb = Workbook.getWorkbook(f); 
		Sheet s = wb.getSheet("Sheet1");
		driver.findElement(By.name(s.getCell(0, 0).getContents())).sendKeys(s.getCell(1, 0).getContents());
		driver.findElement(By.name(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1, 1).getContents());
		driver.findElement(By.xpath(s.getCell(1, 2).getContents())).click();
		boolean logged;
		if(logged=true) {
			System.out.println(p.logged.isDisplayed() + " : "+ p.logged.getText() + " : " + p.logged.isEnabled());
			}
		else {
			System.out.println("Not displayed");
		}
		}
	@Test(priority=2)
	public void addTocart() {
		PlaceOrderLBC_ID p =PageFactory.initElements(driver, PlaceOrderLBC_ID.class);
		p.product1.click();
		p.viewcart.click();
		p.proceedToCheck.click();
		System.out.println(p.deliveryaddress.isDisplayed() + ":" + p.deliveryaddress.getText());
		System.out.println(p.billingaddress.isDisplayed() + ":" + p.billingaddress.getText());
		System.out.println(p.revieworder.isDisplayed() + ":" + p.revieworder.getText());
		p.message.sendKeys("Thanks");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.placeorder.click();
	}
	@Test(priority=3)
	public void paymentdetails() {
		PlaceOrderLBC_ID p =PageFactory.initElements(driver, PlaceOrderLBC_ID.class);
		p.nameOnCard.sendKeys("Shalini Deol");
		p.cardnumber.sendKeys("123456789121");
		p.cvc.sendKeys("123");
		p.expirymonth.sendKeys("02");
		p.expiryyear.sendKeys("2028");
		p.payandconfirm.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(p.orderplaced.isDisplayed() + " : " + p.orderplaced.getText() + " : " + p.orderplacedmsg.isDisplayed() + " : " + p.orderplacedmsg.getText());
		p.continu.click();
	}
	 	@Test(priority=4)
		public void deleteAccount() {
	 	PlaceOrderLBC_ID p =PageFactory.initElements(driver, PlaceOrderLBC_ID.class);
		p.delacc.click();
		boolean delact; 
		if(delact=true) {
			System.out.println(p.delact.isDisplayed() + " : " + p.delact.getText());
			}
		else {
			System.out.println("Not displayed");
		}
		p.continu.click();
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}

	
	
	
	
	
	
}
