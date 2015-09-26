package wordCount.visitors;


import wordCount.treesForStrings.TreeInfoInterface;
import wordCount.util.FileProcessorInterface;
import wordCount.util.MyLogger;


public class WordCountVisitor implements Visitor{
   
	public FileProcessorInterface fp;
	 MyLogger myLog=MyLogger.getInstance();
	 
	public void visit(TreeInfoInterface t) {
		 myLog.printToStdout(1, "visit of WordCountVisitor called");
		 t.outputToFile();
	}

	 public String toString() {
		    myLog.printToStdout(1, "toString of WordCountVisitor called");
		  	String retValue = "\n toString() method of MyLogger Class \n";
			return retValue;
		    }
}
