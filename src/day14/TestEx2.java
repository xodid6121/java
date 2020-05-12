package day14;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문)2 주민등록 번호를 입력하여 남자인지 여자인지 판별하세요.
		 * 예)
		 * 주민번호를입력하세요 : 021001 - 3000110
		 * 해당 주민번호는 남성입니다.
		 * */
		
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 :");
		registerNum = scan.nextLine();
		registerNum = registerNum.replaceAll("-","");   // -제거
		registerNum = registerNum.replaceAll("","");    // 공백제거
		if(registerNum.length() !=13) {
			System.out.println("주민번호 길이가 잘못되었습니다.");
			return;
		}
		char gender = registerNum.charAt(6);
		switch(gender) {
		case '1' : case '3' : case '9' :
			System.out.println("해당 주민번호는 남성입니다.");
			break;
		case '2' : case '4' : case '0' :
			System.out.println("해당 주민번호는 여성입니다.");
			break;	
		case '5' : case '7' : 
			System.out.println("해당 주민번호는 외국인 남성 입니다.");
			break;
		case '6' : case '8' : 
			System.out.println("해당 주민번호는 외국인 여성 입니다.");
			break;
		}
	}
}
