package day7;

import java.util.Scanner;

public class MethodEx420200427 {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);	
	System.out.println("숫자를입력하세요");
	int num = scan.nextInt();
	int start =10, end=19;
	int res = math(num, start, end);
	if(res == 0) {
		System.out.println("0단의 모든값은 0입니다.");
	}
	else if(res == -1) {
		System.out.println("구구단의시작 번호와 끝 번호가 바뀌어습니다.");
	}
	
		scan.close();
	}
	
	/*기능: num가 주어지면 주어진 num단(구구단)을 출력하는 메서드
	 * 매개변수 : num단 => int num, 단의 끝=> int num, int start, int end
	 * 리턴타입 : 0 => 0단이입력됨 =>출력안함
	 * 		   1 => 정상출력
	 * 		   -1=>start > end 경우 => 출력안함
	 * 			정수형=>int
	 * 매서드명 : math
	 * */
	
	public static int math(int num, int start, int end) {
		if(num ==0)
			return 0;
		if(start > end)
			return -1;
		for(int i = start; i <=end; i++) {
			System.out.printf("%d x %d = %d\n",	num ,i , num*i );
	}
	return 1;
	}
}