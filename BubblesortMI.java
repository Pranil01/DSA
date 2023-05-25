package Pranil;
import java.util.Arrays;
public class BubblesortMI {

	
			public static void bubblesortim(int arr[]) {
				
				for(int i=0; i<arr.length-1;i++)
				{
				boolean  Swapflag=false;
				
				for(int j=0;j<arr.length-1-i;j++)
				{
					
					if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
				
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					 Swapflag=true;
					}
				
				}
				if(!Swapflag)
				break;
			}}
			

		public static void main (String[]args) {
			
			int [] arr = {6,4,2,8,3,1};
			System.out.println("Before: "+Arrays.toString(arr));
			bubblesortim(arr);
			System.out.println("After : "+Arrays.toString(arr));
		}
		}




