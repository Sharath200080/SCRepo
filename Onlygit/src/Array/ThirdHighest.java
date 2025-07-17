package Array;

import java.util.Scanner;

public class ThirdHighest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size  = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the value");
		for(int z=0;z<size;z++) {
		    a[z] = sc.nextInt();
		}
		    int max = Integer.MIN_VALUE;
		    int smax = Integer.MIN_VALUE;
		    int tmax = Integer.MIN_VALUE;
		  for(int i=0;i<=a.length-1;i++) {
			  if(a[i]>max) {
				  tmax = smax;
				  smax = max; 
				  max=a[i];
				 
						  
			  }
			  else  if(a[i]>smax && a[i]!=max ) {
				  tmax = smax;
				  smax = a[i];
			  }
			  else  if(a[i]>tmax && a[i]!=smax) {
				  tmax = a[i];
		  }
			  
		}
		  System.out.println(max + "max num");
		  System.out.println(smax + "smax num");
		  System.out.println(tmax + "tmax num");
	}
	}

