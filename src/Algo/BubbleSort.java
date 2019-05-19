package Algo;
import java.util.*;
/**
 * 
 * @author nguyenkhacbaoanh
 * Write a java program to sort an array elements using bubble sort algorithm.
 * Input: 18 9 33 4 84 32
 * Output: 4 9 18 32 33 84
 */

class BSort {
	int[] list;
//	int current = 0;
//	int next = 1;
	BSort(int[] list) {
		this.list = list;
	}
	int[] sort() {
		for (int current = 0; current< this.list.length; current++) {
			for (int next = 0; next < this.list.length; next++) {
				if (this.list[current] < this.list[next]) {
					int s = this.list[current];
					this.list[current] = this.list[next];
					this.list[next] = s;
				}
			}
		}
		return this.list;
	}
}

class BubbleSort {
	public static void main(String[] args) {
		int[] ls = {18, 9, 33, 4, 84, 32};
		BSort bs = new BSort(ls);
		String list_sorted = Arrays.toString(bs.sort());
		System.out.println(list_sorted);
//		for (int i = 0; i< list_sorted.length; i++ ) {
//			try {
//				System.out.println(list_sorted[i]);
//			} catch(ArrayIndexOutOfBoundsException ex) {
//				ex.printStackTrace();
//			}
//		}
//		System.out.println(true | false);
	}
}
