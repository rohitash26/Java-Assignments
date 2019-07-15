package epam.com;

public class Task4 {
	
	public static void main(String [] args)
	{
		int i=1;
		int num = Integer.parseInt(args[0]);
		int total=0;
		while(i<num)
		{
			if(num%i==0)
				total+=i;
			i++;
		}
		if(num==total)
		{
			System.out.println(i+" is a perfect number");
		}
		else
			System.out.println(i+" is not a perfect number");
	}

}
