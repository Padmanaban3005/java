package prog;

import java.util.*;

class padhu{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
//int temp=0;
//int flag=0;
int n= obj.nextInt();
int arr[]=new int[n];
int temp[]=new int[4];
int flag[]=new int[4];
for(int i=0;i<n;i++) {
	arr[i]=obj.nextInt();
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) 
	{
	if(arr[i]<0)
	{temp[4]=arr[i];
	arr[i]=arr[j];
	arr[j]=temp[4];}
	
	else if(arr[i]>0)
	{flag[4]=arr[i];
	arr[i]=arr[j];
	arr[j]=flag[4];
	}
	
}}

System.out.print(temp);
System.out.print( flag);


}}


