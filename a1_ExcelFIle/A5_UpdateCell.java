package a1_ExcelFIle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5_UpdateCell {
	
		
		public static void main(String[] args) throws IOException {
			
			File f =new File("D:/Batch 253/A7_FileHandlingTest/files/blank.xlsx");
			
			FileInputStream fis= new FileInputStream(f);
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("Home");
			
			XSSFRow row=sheet.getRow(2);
			XSSFCell cell=row.getCell(0);
			cell.setCellValue("Rajapalayam");
			
			FileOutputStream fos= new FileOutputStream(f);
			workbook.write(fos);
			fos.close();
			
			
	}

}
