package day9;

public class OverloadEx2 {

	public static void main(String[] args) {
		//기능 : 두 정수의 합을 알려주는 메서드
		//기능 : 두 실수의 합을 알려주는 메서드
		//기능 : 세 실수의 합을 알려주는 메서드
		
		//아래 코드는 sum 메서드에 static이 안붙는 경우 호출하는 방법
		//OverloadEx2 obj + new OverloadEx2();
		System.out.println(sum(1,2));
		System.out.println(sum(1.1,2.1));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum('1',2,3,4,5)); // 아스키코드 문자1 = 49 자동자료형변환이된다. 
		// System.out.println(sum("1",2,3,4,5));  에러발생 문자열은 자동자료형변환이 안된다. 
											  
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	//가변인자를 이용한 합계구하는 메소드
	public static double sum(double ...nums) {
		double res = 0.0;
		for(double tmp : nums) {
			res += tmp;
		}	return res;
	}	
}

//public static int sum(int num1, int num2) {
//	return num1 + num2;

