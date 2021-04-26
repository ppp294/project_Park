package day1;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		System.out.print("정수를 입력하세요 : "); 
	    int num1 = scan.nextInt();
	    System.out.println("입력받은 값 : "+ num1);
	    
	    System.out.println("문자를 입력하세요");
	    char ch = scan.next().charAt(0);
	    System.out.println("입력받은 값 : "+ ch);
	    
	    System.out.println("정수2를 입력하세요");
	    int num2 = scan.nextInt();
	    System.out.println(""+ num1  + ch + num2);
	    
	    System.out.println("두 정수와 문자를 입력하세요   (예: 1 + 2) : ");
	     num1 = scan.nextInt();
	     ch = scan.next().charAt(0);
	    num2 = scan.nextInt();
	    System.out.println(""+ num1 + ch + num2);
	    
	    scan.close();
	}

}
