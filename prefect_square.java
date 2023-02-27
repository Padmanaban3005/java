import java.util.*;
public class prefect_square {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int arr[]=new int[a];
		int square;
		int tepm = 0;
		for(int i=0;i<a;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=1;i<a;i++) {
			square=(int)Math.sqrt(i);
		
		for(int j=1;j<a;j++) {
			if(square*square==arr[j]) {
			  tepm++;
			}
		
		}}System.out.println(tepm-1);
		
	}

	private static void println(int tepm) {
		// TODO Auto-generated method stub
		
	}

}
