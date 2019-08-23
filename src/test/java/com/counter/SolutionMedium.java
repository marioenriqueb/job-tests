package com.counter;
import org.junit.Assert;

public class SolutionMedium {

	public static void main(String[] args) {
		int[] num = {-1, -2};
		Assert.assertEquals(1, solution(num));
		
		int[] num2 = {1, 3, 6, 4, 1, 2};
		Assert.assertEquals(5, solution(num2));
		
		int[] num3 = {};
		Assert.assertEquals(1, solution(num3));
	}
	
	public static int solution(int[] A) {
        int[] arreglo = new int[1000001];
        
        for(int element: A) {
        	arreglo[element] = element;
        }
        
        for (int i : arreglo) {
			
		}
        
        return 1;
    }

}
