package prog;
import java.util.*;
public class question_3 {
	
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	if (n<=20)
		System.out.println("Yes");
	else 
		System.out.println("NO");
	for(int row=1;row<=n;row++)
	{
	if (row==1 || row==n)
	System.out.print("H");
	else
	System.out.print("B");
	}}}