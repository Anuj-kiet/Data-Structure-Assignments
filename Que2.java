package armstrong1;

import java.util.Scanner;

class Que{
	
	static void armstrong(int first, int second)
	{
		for (int i = first + 1; i < second; i++) {
	
			int temp = i;
			int num = 0;
			while (temp != 0) {
				temp /= 10;
				++num;
			}
	
			int sum = 0;
			temp = i;
			while (temp != 0) {
				int rem = temp % 10;
				sum += Math.pow(rem, num);
				temp /= 10;
			}
	
			if (sum == i)
				System.out.print(i + " ");	
		}
	}
	
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number1");
		num1=sc.nextInt();
		System.out.println("Enter the Number2");
		num2=sc.nextInt();
		armstrong(num1, num2);
		System.out.println();
	}
}
