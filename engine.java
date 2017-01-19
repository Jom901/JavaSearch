import java.util.Scanner;
import java.io.File;

class Engine{
	static String path = "./searchables";
	static File folder = new File(path);
	static File[] listOfFiles = folder.listFiles();
	public Engine(){
		for(int i = 0; i < listOfFiles.length; i++){
			System.out.println("File: " + listOfFiles[i]);
		}
	}
}