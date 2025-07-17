package Array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_Array_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size1 = sc.nextInt();
		int[] a = new int[size1];
		System.out.println("Enter the elements of 1st array");
		for (int i = 0; i < size1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int size2 = sc.nextInt();
		int[] b = new int[size2];
		System.out.println("Enter the elements of 2nd array");
		for (int i = 0; i < size2; i++) {
			b[i] = sc.nextInt();
		}
		int max = Math.max(a.length, b.length);
		int[] sum = new int[max];
		for (int j = 0; j <= max; j++) {
			if (j < a.length) {
				sum[j] += a[j];
			}
			if (j < b.length) {
				sum[j] += b[j];
			}
		}
		System.out.println(Arrays.toString(sum));
	}
}
