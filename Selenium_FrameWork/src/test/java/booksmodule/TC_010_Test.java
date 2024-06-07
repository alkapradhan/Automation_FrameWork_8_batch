package booksmodule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.HomePage;

public class TC_010_Test extends BaseClass
{
	@Test
	public void clickOnBooks()
	{
		hp=new HomePage(driver);
		hp.getBookslink().click();
		Reporter.log("Books page is displayed",true);
	}

}
