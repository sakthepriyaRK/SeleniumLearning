package week1.day2;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int arr[]= {100,49,398,34,1,267};
		int arrlen=arr.length;
		System.out.println(" length of the array: "+ arrlen);
		Arrays.sort(arr);
		
		for(int i=0; i<arrlen-2; i++)
		{ 
			
			System.out.println( arr[i]);
			
			
			}
		System.out.println( "second smallest:"+arr[1]);
			System.out.println("second largest:" +arr[arrlen-2] );
		

		}
		
		
	}


