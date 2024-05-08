package com.kodnest.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

//Bubble short Algorithm in Java
public class BubbleShort
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		try {
		System.out.println("User enter the size of the array");
		int size=sc.nextInt();
		System.out.println("User enter the elements of the array");
		int [] arr= new int[size];
		for (int j = 0; j < size; j++) {
			arr[j]=sc.nextInt();
		}	
		
		bubbleShort(arr);
		}catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException Occur !!!, Please enter some valid <Integer>input");
		}
		finally {
			sc.close();
		}
		
		
		
		

	}

   //Bubble Short Logic
	public static void bubbleShort(int [] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-i-1; j++)
			{
				if(arr[j]> arr[j+1])
				{
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//Display the sorted array
		System.out.print("The sorted Array is : ");	
		for (int i : arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
	
	}
}
