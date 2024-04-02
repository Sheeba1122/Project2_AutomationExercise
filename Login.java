package automatioExercise;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;


public class Login {
	public WebDriver driver;
	
	@BeforeMethod
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
 	@Test(priority=1)
	public void registerUser() {
 		Login_ID p = PageFactory.initElements(driver, Login_ID.class);
		p.login.click();
		p.name.sendKeys("Test");
		p.emailid.sendKeys("testcheck7899@gmail.com");
		p.btn.click();
		
		boolean eai; 
		if(eai=true) {
			System.out.println(p.eai.isDisplayed() + p.eai.getText());
		}
		else {
			System.out.println("Not displayed");
		}
		p.title.click();
		p.psd.sendKeys("Test789@");
		WebElement day = driver.findElement(By.id("days"));
		Select obj1 = new Select(day);
		obj1.selectByValue("29");
		WebElement months = driver.findElement(By.id("months"));
		Select obj2 = new Select(months);
		obj2.selectByVisibleText("July");
		WebElement years = driver.findElement(By.id("years"));
		Select obj3 = new Select(years);
		obj3.selectByValue("1995");
		p.chk1.click();
		p.chk2.click();
		p.firstname.sendKeys("Check1");
		p.lastname.sendKeys("Check2");
		p.company.sendKeys("Software Testing");
		p.addrs1.sendKeys("789,near pheonix mall");
		p.addrs2.sendKeys("Street no. 5, Software Testing");
		WebElement country = driver.findElement(By.id("country"));
		Select obj4 = new Select(country);
		obj4.selectByVisibleText("India");
		p.state.sendKeys("Maharahtra");
		p.city.sendKeys("Pune");
		p.zipcode.sendKeys("411048");
		p.mobnumber.sendKeys("1234567891");
		p.createaccbtn.click();
		boolean accc;
		if(accc=true) {
			System.out.println(p.accc.isDisplayed() + " : " + p.accc.getText());
			}
		else {
			System.out.println("Not displayed");
		}
		p.continu.click();
		boolean logged;
		if(logged=true) {
			System.out.println(p.logged.isDisplayed() + " : " +p.logged.getText());
			}
		else {
			System.out.println("Not displayed");
		}
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
		
		@Test(priority=2)
		public void login_ValidUser() throws Exception {
			Login_ID p = PageFactory.initElements(driver, Login_ID.class);
			p.login.click();
			boolean loginacc;
			if(loginacc=true) {
				System.out.println(p.loginacc.isDisplayed() + " : "+ p.loginacc.getText());
				}
			else {
				System.out.println("Not displayed");
			}
			FileInputStream f = new FileInputStream("F:\\AutomationTesting\\Assignments\\ProjectSelenium\\Project2\\Signin.xls");
			Workbook wb = Workbook.getWorkbook(f); 
			Sheet s = wb.getSheet("Sheet1");
			driver.findElement(By.name(s.getCell(0, 0).getContents())).sendKeys(s.getCell(1, 0).getContents());
			driver.findElement(By.name(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1, 1).getContents());
			driver.findElement(By.xpath(s.getCell(1, 2).getContents())).click();
			boolean logged;
			if(logged=true) {
				System.out.println(p.logged.isDisplayed() + " :  "+ p.logged.isEnabled() + " : "+ p.logged.getText());
				}
			else {
				System.out.println("Not displayed");
			}
						
		}
		
		@Test(priority=3)
		public void login_InvalidUser() throws Exception {
			Login_ID p = PageFactory.initElements(driver, Login_ID.class);
			p.login.click();
			p.email.sendKeys("testcheck7891@gmail.com");
			p.password.sendKeys("Test789@");
			p.loginbtn.click();
		
		boolean msg;
		if(msg=true) {
			System.out.println(p.msg.isDisplayed() + " : " + p.msg.getText());
			}
		else {
		System.out.println("Not displayed");
		}
		driver.close();
		}
		
		@Test(priority=4)
		public void logout_User() throws Exception {
		Login_ID p = PageFactory.initElements(driver, Login_ID.class);
		p.login.click();
		boolean loginacc;
		if(loginacc=true) {
			System.out.println(p.loginacc.isDisplayed() + " : " + p.loginacc.getText());
				}
		else {
				System.out.println("Not displayed");
			}
			FileInputStream f = new FileInputStream("F:\\AutomationTesting\\Assignments\\ProjectSelenium\\Project2\\Signin.xls");
			Workbook wb = Workbook.getWorkbook(f); 
			Sheet s = wb.getSheet("Sheet1");
			driver.findElement(By.name(s.getCell(0, 0).getContents())).sendKeys(s.getCell(1, 0).getContents());
			driver.findElement(By.name(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1, 1).getContents());
			driver.findElement(By.xpath(s.getCell(1, 2).getContents())).click();
			boolean logged; 
			if(logged=true) {
				System.out.println(p.logged.isDisplayed() + " : " + p.logged.getText());
				}
			else {
				System.out.println("Not displayed");
			}
			p.logout.click();
			driver.close();
		}
	
			@Test(priority=5)
			public void registerUser_ExistingEmail() throws Exception {
			Login_ID p = PageFactory.initElements(driver, Login_ID.class);
			p.login.click();
			p.name.sendKeys("Test");
			p.emailid.sendKeys("testcheck789@gmail.com");
			p.btn.click();
			boolean msg1; 
			if(msg1=true) {
				System.out.println(p.msg1.isDisplayed() + p.msg1.getText());
				}
			else {
				System.out.println("Not displayed");
			}
			driver.close();
			}
					
			@AfterMethod
			public void closeApp() {
				driver.close();
			}
}
