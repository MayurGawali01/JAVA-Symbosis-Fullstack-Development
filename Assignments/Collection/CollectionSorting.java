package Collection;
import java.lang.reflect.Array;
import java.util.*;

public class CollectionSorting {

	public static void method() {
		
		int array [] = new int[] {1,2,3,4,23,43,21,43,12,43,5,4,45,12,9};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		System.out.println("Sorted array using built-in method");
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println(); 
	}
	
	public static void sort_withoutmethod() {
		int array [] = new int[] {1,2,3,4,23,43,21,43,12,43,5,4,45,12,9};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i] > array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Printing sorted array using user define method");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void reversearray() {
		
		Integer [] array1 = {1,2,3,4,23,43,21,43};
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println(" Elements in desending Order: "+Arrays.toString(array1));
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method();
		System.out.println();
		System.out.println("---Sort----------");
		sort_withoutmethod();
		System.out.println();
		System.out.println("---Print Reverse Array-----");
		reversearray();
		
	}

}
