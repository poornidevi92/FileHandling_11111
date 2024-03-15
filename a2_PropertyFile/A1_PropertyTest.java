package a2_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class A1_PropertyTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:/Batch 253/A7_FileHandlingTest/files/env.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop= new Properties();
		prop.load(fis);	
		
		//System.out.println(prop.getProperty("Company"));
		
		Enumeration e= prop.keys();
		
		while(e.hasMoreElements()){
			//System.out.println(e.nextElement());
			
			String key =(String) e.nextElement();
			
			System.out.println(key+"-"+prop.get(key));
		}
			
	}

}
