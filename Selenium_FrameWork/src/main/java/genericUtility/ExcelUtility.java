package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getStringDatafromExcel(String sheetname,int rowNum,int colNum)throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream("");
	Workbook workbook=WorkbookFactory.create(fis);
	return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();

}
	public  LocalDateTime getDateFromExcel(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("");
		Workbook workbook=WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
		}
}
