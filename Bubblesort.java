package Pranil;

import java.util.Arrays;

public class Bubblesort {
	
	public static void bubblesort(int arr[]) {
		
		for(int i=0; i<arr.length-1;i++)
		{
		
		for(int j=0;j<arr.length-1;j++)
		{
			
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
		
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}}
	

public static void main (String[]args) {
	
	int [] arr = {6,4,2,8,3,1};
	System.out.println("Before: "+Arrays.toString(arr));
	bubblesort(arr);
	System.out.println("After : "+Arrays.toString(arr));
}
}