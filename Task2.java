package epam.com;

public class Task2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Java Collatz "+num);
		if(num<100)
		{	
			System.out.print(num+" ");
			while(num!=1)
			{
				if(num%2==0)
				{
					num=num/2;
					System.out.print(num+" ");
				}
				else
				{
					num=(3*num)+1;
					System.out.print(num+" ");
				}
			}
		}
		else
		{
			System.out.println("Number must be less than 100");
		}

	}

}
