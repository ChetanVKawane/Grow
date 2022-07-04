package utilities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelData {
public static String GetExcelData(WebDriver driver,String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\ChetanK\\eclipse-workspace\\Groww\\src\\test\\resources\\Test Data.xlsx");
	String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
	//ravi kumar
}
}
