package com.ta.assign;

import java.util.Scanner;

public class BiggestNumber {
	static void largestNum(int arr[], int arr_size)
	{
		if(arr_size<3)
		{
			System.out.println("Number shound be atleast 3");
			return;
		}
		int first = arr[0], second = Integer.MIN_VALUE, 
				             third = Integer.MIN_VALUE;
		for(int i=1; i<arr_size; i++)
		{
			if(arr[i]>first)
			{
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]> second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i]> third)
			{
				third = arr[i];
			}
		}
		System.out.println("Biggest number : "+first+", Second Biggest number : " +second+", Third Biggest number :  "+third+".");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array number");
		int size = sc.nextInt();		
		System.out.println("Enter the list of numbers");		
		int[] numbers = new int[size];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = sc.nextInt();			
		}
		largestNum(numbers,size);
	}
}
