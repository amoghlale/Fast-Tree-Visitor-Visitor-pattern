CS542 Design Patterns
Spring 2015
PROJECT <3> README FILE

Due Date: <Wednesday, April 22, 2015>
Submission Date: <April 22, 2015>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <Lale Amogh Pramod> 
e-mail(s): <alale1@binghamton.edu> 

PURPOSE:
[
  My Assignment tries to successfully implement the Visitor pattern having 2 
  visitors to insert words into the tree and populate a tree and to also calculate 
  number of unique words,total words and number of characters. I have used TreeMap 
  data structure for this process.   
]

PERCENT COMPLETE:
[
  I believe I have completed 100% of this assignment. My judgement is based 
  on the fact that my code is working for all test cases. 
]

PARTS THAT ARE NOT COMPLETE:
[
  I believe everything is complete.
]

BUGS:

[
  None
]

FILES:

[

Included with this project are 6 class files ad 3 interfaces:
Class files-
Driver.java the main file associated with the program also contains main
TreeInfo.java the file having the data structure to insert nodes into the tree.  
FileProcessor.java -the file to read from an input file and write to an output file
MyLogger.java the file to validate command line arguments and print to standard output method
PopulateTreeVisitor.java the file that inserts words as nodes into the tree.
WordCountVisitor.java the file to calculate total number of words, number of unique words and character count

Interface-
TreeInfoInterface.java file having methods to insert into tree and print to output file
FileProcessorInterface.java file having methods to read from and write to file
Visitor.java file having visit method 

README.txt the text file you are presently reading
]

SAMPLE OUTPUT:

[

amogh@ubuntu:~/Documents/eclipse_workspace/wordCount$ ant -buildfile src/build.xml run -Darg0=/home/amogh/Downloads/input20.txt -Darg1=/home/amogh/Downloads/amogh.txt -Darg2=1 -Darg3=1
Buildfile: src/build.xml

jar:

run:
     [java] accept of TreeInfo called
     [java] visit of PopulateTreeVisitor called
     [java] insertTo of TreeInfo called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] accept of TreeInfo called
     [java] visit of WordCountVisitor called
     [java] outputToFile of TreeInfo called
     [java] writefile of FileProcessor called
     [java] writefile of FileProcessor called
     [java] writefile of FileProcessor called
     [java] closeFile of FileProcessor called
     [java] Total time required is: 12

BUILD SUCCESSFUL
Total time: 0 seconds
amogh@ubuntu:~/Documents/eclipse_workspace/wordCount$ ant -buildfile src/build.xml run -Darg0=/home/amogh/Downloads/input20.txt -Darg1=/home/amogh/Downloads/amogh.txt -Darg2=1 -Darg3=2
Buildfile: src/build.xml

jar:

run:
     [java] Parametrized Constructor of FileProcessor called
     [java] Parametrized Constructor of PopulateTreeVisitor called
     [java] Total time required is: 10

BUILD SUCCESSFUL
Total time: 0 seconds
amogh@ubuntu:~/Documents/eclipse_workspace/wordCount$ ant -buildfile src/build.xml run -Darg0=/home/amogh/Downloads/input20.txt -Darg1=/home/amogh/Downloads/amogh.txt -Darg2=1 -Darg3=0
Buildfile: src/build.xml

jar:

run:
     [java] unique number of words is: 2
     [java] Total words is: 5
     [java] Total characters is : 37
     [java] Total time required is: 11

BUILD SUCCESSFUL
Total time: 0 seconds
]

TO COMPILE:

[
  ant -buildfile src/build.xml all
]

TO RUN:

[
  ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=1 -Darg3=1

]

EXTRA CREDIT:

[
  Project running successfully on eclipse as well as using ANT. 
  DEBUG_VALUE=0 [Print to stdout the number of characters, total words and number of unique words] 			
  DEBUG_VALUE=1 [Print to stdout everytime a method other than constructor is called] 
  DEBUG_VALUE=2 [Print to stdout everytime a constructor is called] 

]

BIBLIOGRAPHY:

[

http://knowledgejunk.net/2010/11/09/avltree-java-source-code/
http://stackoverflow.com/questions/9660559/populating-a-binary-search-tree-with-a-text-file
http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html
http://examples.javacodegeeks.com/core-java/lang/string/java-string-format-example/
http://examples.javacodegeeks.com/core-java/io/bufferedwriter/write-file-with-bufferedwriter-example/

]

ACKNOWLEDGEMENT:
[

Prof. Madhusudhan Govindaraju
cs542.cs.binghamton.edu mailing list

]
