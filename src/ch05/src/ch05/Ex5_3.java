package ch05;

import java.util.Arrays;

class Ex5_3 { 
	public static void main(String[] args) { 
		// index: 0~3-1, 0~2
		String[] strArr = {"����", "����", "��"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
		int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]); //0~2
	} // end of main 
} // end of class
}