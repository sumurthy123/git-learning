import java.io.*;
import java.util.Scanner;
public class Fileappend {

	public static void main(String[] args) {
		try
		{   
			System.out.println("Enter the data that you want to append");
			Scanner sc=new Scanner(System.in);
		    String text=sc.nextLine();
		    
		    FileOutputStream foutput=new FileOutputStream("D:\\Demo.txt");
		    foutput.write(text.getBytes());
		    System.out.println("data appended successfully");
		    foutput.close();
		    
		}
		catch(Exception e)
		{
			System.out.println("An exception occured");
		}
		
		}

}
