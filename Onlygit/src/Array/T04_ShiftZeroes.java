package Array;

import java.util.Arrays;
import java.util.Scanner;

public class T04_ShiftZeroes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		int[] b  = new int[a.length];
		int index = b.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				b[index--] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
