package ch04;

class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// ��ȣ{} ���� ������ 20�� �ݺ��Ѵ�.
		// Quiz. 1~10 ������ ������ 20�� ����Ͻÿ�.
		// Quiz2. -5~5 ������ ������ 20�� ����Ͻÿ�.
		// -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 = 11��
		for (int i = 1; i <= 10; i++) {
//			System.out.println(Math.random());//0.0 <= x < 1.0
//			System.out.println(Math.random()*10); //0.0<=x<10.0
//			System.out.println((int)(Math.random()*10)); //0<=x<10, 1~10
			System.out.println((int)(Math.random()*11)-5); //-5=x<6, -5~5
		}
	}
}