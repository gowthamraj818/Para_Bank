package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage_Page_Objects {
	
	@FindBy(xpath = "//input[@name='username']")
	public static  WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;	
	
	@FindBy(xpath = "//input[@value='Log In']")
	public static WebElement loginbtn;

}
