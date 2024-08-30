package FileHandlig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D://File Handling//arti.txt ");
		fw.write("Hello this is Arti");
		fw.close();
		
	}

}
