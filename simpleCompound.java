package armstrong1;

import java.util.Scanner;

public class simpleCompound {
	    public static void main (String arg[])
	{
	    double principle, rate, t, sim,com;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the amount:");
	    principle=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sim=(principle * t * rate)/100;
	    com=principle * Math.pow(1.0+rate/100.0,t) - principle;
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	   }
	}

