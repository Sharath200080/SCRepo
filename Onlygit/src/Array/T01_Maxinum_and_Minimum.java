package Array;

import java.util.Scanner;

public class T01_Maxinum_and_Minimum {

	public static void main(String[] args) {
		// step 1: get array size
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		// step 2: creat array and take the input
		int[] a = new int[size];
		System.out.println("Enter the elemnts");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			 if (a[i] < min) {
			min = a[i];
				
			}

		}
		System.out.println("max" + " " + max);
		System.out.println("min" + " " + min);
	}
}
