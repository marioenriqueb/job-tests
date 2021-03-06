package com.counter;
import java.util.TreeSet;

import org.junit.Assert;

public class SolutionOld {

	public static void main(String[] args) {
		int[] num = {-1, -2};
		Assert.assertEquals(1, solution(num));
		
		int[] num2 = {1, 3, 6, 4, 1, 2};
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
        TreeSet<Integer> arbol = new TreeSet<Integer>();
        
        for(int element: A) {
            arbol.add(element);
        }
        
        int counter = 1;
        
        while (!arbol.isEmpty()) {
            int first = arbol.pollFirst();
            if (first > counter) {
                return counter;
            } else if (first == counter) {
                counter++;
            }
        }
        
        return counter;
    }

}
