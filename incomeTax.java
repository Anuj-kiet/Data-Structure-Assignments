package armstrong1;

import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {
		double tax=0,incomeTax;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter income");
		incomeTax=sc.nextDouble();
		if(incomeTax>=0 && incomeTax<=180000)
		{
			tax=0;
		}
		else if(incomeTax<=300000)
		{
			tax=0.1*(incomeTax-180000);
		}
		else if(incomeTax<=500000)
		{
			tax=(0.2*(incomeTax-300000))+(0.1*180000);
		}
		else if(incomeTax<=1000000)
		{
			tax=(0.3*(incomeTax-500000))+(0.2*300000)+(0.1*180000);
		}
		else
		{
			tax=(0.4*(incomeTax-1000000))+(0.3*500000)+(0.2*300000)+(0.1*180000);
		}
		System.out.println("Income Tax amount is:"+ " "+tax);
	}

}
