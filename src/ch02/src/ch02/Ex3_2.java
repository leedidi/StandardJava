package ch02;

public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5, j=0;
		j = i++; // 후위형
		System.out.println("i=" +i + " j는"+ j + " i+j는 " + (i+j));

		j = ++i; //전위형
		System.out.println("i=" +i + " j는"+ j + " i+j는 " + (i+j));
				}

}
