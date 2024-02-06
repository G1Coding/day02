package day02;
//형 변환
public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		int num = ch; //자동 형 변환
		System.out.println(num);
		char ch02 = (char)num; //강제 형 변환
		System.out.println(ch02);
		
	
		double d = 1.111;
		float f = 1.111f;
		
		System.out.println(d);
		System.out.println(f);
	}
}
