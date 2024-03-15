package a1_textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

public class A6_TextFileRead {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:/Batch 253/A7_FileHandlingTest/files/read.txt");
		
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		//System.out.println(br.readLine());//data1
		//System.out.println(br.readLine());//data2
		//System.out.println(br.readLine());//space
		//System.out.println(br.readLine());//data3
		//System.out.println(br.readLine());//data4
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		
		
		String x="";
		
		while((x=br.readLine())!=null){
			System.out.println(x);
		}
	}

}
