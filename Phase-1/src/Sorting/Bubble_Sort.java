package Sorting;

import java.util.Arrays;
// iterating innerloop for every adjacent elements if two elements are not sorted swap will be done
public class Bubble_Sort {
	public static void main(String[] args) {
		int[] numbers= {2,1,4,6,7,4,3,2,0};
		System.out.println("Before Sorting:"+Arrays.toString(numbers));
		System.out.println("After  Sorting:"+Arrays.toString(bubbleSort(numbers)));
	}
	static int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					//swap
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

}
