package day3;

import java.util.Scanner;

public class arrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /* 배열이없으면 아래와 같이 5개의 정보를 입력받아 저장하려면 5개의변수를 선언하고
          * scanner를 통해 5번 직접 입력받는 코드를 작성해야한다.
          * 하지만 배열을 이용하면 효율적으로 입력받는 코드를 작성할수있다.
          */
		int n1,n2,n3,n4,n5;
         Scanner scan=new Scanner(System.in);
         n1 = scan.nextInt();
         n2 = scan.nextInt();
         n3 = scan.nextInt();
         n4 = scan.nextInt();
         n5 = scan.nextInt();
	
       
     
        	scan.close();
	}
}