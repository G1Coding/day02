package day02;

import java.util.Scanner;

public class Problem06 {
	 public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.print("학생 이름: ");
		String name = input.next();
		
		System.out.print("국어 점수: ");
		int korScore = input.nextInt();
		
		System.out.print("영어 점수: ");
		int engScore = input.nextInt();
		
		System.out.print("수학 점수: ");
		int mathScore = input.nextInt();
		
		int finalScore = korScore+engScore+mathScore;
		double average = (korScore+engScore+mathScore)/3.0;
		
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%.2f", average));
		
		System.out.println("====================학생 정보====================");
		System.out.println("이름 \t국어 \t영어 \t수학 \t합계 \t평균 \t");
		System.out.println("-----------------------------------------------");
		System.out.println(name +"\t"+ korScore +"\t"+ engScore +"\t"+ mathScore +"\t"+ finalScore +"\t"+ sb.toString());

	}
}
