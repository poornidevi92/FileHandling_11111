package a1_textFile;

import java.io.File;
import java.io.IOException;

public class A1_TextFile {
	
	public static void main(String[] args) throws IOException {
		
	//D:\Batch 253\A7_FileHandlingTest\files
		
		File f=new File("D:/Batch 253/A7_FileHandlingTest/files/sample.txt");
		
		f.createNewFile();
		
	}

}
