package armstrong1;


public class armstrong2 {

	public static void main(String[] args) {

		int num = 153,temp , rem, sum = 0;

		temp = num;

		while (temp != 0)
		{
			rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}

		if(sum == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
		
	}

	}

