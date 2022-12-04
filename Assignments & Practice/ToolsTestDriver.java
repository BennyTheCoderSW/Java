import java.io.IOException;

public class ToolsTestDriver {
    

public static void main(String[] args) {
    

    try {
    //If the length of the args array is 2 then it calls the copyFile() method and passes it the two file
    //name arguments entered on the command line
    if(args.length == 2) {
    FileTools.copyFile(null, null);
    }
    //Else if the length of the args array is 3 then it calls the joinFile() method and passes it the
    //three file name arguments entered on the command line 
    if(args.length == 3) {
    FileTools.joinFile(null, null, null);
    }
    else{
    //Else it prints the usage message shown below
    System.out.println("******************** Usage Message ********************");
    System.out.println("Copy a file : java ToolsTestDriver inputFile outputFile");
    System.out.println("Join two files: java ToolsTestDriver inputFileA inputFileB outputFile");  
    } 
    }
    catch (IOException k) {
        System.out.println("IO Exception");
    }
    finally{

    }
}
}