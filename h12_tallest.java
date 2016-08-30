package h12_tallest;

import java.util.Arrays;
import java.util.Scanner;

public class h12_tallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		Arrays.sort(a);
		
		int d=a[4-1];
		System.out.println("Fourth tallest - "+d);
	    System.out.println("Enter your choice");
	    int n=s.nextInt();
        int k=a[n-1];
		System.out.println("Kth tallest - "+k);
		
		

	}

}
