/*Write a program for Binary search*/

import java.util.*;
class BinarySearch
{
	 static void  bsearch(int a1[],int first,int key, int last)
	{
		int mid=(first+last)/2;
		while( first <= last )
		{  
			if ( arr[mid] < key )
			{  
			first = mid + 1;     
			}
			else if ( arr[mid] == key )
			{  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}
			else
			{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
			}  
			if ( first > last)
			{  
				System.out.println("Element is not found!");  
			}  
		}  
			
}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array ");
		int size=sc.nextInt();
		
	
		int arr[]=new int [size];
		System.out.println("Enter element ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter element ");
		int key=sc.nextInt();
		
	
		int result = bsearch(arr,0,key,size-1);
	
		if(result == -1)
		System.out.println("Element Not Found");
		else
		System.out.println("Element Found");
	
}
}