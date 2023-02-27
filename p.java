package padhu;

import java.util.Scanner;

public class p {
	public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=a-2;
        for(int row=1;row<=a;row++,System.out.println()) {
        	for(int col=1;col<=a;col++)
        	{
        		if(col==1 || col == a || row==1 || row ==a)
        			System.out.print("## ");
        		else
        			System.out.print("   ");
        }
        }
        	for(int row=1;row<=a;row++,System.out.println()) {
            	for(int col=1;col<=a;col++)
            	{
            		if(col==1)
            			System.out.print("##");
            		else
            			System.out.print("   ");
            	}}

}}
