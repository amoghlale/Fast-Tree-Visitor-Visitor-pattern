package wordCount.treesForStrings;

import wordCount.util.FileProcessorInterface;
import wordCount.visitors.Visitor;

//interface for TreeInfo
public interface TreeInfoInterface {
	public void insertTo(FileProcessorInterface fp);
	public void outputToFile();
	public void accept(Visitor visitor); 
}
