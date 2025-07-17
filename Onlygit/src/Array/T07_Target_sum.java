package Array;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class T07_Target_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elemnt");
		for (int z = 0; z < size; z++) {
			a[z] = sc.nextInt();
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter target sum");
		int tar = s.nextInt();

		LinkedHashSet set = new LinkedHashSet();
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {
				if (a[i] + a[j] == tar) {
					String sum = a[i] > a[j] ? "(" + a[j] + "," + a[i] + ")" : "(" + a[i] + "," + a[j] + ")";
					set.add(sum);
				}

			}

		}
		System.out.println(set);
	}

}
