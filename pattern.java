package test;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
	    int a=obj.nextInt();
	    int row=0;
	    int col=0;
	    /*int b=a+2;
	    int c=a/2;
	    int d=b-a;*/
	    int c=a/2;
	    int d=c-1;
	    int e=a-(d-1);
	    for( row=1;row<=a;row++,System.out.println()) {
	    	for( col=1;col<=a;col++) {
	    		if((col==1 && row>=d && row<=e)|| (col==2 && row>=d && row<=e))
	    			System.out.print("#");
	    	}}
	    	for( row=1;row<=a;row++,System.out.println()) {
		    	for(col=1;col<=a;col++) {
		    		if(row==3&&col==2 )
		    			System.out.print("*");
		    	
		    		
		    	
	    	}	
	    		
	    	
	    }
			
			
	}

}
