package ch04; 

import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 12345, sum = 0;
		
		// 10���� ������ ������ �ϸ� ������ �ڸ��� ��´�.
//		System.out.println(12345%10);
		
		// num 12345, 1234, 123, 12, 1
		while(num>0) {
			System.out.println(num%10);
			sum +=num%10;
			System.out.println("sum="+sum + ",num%10="+num%10);
			num = num/10;
			
		}

		System.out.println("�� �ڸ����� ��:"+sum);
	}
}