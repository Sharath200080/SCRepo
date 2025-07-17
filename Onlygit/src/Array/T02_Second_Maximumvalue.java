package Array;

import java.util.Scanner;

public class T02_Second_Maximumvalue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int size = sc.nextInt();
		 
		 int[] a = new int[size];
		 System.out.println("enter the elements");
		 for(int i=0;i<size;i++) {
			 a[i]=sc.nextInt();
		 }
		 int max = Integer.MIN_VALUE;
		 int smax =Integer.MIN_VALUE;
		 for(int i=0;i<=a.length-1;i++) {
			 if(a[i]>max) {//a[i] is greater thn max
				 smax=max;
				 max=a[i];
				 
			 }
			 else if(a[i]>smax && a[i]!=max) {
				 smax=a[i];
			 }
		 }
		System.out.println(max+" first max value");
		System.out.println(smax+" second max value");
	}

}
