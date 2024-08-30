package FileHandlig;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D://File Handling//arti.txt ");
		
	     int f=0;
	     while((f=fr.read())!=-1) {
	    	 System.out.print((char)f);
	     }
	     
	     }
		
	}


