package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getData (String sheet, int row,int cell) throws EncryptedDocumentException, IOException  {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\SAICOM\\Desktop\\NopCom01\\NopCommerceWithDGM\\src\\test\\resources\\NopComregData.xlsx"); 
		String value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	
		return value;
	}
}
