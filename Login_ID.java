package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_ID {

	
	@FindBy(xpath="//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a") WebElement login;
	@FindBy(name="name") WebElement name;
	@FindBy(xpath="//h2[text()='New User Signup!']//following::input[@name='email']") WebElement emailid;
	@FindBy(xpath="//*[text()='Signup']") WebElement btn;
	@FindBy(name="email") WebElement email;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//*[text()='Login']") WebElement loginbtn;
	@FindBy(id="id_gender2") WebElement title;
	@FindBy(id="days") WebElement Day;
	@FindBy(id="password") WebElement psd;
	@FindBy(id="newsletter") WebElement chk1;
	@FindBy(id="optin") WebElement chk2;
	@FindBy(id="first_name") WebElement firstname;
	@FindBy(id="last_name") WebElement lastname;
	@FindBy(id="company") WebElement company;
	@FindBy(id="address1") WebElement addrs1;
	@FindBy(id="address2") WebElement addrs2;
	@FindBy(id="state") WebElement state;
	@FindBy(id="city") WebElement city;
	@FindBy(id="zipcode") WebElement zipcode;
	@FindBy(id="mobile_number") WebElement mobnumber;
	@FindBy(xpath="//*[text()='Create Account']") WebElement createaccbtn;
	@FindBy(xpath="//*[@class='btn btn-primary']") WebElement continu;
	@FindBy(xpath="//*[@href='/delete_account']") WebElement delacc;
	@FindBy(xpath="//*[@href='/logout']") WebElement logout;
	@FindBy(xpath="//*[text()='Enter Account Information']") WebElement eai;
	@FindBy(xpath="//*[text()='Account Created!']") WebElement accc;
	@FindBy(xpath="//*[contains(@class,'fa fa-user')]") WebElement logged;
	@FindBy(xpath="//*[text()='Account Deleted!']") WebElement delact;
	@FindBy(xpath="//*[text()='Login to your account']") WebElement loginacc;
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']") WebElement msg;
	@FindBy(xpath="//*[text()='Email Address already exist!']") WebElement msg1;

}
