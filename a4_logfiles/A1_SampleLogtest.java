package a4_logfiles;



import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A1_SampleLogtest {
	
	public static Logger log= LoggerFactory.getLogger(A1_SampleLogtest.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("D:\\Batch 253\\A7_FileHandlingTest\\src\\a4_logfiles\\log4j.properties");
		
		log.info("I am info 2");
		log.error("am error 2");
		
		
	}

}
