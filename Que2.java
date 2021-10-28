package armstrong1;
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
		int num1 = 100;
		int num2 = 999;
		armstrong(num1, num2);
		System.out.println();
	}
}
