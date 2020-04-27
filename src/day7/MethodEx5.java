package day7;
import java.util.Scanner;
public class MethodEx5 {

	public static void main(String[] args) {
		/*
		 * 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드
		 * 매개변수 : 정수 = > int num
		 * 리턴타입 : 소수인지 아닌지 => 참,거짓 => int => double
		 * 메서드명 : isPrime
		 * */
	int num = 1;
		if(isPrime(num)) {
		System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수 아님");
		}
		if(isPrime2(num)) {
		System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수 아님");
			}
	}

	public static boolean isPrime2(int num){
		int cnt = 0;
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				return false;
					
			}
		
		}if(num == 1)
			return false;
		return true;
	
	}	
	public static boolean isPrime(int num){
		if(num == 1)
			return false;
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		
		}
		return true;
	}	
}

