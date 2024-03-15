package a1_textFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A7_HomeWorkFileTextBufferedWriter {

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
			
			//fw.write("vcentry1");
			//fw.close();
			
			BufferedWriter bw= new BufferedWriter(fw);
			
			
			for(int N=1;N<=1000;N++){
				bw.write("vcentry"+N);
				bw.newLine();
			}
				bw.close();
			
			//bw.write("vcentry1");
			//bw.newLine();
			//bw.write("vcentry2");
			//bw.newLine();
			//bw.write("vcentry3");
			//bw.newLine();
			//bw.write("vcentry4");
			//bw.newLine();
			//bw.close();
		}
}
