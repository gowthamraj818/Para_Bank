package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commanFunctions.commanFunctions;
import pageObjects.applyloan_Page_Objects;

public class applyLoan extends commanFunctions{
	
	@Test
	public void applyloan()
	{
		PageFactory.initElements(driver, applyloan_Page_Objects.class);
		
		applyloan_Page_Objects.loanlink.click();
		applyloan_Page_Objects.lamount.sendKeys("5000");
		applyloan_Page_Objects.dpayment.sendKeys("500");
		applyloan_Page_Objects.clickapply.click();
		
		applyloan_Page_Objects.LogOut.click();
	}

}
