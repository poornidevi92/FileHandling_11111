package a1_ExcelFIle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2_Readcelltest {
	
public static void main(String[] args) throws IOException {
		
		File f =new File("D:/Batch 253/A7_FileHandlingTest/files/sample.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Home");
		
		int rowLength= sheet.getLastRowNum()+1;
		int colLength=sheet.getRow(1).getLastCellNum();
		
		for(int RowNum=0;RowNum<rowLength;RowNum++){
			
			for(int ColNum=0;ColNum<colLength;ColNum++){
			
		
		//XSSFRow row= sheet.getRow(1);
		//XSSFCell cell = row.getCell(1);
		
		//System.out.println(sheet.getRow(1).getCell(1));
		
		String data =sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();//string
		
		System.out.print(data+"     ");
		}
	     System.out.println();
			
			
			
		}
}

}
