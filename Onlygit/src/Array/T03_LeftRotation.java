
package Array;


import java.util.Arrays;
import java.util.Scanner;

public class T03_LeftRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elemnts");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<=1;i++) {
			int temp = a[0];
			
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	

}
