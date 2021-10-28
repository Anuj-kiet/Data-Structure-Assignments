package armstrong1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int CS , Java , C;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CS Marks");
		CS=sc.nextInt();
		System.out.println("Enter the Java Marks");
		Java=sc.nextInt();
		System.out.println("Enter the C Marks");
		C=sc.nextInt();
		if(CS>60 && Java>60 && C>60)
		{
			System.out.println("Passed");
		}
		else if ((CS>60 && Java>60)||(CS>60 && C>60)|| Java>60 && C>60) 
		{
			System.out.println("Promoted");
		}
		else if((CS>60 || Java >60 || C>60) || (CS<60 && Java<60 && C<60))
		{
			System.out.println("Failed");
		}
		else 
		{
			System.out.println("Enter Valid Choice");
		}
		
		

	}

}
