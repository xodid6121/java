package day1;

import java.util.Scanner;

public class ExamVariavle {
		  public static void main(String[] args) {
		   /*콘솔에 원하는 문자열을 출력한 후에 
		   엔터를 치는 것(메소드)*/
		  System.out.println("Hello world!");
		  
		  System.out.println(7+7);
		  
		  System.out.println(""+7+7);
		 
		  System.out.println();
		 
		  System.out.print("안녕\n"); 
		  
		  System.out.println(""+(7+7));
		  
		  int num1 = 10, num2 = 20;
		  
		  System.out.println(num1 + "," + num2);
		  
		  System.out.printf("%2d,%d2\n",num1,num2);
		  
		  double dnum = 1.23;
		  System.out.println(dnum);
		  System.out.printf("%f\n", dnum);
		  System.out.printf("%6.3f\n", dnum);
		  
		  Scanner scan = new Scanner(System.in);
		  int num = scan.nextInt();
		  System.out.println(num);
		  char ch = scan.next(). charAt(2);
		  System.out.println(ch);
		  scan.close();
		  //문자열을 관리하는 String 클래스
		  String str = new String();
		  str = scan.next();
		  System.out.println(str);
		  scan.close();
		  
		  
		  
		  
		  
		  
		  
		  }

}
