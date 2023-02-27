package test;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int n=obj.nextInt();
		int flag=0;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		int target=obj.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==target) 
				System.out.print(i);
		else
			flag=flag+1;
		}
			
		if (flag==n)
			System.out.print("-1");

}}
