package ch04; 

class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0)
				continue; //만족시키면 끝으로 감. print~건너뜀
			System.out.println(i);
		}
	}
}