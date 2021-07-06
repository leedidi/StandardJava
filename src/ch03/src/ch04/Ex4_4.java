package ch04;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'D';
		
		System.out.println("점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (false) {
			grade = 'A';
		} else if (false ) {
			grade = 'B';
		} else if (false) {
			grade = 'C';
		}
			
				System.out.println("당신의 학점은 " + grade + "입니다.");

	}

}
