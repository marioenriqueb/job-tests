package com.counter;

import org.junit.Assert;

public class Solution {

	public static void main(String[] args) {
		int[] num = { -1, -2 };
		Assert.assertEquals(1, solution(num));

		int[] num6 = { 9, 3, 6, 4, 1, 2 };
		Assert.assertEquals(5, solution(num6));

		int[] num2 = { 3, 3, 6, 4, 1, 2 };
		Assert.assertEquals(5, solution(num2));

		int[] num3 = {};
		Assert.assertEquals(1, solution(num3));

		int[] num4 = new int[1000];
		for (int index = 0; index < 1000; index++) {
			if (index != 564) {
				num4[index] = index;
			}
		}
		Assert.assertEquals(564, solution(num4));
	}

	public static int solution(int[] A) {

		int counter = 1;

		int[] arreglo = new int[1000001];

		for (int element : A) {
			if (element > 0) {
				arreglo[element] = element;
			}
		}

		for (int index = 1; index < arreglo.length; index++) {
			if (arreglo[index] != index) {
				return index;
			}
		}
		
		return counter;
	}

}
