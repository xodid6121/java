package day17;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
	
	
/* 기능 : 두 정수의 합을 반환하는 메소드
 * 
 * 기능 : 두 정수의 차를 반환하는 메소드
 * 
 * 기능 : 두 정수의 곱을 반환하는 메소드
 * 
 * 기능 : 정수A를 정수B로 나눈 결과를 반환하는 메소드
 * 
 * 기능 : 정수A를 정수B로 나눈 결과를 반환하는 메소드
 * 
 * 기능 : 정수A와 정수B를 산술연산자  op의 결과를 반환하는 메소드
 */
		
//
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요. 예) 1 + 1 = 2");
		int num1; 
		char op; 
		int num2;
		try {
			num1 = scan.nextInt();
			op = scan.next().charAt(0);
			num2 = scan.nextInt();
		 System.out.printf("%d %c %d = %.2f\n",num1,op,num2,math(num1,op,num2));
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
		scan.close();
	}
		
	public static int sum(int a, int b) {
	return a+b;
	}
	public static int sud(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return (double) a/b;
	}
	public static int mod(int a, int b) {
		return a%b;
	}
	public static double math(int a, char op ,int b) {
		 switch(op) {
		 case '+' : return sum(a,b);
		 case '-' : return sud(a,b);
		 case '*' : return mul(a,b);
		 case '/' : 
		 	if(b == 0)
		 		throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다. " );
		 	return div(a,b);
		 case '%' : 
		 	if(b == 0)
		 		throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다. " );
		 	return mod(a,b);
		 default: 
			 throw new ArithmeticException("예외 발생: " + op + "는 산술 연산자가 아닙니다." );
		 }
		
}
}
