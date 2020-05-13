// ■ArrayList 예제----------------------------------------------------
package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTestEx1 {

	public static void main(String[] args) {
//		오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요.
//		예)
//		오늘의 할일을 추가하시겠습니까? (y/n) : y
//		오늘의 할일을 입력하세요 : 수업
//		오늘의 할일을 추가하시겠습니까? (y/n) : y
//		오늘의 할일을 입력하세요 : 점심
//		오늘의 할일을 추가하시겠습니까? (y/n) : n
//		오늘의 할일
//		1.수업
//		2.점심
//		프로그램을 종료합니다.
		
		
//	char work = 'y';
//	Scanner scan = new Scanner(System.in);
//	while(work == 'y') {
//		System.out.println("오늘의 할일을 추가하시겠습니까? (y/n) : ");
//		scan.nextLine();
//		if(work == 'y' || work == 'Y') {
//			System.out.println("오늘의 할일을 입력하세요.");
//			String toDo = scan.nextLine();
//		}else if(work == 'n' || work == 'N') {
//			System.out.println("검색을종료합니다.");
//			break;
//		}
			
			
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			System.out.println("오늘의 할일을 추가하시겠습니까? (y/n) : ");
		char work =scan.next().charAt(0);
		scan.nextLine();
		if(work == 'y' || work == 'Y') {
			System.out.println("오늘의 할일을 입력하세요.");
			String toDo = scan.nextLine();
			list.add(toDo);
		}else if(work == 'n' || work == 'N') {
			for(int i=0; i<list.size(); i ++)
				System.out.println(i+1+". "+list.get(i));
				
				break;
		}
		
		}
		System.out.println("검색을종료합니다.");
		scan.close();
	}
	
}

