package FileHandlig;
import java.io.File;
import java.io.IOException;

public class WriterFile {
	public static void main(String[] args) throws IOException {
		File fs=new File("D://File Handling//arti.txt ");
		                          
		if(!fs.exists()) {
		fs.createNewFile();
		}
		System.out.println("File Created");
		
		//file handling method
		System.out.println(fs.canRead());     // method
		System.out.println(fs.canWrite());    //method
		System.out.println(fs.getAbsolutePath());    //method
		//System.out.println(fs.delete());        //method
		
		
	}

}

