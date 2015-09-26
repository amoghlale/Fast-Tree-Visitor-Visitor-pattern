package wordCount.visitors;

import wordCount.treesForStrings.TreeInfoInterface;

//Interface for visit method of visitors
public interface Visitor {

	public void visit(TreeInfoInterface t);

}
