import java.io.*;

public class FileTools
{

// -----------------------------------------------
public static void copyFile(String inputFileName, String outputFileName) throws IOException
{
final int MAX_BYTES = 100;
BufferedInputStream inputFile;
BufferedOutputStream outputFile;
byte[] buffer = new byte[MAX_BYTES];;
int byteCount;

System.out.println();
System.out.println("Copying " + inputFileName + " to " + outputFileName + " ...");

inputFile = new BufferedInputStream(new FileInputStream(inputFileName) );
outputFile = new BufferedOutputStream(new FileOutputStream(outputFileName));

do
   {
   byteCount = inputFile.read(buffer, 0, MAX_BYTES);
   outputFile.write(buffer, 0, byteCount);
   }
while (byteCount == MAX_BYTES);

inputFile.close();
outputFile.flush();
outputFile.close();

System.out.println();
System.out.println("Done");
} // End copyFile


// -----------------------------------------------
public static void joinFile(String inputFileNameA, String inputFileNameB, String outputFileName) throws IOException
{
   final int MAX_BYTES = 100;
BufferedInputStream inputFile;
BufferedOutputStream outputFile;
byte[] buffer = new byte[MAX_BYTES];;
int byteCount;

System.out.println();
System.out.println("Copying " + inputFileNameA + " to " + outputFileName + " ...");
System.out.println("Copying " + inputFileNameB + " to " + outputFileName + " ...");

inputFile = new BufferedInputStream(new FileInputStream(inputFileNameA) );
inputFile = new BufferedInputStream(new FileInputStream(inputFileNameB) );
outputFile = new BufferedOutputStream(new FileOutputStream(outputFileName));

do
   {
   byteCount = inputFile.read(buffer, 0, MAX_BYTES);
   outputFile.write(buffer, 0, byteCount);
   }
while (byteCount == MAX_BYTES);

inputFile.close();
inputFile.close();
outputFile.flush();
outputFile.close();
} // End joinFile


} // End class
