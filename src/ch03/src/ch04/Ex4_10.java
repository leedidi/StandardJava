package ch04;

class Ex4_10 {
	public static void main(String[] args) { 
		int sum = 0;	// 합계를 저장하기 위한 변수.
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;

		for(int i=1; i <= 5; i++) {
			sum += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	} // main의 끝 // 처음 코드짤때는 제일 쉬운 방법으로라도 짜기! 그이후 어떻게 더 좋은
	//코드로 바꿀까 고민하기. 그러면 좀 보임. 이 과정 꼭 거치기!
}