package exercise.arraysTDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
	private final int[] numbers; // array that needs to be sorted.
	private final int[] unsorted; // reference array which stays unsorted.

	public ArrayOperations(int[] numbers) {
		this.numbers = numbers;
		this.unsorted = numbers.clone();
	}

	/*
	 * ********************************************************** Please implement
	 * the following methods. * It is intended that they are not static. *
	 ***********************************************************/

	/**
	 * Prints out the numbers array.
	 */

	public void print() {
		for (int i : numbers) {
			System.out.println(i);
		}

	}

	/**
	 * @return the sorted numbers array.
	 * @see <a
	 *      href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
	 */
	public int[] sort() {
		Arrays.sort(numbers);
		return numbers;
	}

	/**
	 * @return the sorted array in reverse order
	 */
	public int[] revertSort() {
		int[] j=new int[numbers.length];
		int x=numbers.length-1;
		for (int i = 0; i < numbers.length; i++) {
			j[i]=numbers[x];
			x--;
		}
		return j;
	}

	/**
	 * @return the unsorted array in reverted order.
	 */
	public int[] reverted() {
		Arrays.sort(numbers, Collections.reverseOrder());
		return unsorted;
	}

	/**
	 * @param value which should be searched for.
	 * @return true if the array contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		for (int i : numbers) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the average value of all elements summed up.
	 */
	public double average() {
		double j = 0;
		for (int i = 0; i < numbers.length; i++) {
			j = j + numbers[i];
		}
		return j / numbers.length;
	}

	/**
	 * @return the average value of all elements summed up, but without the highest
	 *         and the lowest value.
	 */
	public double trimmedMean() {
		double sum=0;
		for (int number : numbers) {
			if ((number!=maxValue())&&(number!=minValue())) {
				sum=sum+number;
			}
		}
		return sum/(numbers.length-2);
	}

	/**
	 * @return the max value of the array. In the array [1,9,3] max would be 9.
	 */
	public int maxValue() {
		int value = 0;
		for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > value) {
					value =  numbers[i];
			}
		}
		return value;
	}

	/**
	 * @return the min value of the array. In the array [1,9,3] min would be 1.
	 */
	public int minValue() {
		int value =99999;
		for (int i = 0; i < numbers.length; i++) {
				if (numbers[i]<value ) {
					value =  numbers[i];
			}
		}
		return value;
	}

	/*
	 * ********************************************************** Feel free to add
	 * as many private helper methods as * you like. *
	 ***********************************************************/

	private int someHelper(int[] tmp) {
		return 1;
	}
}
