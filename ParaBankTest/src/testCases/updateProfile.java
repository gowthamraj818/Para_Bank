package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commanFunctions.commanFunctions;
import pageObjects.updateProfile_Page_Objects;

public class updateProfile extends commanFunctions {

	@Test
	public void updateprofile() 
	{
		PageFactory.initElements(driver, updateProfile_Page_Objects.class);	

		updateProfile_Page_Objects.updatelink.click();
		updateProfile_Page_Objects.fname.sendKeys(properties.getProperty("fname"));
		updateProfile_Page_Objects.lname.sendKeys(properties.getProperty("lname"));
		updateProfile_Page_Objects.address.sendKeys(properties.getProperty("address"));
		updateProfile_Page_Objects.city.sendKeys(properties.getProperty("city"));
		updateProfile_Page_Objects.state.sendKeys(properties.getProperty("state"));
		updateProfile_Page_Objects.zipcode.sendKeys(properties.getProperty("zipcode"));
		updateProfile_Page_Objects.phone.sendKeys(properties.getProperty("phone"));
		updateProfile_Page_Objects.updatebtn.click();
	}
}