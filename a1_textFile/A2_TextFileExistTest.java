package a1_textFile;

import java.io.File;
import java.io.IOException;

public class A2_TextFileExistTest {
	
	public static void main(String[] args) throws IOException {
		
	//D:\Batch 253\A7_FileHandlingTest\files
		
		File f=new File("D:/Batch 253/A7_FileHandlingTest/files/sample.txt");
		
		boolean isExits=f.exists();
		
		if(isExits){
			System.out.println("Filealready created");
		}else{
		
		f.createNewFile();
		}
		
	}

}
