package test;

import java.util.Scanner;

public class chocolate {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int N=obj.nextInt();
		int C=obj.nextInt();
		int cuts=obj.nextInt();
		int sol=cuts-(N+C);
		System.out.print(sol);
		
}}
