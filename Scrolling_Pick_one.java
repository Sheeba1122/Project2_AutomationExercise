package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolling_Pick_one {
	
	
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
	public void pickOneItem(){
		
		Scrolling_Pick_oneID p = PageFactory.initElements(driver, Scrolling_Pick_oneID.class);
		System.out.println(p.slider.getText());	//Printing all the text present in the carousel	
		System.out.println("------------------------------");
		System.out.println(p.slider1.getText()); //Printing all the text present in the carousel
		driver.close();
	}
	
}
