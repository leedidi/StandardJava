package ch05;

import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_2Plus {
	public static void main(String[] args) {
		//index ����: -~0
		int[] arr = new int[10]; //���̰� 5�� int�迭 arr�� ����
		System.out.println("arr.length="+arr.length);
		
		for(int i=0;i<10;i++) {
		System.out.println("arr["+i+"]="+ arr[i]);
		}
}
}