package armstrong1;

import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int data[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
		System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        bubbleSort(data);
		System.out.println("Array After Bubble Sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
	}

}
