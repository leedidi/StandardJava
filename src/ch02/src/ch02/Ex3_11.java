package ch02;

public class Ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592; //3.141을 얻으려면?
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //3
		System.out.println((double)Math.round(pi*1000)/1000.0); //3
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000.0);
	}

}
