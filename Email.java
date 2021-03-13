import java.util.*;
import java.util.Scanner;
public class Email {
	
     
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("satyamurthy962@gmail.com");
		list.add("ravi743@gmail.com");
		list.add("pavan123@gmail.com");
		list.add("surya234@gmail.com");
		System.out.println("Enter email");
		Scanner s=new Scanner(System.in);
		
		String a=s.nextLine();
		
		Email.display(a,list);
	}
		
		public static void display(String a,ArrayList<String> list)
		{
			int found=0;
			
		  Iterator it=list.iterator();
		   while(it.hasNext())
		   {
		     if((it.next()).equals(a))
		  
		      {
		          System.out.println("found");
		          found=found+1;
		          break;
		      }
		  }
	     	if(found==0)
		    {
		        System.out.println("not found");
		    }
		}

	

}
