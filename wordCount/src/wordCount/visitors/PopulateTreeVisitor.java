package wordCount.visitors;



import wordCount.treesForStrings.TreeInfoInterface;
import wordCount.util.FileProcessorInterface;
import wordCount.util.MyLogger;



public class PopulateTreeVisitor implements Visitor {

    public FileProcessorInterface fp;
    MyLogger myLog=MyLogger.getInstance();
    
	public PopulateTreeVisitor(FileProcessorInterface fp) {
		myLog.printToStdout(2, "Parametrized Constructor of PopulateTreeVisitor called");
		this.fp=fp;
	}

	public void visit(TreeInfoInterface t) {
		    myLog.printToStdout(1, "visit of PopulateTreeVisitor called");
	        t.insertTo(fp);
	}

	 public String toString() {
		    myLog.printToStdout(1, "toString of PopulateTreeVisitor called");
		  	String retValue = "\n toString() method of MyLogger Class \n";
			return retValue;
		    }
}
