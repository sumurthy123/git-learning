import java.util.Scanner;
public class Calc
{ 
	public static void main (String[]args)
	  {

	    Scanner s = new Scanner (System.in);
	      System.out.println ("Enter two numbers  and operator");
	    double a = s.nextDouble ();
	    double b = s.nextDouble ();
	    String ch = s.next();

	    Cal c = new Cal (a, b, ch);
	      c.display ();
	  }
	}

	class Cal
	{
	  static double a;
	  final double b;
	  String ch;
	  
	  public Cal (double l, double m, String x)
	  {
	    this.a = l;
	    this.b = m;
	    this.ch = x;
	  }
	  public void display ()
	  {
	    if (ch.equals ("+"))
	      {
		System.out.println ((float) (a + b));
	      }
	    else if (ch.equals ("-"))
	      {
		System.out.println ((float) (a - b));
	      }
	    else if (ch.equals ("*"))
	      {
		System.out.println ((float) (a * b));

	      }

	    else if (ch.equals ("/"))
	      {
	          	
		    System.out.println((float)(a/b));
	  }
	    else
	    {
	    	System.out.println("invalid operator");
	    }
	  
	  }

}
