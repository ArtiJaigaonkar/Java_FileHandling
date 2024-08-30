package FileHandlig;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileoperation {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while(flag!=0) {
			System.out.println("1.Create File.");
			System.out.println("2.Write File.");
			System.out.println("3.Read File.");
			System.out.println("4.Exit File.");
			System.out.println("Enter Your choise.");
			
			int choise=sc.nextInt();
			String path="D://File Handling//";
			
			switch(choise){
			case 1: {
				System.out.println("Enter the name to Create File..");
				String name=sc.next();
				File f=new File(path+name+".txt");
				if(f.exists()) {
					System.out.println("Already Exists..");
				}
				else {
					f.createNewFile();
					System.out.println("File Created Successfully.");
				}
				break;
			}
			
			case 2:{
				System.out.println("Enter the name to Write File..");
				String name=sc.next();
				FileWriter fw=new FileWriter(path+name+".txt");
				
				System.out.println("Enter the Content to write: ");
				sc.nextLine();
				String str=sc.nextLine();
				
				fw.write(str);
				
				fw.close();
				
				break;
			}
              case 3:{
				
				System.out.println("Aboli");
				System.out.println("Aditi");
				System.out.println("Enter the name to Write File..");
				String name=sc.next();
				
				FileReader fr=new FileReader(path+name+".txt");
				
				int f=0;
			
				while((f=fr.read())!=-1) {
					System.out.print((char)f);
				}
				System.out.println();
				
				break;
			}
              case 4:{
  				flag=0;
  				continue;
  			}
  			default:
  				System.out.println("Invalid input");
  			}
  			
  			System.out.println("Do you want's to Continue...yes...or...no");
  			
  			String str=sc.next();
  			
  			if(str.equals("yes")) {
  				
  			}else {
  				flag=0;
  			}
  			
  			
  		}
  		
  		System.err.println("Application is closed...!");
  	}

  }
			
			