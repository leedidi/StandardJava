package ch02;

public class VarEx3 {

	public static void main(String[] args) {
	  boolean power = true;
	  
	  byte b = 127; // -128~127
	  System.out.println(power);

	  int oct = 010;//8����, 10������ 8
	  int hex = 0x10;//16����, 10������ 16
	  
	  long l = 10_000_000_000L;
	  
	  float f = 3.14f;
	  double d = 3.14f;
	  System.out.println(10.);
	  System.out.println(.10);
	  System.out.println(10f);
	  System.out.println(1e3);
	  
	  char ch = 'A';
	  int i = 'A';
	  
	  String str = ""; //�� ���ڿ�(empty string_
	  String str2 = "ABCD";
	  String str3 = "123";
	  String str4 = str2+str3;
	  System.out.println(""+7+7);
	  System.out.println(7+7+"");
}
} 