package epam.com;
public class Task3 {

	public static void main (String[]args)
  {
    float first = Float.parseFloat (args[0]);
    float second = Float.parseFloat (args[1]);

    float temp;
    if (args.length==2)
      {
	if (first == 0)
	  {
	    temp = ((second * 9) / 5) + 32;
	  }
	else
	    temp = ((second - 32) * 5) / 9;
	System.out.println (temp);
      }
    else
      System.out.println ("Only two arguments are allowed.");
  }
}
