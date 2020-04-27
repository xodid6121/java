package day7;

public class MethodEx6 {

	public static void main(String[] args) {
		/* 기능 : min~max사이의 임의의 정수를 생성하여 알려주는 메서드
		 * 매개변수 : 범위값중 => int max, min 
		 * 리턴타입 : 임의의 정수 => int
		 * 메서드명 : random
		 * */
		int max=5, min=1;
		int r = random(min,max);
		System.out.println(r);
	}
	
	public static int random(int min, int max) {
	   //1,9로 알려줘야하는데 9,1로 알려준 경우 1,9로 처리하기 위해 두 수를 교환
		if(min>max) {
		   int tmp = min;
		   min=max;
		   max=tmp;
	   }
	
		return (int)(Math.random()*(max - min + 1) + min);	
	}
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
			System.out.println();		
	}
}
