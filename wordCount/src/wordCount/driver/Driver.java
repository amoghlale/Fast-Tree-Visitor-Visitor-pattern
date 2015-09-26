package wordCount.driver;



import wordCount.treesForStrings.TreeInfo;
import wordCount.treesForStrings.TreeInfoInterface;
import wordCount.util.FileProcessor;
import wordCount.util.FileProcessorInterface;
import wordCount.util.MyLogger;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.Visitor;
import wordCount.visitors.WordCountVisitor;

public class Driver {

	public static void main(String[] args) {
		
		if((args.length) < 4) {
			System.err.println("Invalid number of Command line arguments\n");
			System.exit(1);
		
		}
		
		String inputfile=args[0];
		String outputfile=args[1];
		int number_of_iterations=Integer.parseInt(args[2]);
		MyLogger.setValue(args[3]);
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < number_of_iterations; i++) {
			FileProcessorInterface fp=new FileProcessor(inputfile,outputfile);
			Visitor p=new PopulateTreeVisitor(fp);
			Visitor w=new WordCountVisitor();
			TreeInfoInterface t=new TreeInfo();
			t.accept(p);
			t.accept(w);	
			
		}
		long finishTime = System.currentTimeMillis();
		long total_time=(finishTime-startTime)/number_of_iterations;
		System.out.println("Total time required is: "+total_time);
	}
}
