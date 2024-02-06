package day02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		
		String name;
		int korGrade, engGrade, mathGrade;
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		System.out.print(name + "님의 국어 점수 : ");
		korGrade = input.nextInt();
		System.out.print(name + "님의 영어 점수 : ");
		engGrade = input.nextInt();
		System.out.print(name + "님의 수학 점수 : ");
		mathGrade = input.nextInt();

	
		int sumGrade = korGrade + engGrade + mathGrade;
		
		System.out.println();
		System.out.println();
		System.out.println("==============");
		System.out.println("이 름 : "+ name);
		System.out.println("==============");
		System.out.println("국 어 : "+ korGrade);
		System.out.println("영 어 : "+ engGrade);
		System.out.println("수 학 : "+ mathGrade);
		System.out.println("==============");
		System.out.println("합 계 : " + sumGrade);
		System.out.println("==============");
		
	}
}
