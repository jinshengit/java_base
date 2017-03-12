package org.kim.java;
/**
*@author create by Kim
*@date Mar 12, 2017
*/

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {10,23,11,56,45,26,59,28,84,79};
		int temp;
		System.out.println("Array initialzation:");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		for(int i = 0; i < a.length-1; i++){
			if(a[i] > a[i + 1]){
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		
		System.out.println("After sorting");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
