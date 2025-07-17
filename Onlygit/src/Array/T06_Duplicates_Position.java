package Array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class T06_Duplicates_Position {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int size = sc.nextInt();
     int[] a = new int[size];
     System.out.println("Enter the elements");
     for(int i=0;i<size;i++) {
    	 a[i] = sc.nextInt();
     }
     LinkedHashMap<Integer,ArrayList> map = new LinkedHashMap<Integer, ArrayList>();
     for(int i=0;i<=a.length-1;i++) {
     if(map.containsKey(a[i])) {
    	 map.get(a[i]).add(i);
     }
     else {
    	 map.put(a[i],new ArrayList());
     }
     }
for(Entry<Integer,ArrayList> en : map.entrySet()) {
	if(en.getValue().size()>0) {
		System.out.println(en.getKey()+" "+en.getValue());
	}
}
	}

}
