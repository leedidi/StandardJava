package ch05;

import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_2Plus {
	public static void main(String[] args) {
		//index 범위: -~0
		int[] arr = new int[10]; //길이가 5인 int배열 arr을 생성
		System.out.println("arr.length="+arr.length);
		
		for(int i=0;i<10;i++) {
		System.out.println("arr["+i+"]="+ arr[i]);
		}
}
}