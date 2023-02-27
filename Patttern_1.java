package prog;
import java.util.*;
public class question_1 {
	
	 public static void main(String[] args ){
		
		 Scanner obj=new Scanner(System.in);
		 int n= obj.nextInt();
		 int row=1;
		 int col=1;
		 int a=n+2;
		 for(  row=1;row<=a-2;row++,System.out.println(""))
		 {
		  //System.out.print( "@");
		  for( col=n+1;col>=0;col--)
		 {
		 	 //System.out.print( " @");
		 	if (row==1 || row==n+1)
		 		System.out.print("@");
		 	else if(row==col)
		 		System.out.println("##");
		 	else 
		 	System.out.print(" ");
		 	 }
		    /*for(row=1;row<=n+2;row++,System.out.print(" "))
		    {
		     System.out.print("@");}*/
		 //System.out.println("@@@@@@@@@");
		 }
		
		 for(row=1;row<=n+2;row++,System.out.print(""))
		    {
		     System.out.print("@");}

	 }
	

}
