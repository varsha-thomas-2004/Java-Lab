/*
Name : Varsha Thomas 
Class : CS3B

To implement bubble sort 
*/

import java.util.Scanner;

class Bubble
{
	public static void BubbleSort(int size, int arr[])
	{
		int i, j, temp;
		for (i = 0; i < size; i++)
		{
			for (j = 0; j < size - i - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void Display(int size, int arr[])
	{
		int i;
		System.out.println("Sorted array:");
		for (i = 0; i < size; i++)
		{
			System.out.println(arr[i]);
		}
	} 
	public static void main (String args[])
	{
		int size, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements:");
		for (i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		BubbleSort(size, arr);
		Display(size, arr);
	}
}
