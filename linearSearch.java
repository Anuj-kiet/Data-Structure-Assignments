package armstrong1;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int i,n,search,a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("Enter value to find");
		search=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element"+ " " + search+ " " + "found at"+ " " +i+ "th" + " "+"position");
				break;
			}
		}
		if(i==n)
		{
			System.out.println(search+"isn't present in array");
		}
	}

}
