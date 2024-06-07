package login;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelUtility;
import genericUtility.FileUtility;

public class Demo 
{
	public void test() throws EncryptedDocumentException, IOException
	{
//	FileUtility fLib=new FileUtility();
//	String URL=fLib.getDatafromProperty("url");
//	System.out.println(URL);
//	WebDriver driver=new ChromeDriver();
//	driver.get(URL);
//	WebElement element=driver.findElement(By.id(""));
		
		
	ExcelUtility eLib=new ExcelUtility();
	LocalDateTime date=eLib.getDateFromExcel("Register", 2, 0);
	System.out.println(date);
	}

}
