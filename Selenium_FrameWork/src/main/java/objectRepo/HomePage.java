package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText  ="Log out")
	private WebElement logoutlink;
	
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	@FindBy(partialLinkText = "Books")
	private WebElement Bookslink;


	public WebElement getBookslink() {
		return Bookslink;
	
	}
	
	

}
