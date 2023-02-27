package test;

import java.util.Scanner;

public class premutation {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int a=obj.nextInt();
		int n=a+1;
		int arr[]=new int[n];
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++) {
			//temp[n]=obj.nextInt();
			if(arr[i]<arr[i+1]) 
				temp[n]=arr[i];
			else
				temp[n]=arr[i+1];
			//temp[n]=obj.nextInt();
				//System.out.print(temp[n]);
			}
		System.out.print(temp[n]);	
		}

}
