package ch04;

class Ex4_8 {
	public static void main(String args[]) { // i=1,2,4,8,16
		int i=1; // scope(����) ������ ���� ���߿� ���������� Ȯ�� ����
				//	- ������ġ���� ����� ���� ������. int~}
		
		for (; ;) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("i=" + i ); //for: ~�ϴ� ����. ������ �����ϴ� ����.
		}
	}
}