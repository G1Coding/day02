package day02;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		System.out.println("[나이 계산 프로그램]");
		System.out.print("올해의 년도를 4자리로 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int currentYear = input.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요: ");
		int myYear = input.nextInt();
		int yourAge = currentYear - myYear;
		System.out.println("===> 당신의 나이는 "+ yourAge + "살 입니다.");

		System.out.println();

		System.out.println("[엘리베이터에 적재 가능한 무게 구하기]");
		System.out.print("첫 번째 물건의 무게를 입력하세요: ");
		double firstWeight = input.nextDouble();
		System.out.print("첫 번째 물건의 무게를 입력하세요: ");
		double secondWeight = input.nextDouble();
		double canWeight = 600 - (firstWeight + secondWeight);
		System.out.println();
		System.out.println("현재 엘리베이터에 허용 무게는 " + canWeight + "kg 입니다");
		
	}
}
