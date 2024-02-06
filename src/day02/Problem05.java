package day02;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		System.out.println("[표준 체중 구하기]");
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		int myHeight = input.nextInt();
		double sWeight = (myHeight-100)*0.9;
		System.out.println("표준 체중은 "+ sWeight + "입니다.");
		
		System.out.println();
		
		System.out.println("[비만도 계산]");
		System.out.print("키를 입력하세요: ");
		myHeight = input.nextInt();
		System.out.print("현재 체중을 입력하세요: ");
		int myWeight = input.nextInt();
		double fatPercent = (myWeight/sWeight)*100;
	
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%.2f", fatPercent));
		
		
		System.out.println("표준 체충은 "+ sWeight + "이고 비만도는 " + sb.toString() +"입니다");
		System.out.printf("표준 체충은 "+ sWeight + "이고 비만도는 %.2f입니다" , fatPercent);
		
	}
}
