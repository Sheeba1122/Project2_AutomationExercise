package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolling_Pick_one {
	@FindBy(xpath="//*[@id='slider-carousel']//following::*[@class='item active']") WebElement slider;
	@FindBy(xpath="//*[contains(text(),'Full-Fledged practice website for Automation Engineers')]/ancestor::div[3]") WebElement slider1;
	
public FirefoxDriver driver;
	
	
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
		
		Scrolling_Pick_one p = PageFactory.initElements(driver, Scrolling_Pick_one.class);
		System.out.println(p.slider.getText());	//Printing all the text present in the carousel	
		System.out.println("------------------------------");
		System.out.println(p.slider1.getText()); //Printing all the text present in the carousel
		driver.close();
	}
	
}
