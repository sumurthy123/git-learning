import java.io.*;
public class Filedemo {
	
	public static void main(String args[])
	{   File myobj=new File("D:\\Demo.txt");
		try
		{
		
		if(myobj.createNewFile())
		{
		  System.out.println("file created successfully");	
		}
		else
		{
			  System.out.println("File is already created");
		}
		}
		catch(Exception e)
		{
			System.out.println("An exception occured");
			e.printStackTrace();
		}
		System.out.println(myobj.canRead());
		System.out.println(myobj.canWrite());
		System.out.println(myobj.exists());
		System.out.println(myobj.getAbsolutePath());
		
	}

}
