package armstrong1;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		int A,B,C;
		int first_sum,second_sum,third_sum,total=0;
		float Avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of subject A");
		A=sc.nextInt();
		System.out.println("Enter the marks of subject B");
		B=sc.nextInt();
		System.out.println("Enter the marks of subject C");
		C=sc.nextInt();
		total=A+B+C;
		Avg=(A+B+C)/3;
		System.out.println("Total of all the Subject marks =" +" "+total);
		System.out.println("Average of all the Subject marks =" +" "+Avg);
		System.out.println();
		
		
		System.out.println("First Student marks:");
		System.out.println("Enter the marks of subject A");
		A=sc.nextInt();
		System.out.println("Enter the marks of subject B");
		B=sc.nextInt();
		System.out.println("Enter the marks of subject C");
		C=sc.nextInt();
		first_sum=A+B+C;
		Avg=(A+B+C)/3;
		System.out.println("Total of the first student=" +" "+first_sum);
		System.out.println("Average of the first student=" +" "+Avg);
		System.out.println();
		
		
		System.out.println("Second Student marks:");
		System.out.println("Enter the marks of subject A");
		A=sc.nextInt();
		System.out.println("Enter the marks of subject B");
		B=sc.nextInt();
		System.out.println("Enter the marks of subject C");
		C=sc.nextInt();
		second_sum=A+B+C;
		Avg=(A+B+C)/3;
		System.out.println("Total of the first student=" +" "+second_sum);
		System.out.println("Average of the first student=" +" "+Avg);
		System.out.println();
		
		
		System.out.println("Third Student marks:");
		System.out.println("Enter the marks of subject A");
		A=sc.nextInt();
		System.out.println("Enter the marks of subject B");
		B=sc.nextInt();
		System.out.println("Enter the marks of subject C");
		C=sc.nextInt();
		third_sum=A+B+C;
		Avg=(A+B+C)/3;
		System.out.println("Total of the first student=" +" "+third_sum);
		System.out.println("Average of the first student=" +" "+Avg);

	}

}
