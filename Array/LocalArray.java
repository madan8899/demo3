import java.util.*;

public class LocalArray	{
	public static void main(String...s)	{
		
		//int z[] = new int[5];
		//int z[] = {10,20,30,40};
		int z[];
		System.out.println("Enter the size of array");
		int x1 = new Scanner(System.in).nextInt();
		z = new int[x1];
		System.out.println(z.getClass().getName());
		
		for(int i=0;i<z.length;i++)		{
			z[i] = new Scanner(System.in).nextInt();
		}

		for(int i=0;i<z.length;i++)		{
			System.out.print(z[i]);
			System.out.print(" ");
		}
	
     	System.out.println("");
		System.out.println("for each loop");

		for(int x : z)	{
			System.out.print(x);
			System.out.print(" ");
		}
	}
}