package day02;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		
		int num, num1, num2;
		String result, result2, result4, result5, result6;
		int result3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력: ");
		num = input.nextInt();
		result = (num%2==0) ? "짝수" : "홀수";
		result2 = (num%3==0) ? "3의 배수이다": "3의 배수가 아니다";
		
		System.out.println(num+ " = " + result);
		System.out.println(num+ " = " + result2);
		
		System.out.print("두 수 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("num1 : " + num1 + " ,num2 : "+ num2);
		result3 = num1>num2 ? num1 : num2;
		result5 = num1<num2 ? "num1" : "num2";
		result6 = num1>num2 ? "num1" : "num2";

		System.out.println(result6+ "가 "+ result5+ "보다 크다");
		result4 = result3%2==0 ? "큰수는 짝수입니다": "아님";
		System.out.println(result4);
		
		System.out.println();
		System.out.println();
		
	}
}
