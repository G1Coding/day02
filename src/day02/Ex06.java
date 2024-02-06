package day02;
//입력-Scanner

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//입력받은 값을 저장하기 위한 변수
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); // next(): 문자열 입력 시 사용되는 함수
		
		System.out.print("수 입력: ");
		num = input.nextInt(); // next(): 문자열 입력 시 정수만 받겠다
		
		System.out.println("이름 = "+ name);
		System.out.println("입력 수 = "+ num);
		
		double dou;
		System.out.println("실수 입력");
		dou = input.nextDouble();
		System.out.println("실수 : "+dou);
		
		
		
	}
}
