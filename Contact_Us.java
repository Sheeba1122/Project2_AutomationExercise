package automatioExercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

	public class Contact_Us {
		public WebDriver driver;
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void contact_us() throws Exception, Exception {
		Contact_Us_ID p = PageFactory.initElements(driver, Contact_Us_ID.class);
		p.contactus.click();
		Assert.assertEquals(p.getintouch.isEnabled(),true);
		FileInputStream f = new FileInputStream("F:\\AutomationTesting\\Assignments\\ProjectSelenium\\Project2\\Contact_us.xls");
		Workbook wb = Workbook.getWorkbook(f); 
		Sheet s = wb.getSheet("Sheet1");
		driver.findElement(By.xpath(s.getCell(1, 0).getContents())).sendKeys(s.getCell(2, 0).getContents());
		driver.findElement(By.xpath(s.getCell(1, 1).getContents())).sendKeys(s.getCell(2, 1).getContents());
		driver.findElement(By.xpath(s.getCell(1, 2).getContents())).sendKeys(s.getCell(2, 2).getContents());
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(2, 3).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).sendKeys(s.getCell(2, 4).getContents());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(s.getCell(1, 5).getContents())).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		boolean successmsg;
		if(successmsg=true) {
			System.out.println(p.successmsg.isDisplayed() + " : " + p.successmsg.getText());
			}
		else {
			System.out.println("Not displayed");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.homepage.click();
		Assert.assertEquals(p.homepage.isEnabled(),true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
}
