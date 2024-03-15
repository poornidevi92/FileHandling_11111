package a1_textFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A5_TextFileAppend {
	
	public static void main(String[] args) throws IOException {
		
	//D:\Batch 253\A7_FileHandlingTest\files
		
		File f=new File("D:/Batch 253/A7_FileHandlingTest/files/sample.txt");
		
		boolean isExits=f.exists();
		
		if(isExits){
			System.out.println("Filealready created");
		}else{
		
		f.createNewFile();
		}
		
		//FileWriter fw= new FileWriter(f);//flush
		
		FileWriter fw= new FileWriter(f,true);//maintain old data
		
		
		
		//fw.write("vcentry1");
		//fw.close();
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("vcentry6");
		bw.newLine();
		bw.write("vcentry7");
		bw.newLine();
		bw.write("vcentry8");
		bw.newLine();
		bw.write("vcentry9");
		bw.newLine();
		bw.close();
	}

}
