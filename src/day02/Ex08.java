package day02;
//산술 연산자 + - * /(몫) %(나머지)
//복합 대입 연산자 += -= *= /= %=
//관계 연산자 : 두 연산자의 대소 비교 => 결과 T/F
//논리 연산자 || && ! (참/거짓을 판별)
//증감 연산자 ++ -- 전위 후위
//삼항 연산자(조건연산자) (a > b) ? c(true) : d(false)
public class Ex08 {
	public static void main(String[] args) {
		
		System.out.println("====산술연산자====");
		int n1=9, n2 =2;
		System.out.println( n1 / n2);
		System.out.println( n1 / (double)n2 ); // double로 강제 형변환 => 2.0
		System.out.println( n1 % n2 );
		
		System.out.println("====복합 대입 연산자====");
		n1 = n2 =5;
		n1 += 1;
		System.out.println( n1 );
		n1 -= 1;
		System.out.println( n1 );
		n1 *= n2;
		System.out.println( n1 );
		n1 /= n2;
		System.out.println( n1 );
		n1 %= n2;
		System.out.println( n1 );
		
		System.out.println("====관계 연산자====");
		n1 = 5;
		n2 = 2;
		System.out.println( n1 > n2 );
		System.out.println( n1 <= n2 );
		System.out.println( n1 == n2 );
		System.out.println( n1 != n2 );
		
		boolean bool = true; //boolean연산자는 true/false만 저장 가능
		bool = n1 > n2;
		System.out.println( bool );
		bool = n1 < n2;
		System.out.println( bool );

		System.out.println("====논리 연산자====");
		n1 = 5;
		n2 = 2;
		int n3 = 2;
		System.out.println( n1 > n2 || n1 < n3 );
		System.out.println( n1 > n2 && n1 < n3 );
		System.out.println( !(n1>n2) );
		
		System.out.println("====증감 연산자====");
		n1 = 5;
		++n1; // (전위) 증감 연산 - 어떠한 연산보다 자기 먼저 증감
		System.out.println( n1 );
		System.out.println("----------");
		n1 = 10;
		n2 = ++n1; // 증감 연산 -> 대입 연산 
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println();
		
		n2 = 5;
		n2++; // (후위) 증감 연산 - 연산 중 제일 마지막에 증감
		System.out.println( n2 );
		System.out.println("----------");
		n1 = 10;
		n2 = n1++; // 대입 연산 -> 증감 연산
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println();
		
		int a=5, b=6, c=10, d;
		d = ++a * b--;
		System.out.println(a+ ","+b+","+d);
		
		d = a++ + ++c - b--;
		System.out.println(a+ ","+b+","+c+ ","+ d);
		
		System.out.println("====삼항 연산자(조건연산자)====");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2)?"참인 경우 입니다": "거짓인 경우 입니다";
		System.out.println( result );
		
		
	}

}
