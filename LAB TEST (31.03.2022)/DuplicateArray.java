package com.java.handson;

public class DuplicateArray {
//to find the duplicate elements in array
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,2,4,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
					{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate elements in array "+arr[i]);
				}
					}
		}
	

	}

}
