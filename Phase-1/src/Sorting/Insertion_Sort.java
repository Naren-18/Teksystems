package Sorting;
import java.util.*;
public class Insertion_Sort {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(99);
		numbers.add(12);
		numbers.add(33);
		numbers.add(11);
		numbers.add(87);
		numbers.add(89);
		numbers.add(76);numbers.add(67);
		numbers.add(65);
		numbers.add(77);numbers.add(10);
		numbers.add(87);
		numbers.add(98);
		int[] numbers1= {99,88,77,66,55,44,33,22,11,00};
		System.out.println("Before Sorting:"+Arrays.toString(numbers1));
//		System.out.println("After  Sorting:"+(insertionSort(numbers)));
		System.out.println("After  Sorting:"+(Arrays.toString(Insert(numbers1))));
	}
	

	static List<Integer> insertionSort(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<numbers.size();i++) {
			if(numbers.get(i)<=numbers.get(0)) {
				numbers.add(0,numbers.get(i));
				numbers.remove(i+1);
			}
			if(numbers.get(i)<numbers.get(i-1)) {
				for(int j=1;j<i;j++) {
					if(numbers.get(i)<numbers.get(j)) {
						numbers.add(j,numbers.get(i));
						numbers.remove(i+1);
					}
				}
			}
		}
		return numbers;
	}
	
	
	static int[] Insert(int[] numbers) {
		for(int i=1;i<numbers.length;i++) {
			int key=numbers[i];
			int j;
			for(j=i-1;j>=0 && numbers[j]>key;j--) {
				numbers[j+1]=numbers[j];
				
			}
			numbers[j+1]=key;
		}
		return numbers;
	}
}
