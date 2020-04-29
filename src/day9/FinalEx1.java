package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		/* 지역변수는 자동 초기화가 안됨 */
		final double 
		PI = 3.141592;
		// PI = 3.14; 에러발생 : 초기화된 final 상수를 수정하려 했지 때문에 
		A a = new A();
		a.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
		//att.length = 11;  에러발생 : final 변수이므로 수정할 수 없음
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		//System.out.println(array.get(3));
		//System.out.println(array.get(4));
		for(int i=0; i<5; i++) {
			System.out.println(array.pop());
		}
	}
}
final class A{
	public void print() {
		System.out.println("A클래스 입니다.");
	
	}
}
class B{ //Extends A{ 클래스 A는 final 클래스이기 때문에 상속하려면 에러발생
	
}
class D{
	// print 메서드에 final을 붙이면 아래 클래스 E에서 print 메서드를 오버라이드 할 수 없다.
	public /*final*/ void print() {
		System.out.println("D클래스 입니다.");
	}

}
class E extends D{
	@Override
	public void print() {
		System.out.println("E클래스 입니다.");
	}
}
class Array{
	public final int length;
	private int arr[];
	private int index = 0;	
		public Array() {
			length = 10;
			arr = new int[length];
		}
		public Array(int length) {
			this.length = length;
			arr = new int[length];
		}
		public void push(int num) {
			if(index < length) {
				arr[index] = num;
				index++;	
			}
		/*
		 * else{
		 *   1. 안내 메세지만 처리
		 *   2. 배열의 확장하여 추가하는 경우*
		 * }   
		 */
		}
		public int get(int index) {
			if(this.index > index) {
				return arr[index];
			}
			return 0 ; //잘못된접근이기 때문에 예외처리 클래스를이용하여 처리해야하는데 아직안배워서 0으로처리함.
		}
		public int pop(){
			if(index == 0) {
				return 0; // throw를 이용하여 예외를 발생시켜야하는데 아직 안배워서 그냥 0으로 리턴함.
			}
			index --;
			int res = arr[index];
			return arr[index];
		// return arr[index--];
		}
}