package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commanFunctions.commanFunctions;
import pageObjects.loginpage_Page_Objects;

public class loginPage extends commanFunctions {

	@Test
	public void verifyloginpage() 
	{
		PageFactory.initElements(driver,loginpage_Page_Objects.class);
		loginpage_Page_Objects.username.sendKeys(properties.getProperty("username"));
		loginpage_Page_Objects.password.sendKeys(properties.getProperty("password"));
		loginpage_Page_Objects.loginbtn.click();
	}
}
