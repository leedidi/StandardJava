package ch05;

import java.util.Arrays;
import java.util.function.IntPredicate;

//ctrl+shift+o 자동으로 import 추가
class Ex5_2Plus5 {
	public static void main(String[] args) {
	int[] arr = {3,4,1,0,2};
	
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
//
//		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"}, {"AAA","BBB"}};

		System.out.println(Arrays.deepEquals(str2D, str2D2)); 
		
		int[] arr2 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr2));
		}
	}
		
	