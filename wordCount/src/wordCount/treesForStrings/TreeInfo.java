package wordCount.treesForStrings;

import java.util.Map;
import java.util.TreeMap;

import wordCount.util.FileProcessorInterface;
import wordCount.util.MyLogger;
import wordCount.visitors.Visitor;

public class TreeInfo implements TreeInfoInterface{

    public FileProcessorInterface fp;
    String line=null;
    MyLogger myLog=MyLogger.getInstance();
    Map<String,Integer> words= new TreeMap<String,Integer>();
    
   	public void accept(Visitor visitor) {
   		myLog.printToStdout(1, "accept of TreeInfo called");
   		visitor.visit(this);
	}
	
	
	
	public void insertTo(FileProcessorInterface fp) {
		myLog.printToStdout(1, "insertTo of TreeInfo called");
	    this.fp=fp;	
	
		while((line = fp.readfile())!=null)
	    {
			int countTotalNodes=0;
			if((words.containsKey(line)))
			{
				countTotalNodes=words.get(line);
				countTotalNodes=countTotalNodes+1;
				words.put(line, countTotalNodes);
	      
			}
			else
			{
				words.put(line, 1); 
			}
	    }
	}
	
	public void outputToFile(){
		myLog.printToStdout(1, "outputToFile of TreeInfo called");
		int total_words=0, total_characters=0;
		myLog.printToStdout(0,"unique number of words is: "+words.entrySet().size());
	
		fp.writefile(" unique number of words is: "+ String.valueOf(words.entrySet().size()));
		for(Map.Entry<String,Integer> entry: words.entrySet()){
			  String key = entry.getKey(); 
			Integer value=entry.getValue();
			total_words=total_words+ value;
			total_characters=total_characters+ (value*key.length());
		}
		myLog.printToStdout(0,"Total words is: "+total_words);
		fp.writefile(" Total words is:"+ String.valueOf(total_words));
		
		myLog.printToStdout(0,"Total characters is : "+total_characters);
		fp.writefile(" Total characters is:"+ String.valueOf(total_characters));
	}
	
	
	 public String toString() {
		    myLog.printToStdout(1, "toString of TreeInfo called");
		  	String retValue = "\n toString() method of MyLogger Class \n";
			return retValue;
		    }
	
}
