package automatioExercise;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage_ID {
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[@href='/product_details/1']") WebElement product1;
	@FindBy(xpath="//*[text()='Blue Top']") WebElement pname;
	@FindBy(xpath="//*[text()='Category: Women > Tops']") WebElement pcategory;
	@FindBy(xpath="//*[text()='Rs. 500']") WebElement pprice;
	@FindBy(xpath="//*[text()=' In Stock']") WebElement pavailability;
	@FindBy(xpath="//*[text()=' New']") WebElement pconditions;
	@FindBy(xpath="//*[text()=' Polo']") WebElement pbrand;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='All Products']") WebElement allproducts;
	@FindBy(xpath="//*[@alt='ecommerce website products']/following::p") List<WebElement> productlist;
	@FindBy(xpath="//*[text()='Blue Top']") WebElement productdetails;
}
