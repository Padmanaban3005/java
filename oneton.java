package test;

import java.util.Scanner;

public class oneton {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int n=obj.nextInt();
		int Q=obj.nextInt();
		int sum=0;
		int mul=1;
		if(Q==1) {
			for(int i=1;i<=n;i++) {
				sum=sum+i;}
				
			
			System.out.print(sum);}
			else if(Q==2) {
				for(int j=1;j<=n;j++) {
					mul=mul*j;
				}
				System.out.print(mul);
			}
		}
	}


