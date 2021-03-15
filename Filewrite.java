import java.io.*;
public class Filewrite {

	public static void main(String[] args) {
		try
		{
		    FileWriter myobj=new FileWriter("D:\\Demo.txt");
		    myobj.write("Iam SURI SATYA MURTHY");
		    System.out.println("Successfully written");
		    myobj.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
      }

}
