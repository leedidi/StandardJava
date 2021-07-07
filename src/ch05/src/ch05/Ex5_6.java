package ch05;

class Ex5_6 {
	public static void main(String[] args) {
		//012345
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1, str.length()); //1~4
		String str4 = str.substring(1); //1~4
		System.out.println(str3); //BCD
	} 
}