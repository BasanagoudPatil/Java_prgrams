package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[]{1,2,3,4,6,7};
		int key=7;
		boolean k=Binaray(arr, key);
		if(k) {
			System.out.println(key+" is present");
		}
		else {
			System.out.println(key+" is not present");
		}
		

	}
	static boolean Binaray(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		boolean b=false;
		while(high>=low)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				b=true;
				return b;
			}
			else if(key>mid)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return b;
		
	}
}