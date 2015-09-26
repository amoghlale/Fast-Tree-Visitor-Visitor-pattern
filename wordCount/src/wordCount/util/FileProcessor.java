package wordCount.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProcessor implements FileProcessorInterface {
    
	BufferedReader br=null;
	String inputFile;
	String outputFile;
	BufferedWriter bw=null;  
	FileWriter fw=null;
	MyLogger myLog=MyLogger.getInstance();
	
	public FileProcessor(String inputFile, String outputFile){
		 myLog.printToStdout(2, "Parametrized Constructor of FileProcessor called");
    	try {
    		this.inputFile=inputFile;
    		this.outputFile=outputFile;
			br = new BufferedReader(new FileReader(inputFile));
    	}catch(NullPointerException e){
       		System.err.println("NullPointerException");
    		System.exit(0);
		} catch (FileNotFoundException e) {
		    System.err.println("Filenotfound Exception occured");
			System.exit(0);	
	}
	
	}
	
	public String readfile(){
		 myLog.printToStdout(1, "readfile of FileProcessor called");
		try {
			 String str=br.readLine();
			 return str;
		} catch (IOException e) {
			System.out.println("IOException occured");
			System.exit(0);	
		}
		return null;
		
   }			
	
	
	public void writefile(String outData) {
		myLog.printToStdout(1, "writefile of FileProcessor called");	
		try {
				File file = new File(outputFile);
				if (!file.exists()) {
					file.createNewFile();    // check if file exists  
				} // end if condition

				fw = new FileWriter(file.getAbsoluteFile(),true);
				bw = new BufferedWriter(fw);
				bw.write(outData);
					
				
		} //end try block
		catch (IOException e) {
		
			System.err.println("IOException Error");
			System.exit(0);	
		} //end catch block
		finally{
			try {
			       
				bw.flush();
				bw.close();
				fw.close();
				br.close(); 
	} catch (IOException e) {
			System.err.println("File Cannot be closed Error");
			System.exit(0);	

			}
		}
	}
	
	
	 public String toString() {
		    myLog.printToStdout(1, "toString of FileProcessor called");
		  	String retValue = "\n toString() method of FileProcessor Class \n";
		  	return retValue;
		    }
	
	}

