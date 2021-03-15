import java.io.*;
import java.util.Scanner;
public class Fileread{
	
	public static void main(String args[]){   
		File myobj=new File("D:\\Demo.txt");
		try
	    {
		
		Scanner s=new Scanner(myobj);
		while(s.hasNext())
		{
		  String data=s.next();
		System.out.print(data+" ");
		}
		
		s.close();
	   }
		catch(Exception e)
		{
			System.out.println("An exception occured");
		}
		System.out.println(myobj.length());
		
    }
}
