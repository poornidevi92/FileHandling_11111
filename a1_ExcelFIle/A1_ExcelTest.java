package a1_ExcelFIle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelTest {
	
	//2003-xls
	
	public static void main(String[] args) throws IOException {
		
		File f =new File("D:/Batch 253/A7_FileHandlingTest/files/sample.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Home");
		int row=sheet.getLastRowNum()+1;
		System.out.println(row);
		
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		
		
		
	}
	

}
