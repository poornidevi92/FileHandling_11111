package a1_textFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3_FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		
	//D:\Batch 253\A7_FileHandlingTest\files
		
		File f=new File("D:/Batch 253/A7_FileHandlingTest/files/sample.txt");
		
		boolean isExits=f.exists();
		
		if(isExits){
			System.out.println("Filealready created");
		}else{
		
		f.createNewFile();
		}
		
		FileWriter fw= new FileWriter(f);
		
		fw.write("vcentry1");
		fw.close();
	}

}
