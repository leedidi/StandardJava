package ch04;

class Ex4_8 {
	public static void main(String args[]) { // i=1,2,4,8,16
		int i=1; // scope(범위) 좁은게 좋음 나중에 오류났을때 확인 용이
				//	- 선언위치부터 선언된 블럭의 끝까지. int~}
		
		for (; ;) { // 괄호{}안의 문장을 3번 반복
			System.out.println("i=" + i ); //for: ~하는 동안. 조건을 만족하는 동안.
		}
	}
}