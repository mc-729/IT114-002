import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		String fileName = "test.txt";
		MyClass fss = new MyClass();
		fss.createFileAndGetDetails(fileName);
	}
		public void createFileAndGetDetails(String fileName) {
			try {
				File fileReference = new File(fileName);
				if(fileReference.createNewFile()) {
					System.out.println("Didn't exist, created new");
				}
				else {
					System.out.println("File already exists");
				}
				
				System.out.println(fileName + " is located at " + fileReference.getAbsolutePath());
				if(fileReference.canRead()) {
					System.out.println(fileName + " is readable");
				}
				else
					System.out.println(fileName + " is not readable");
			}
			catch(IOException ie) {
				ie.printStackTrace();
			}
		}
		public void writeToFile(String fileName, String msg) {
		public void readFromFile(String filename) {
		public void appendToFile(String fileName, String msg) {
}
}