package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commanFunctions.commanFunctions;
import pageObjects.openAccount_Page_Objects;

public class openAccount extends commanFunctions
{
	@Test
	public void openaccount()
	{
		PageFactory.initElements(driver, openAccount_Page_Objects.class);
		
		openAccount_Page_Objects.openNewAccount.click();
		
		WebElement dropdown = driver.findElement(By.id("type"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("SAVINGS");
		
		openAccount_Page_Objects.Open.click();
	}

}
