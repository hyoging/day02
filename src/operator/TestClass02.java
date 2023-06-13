package operator;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int su;
		System.out.print("수 입력 : ");
		su = input.nextInt();
		String s = (su % 2 == 0)?"짝수":"홀수";
		System.out.println(su+" = "+s);

		s = (su % 3 == 0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(su+" = "+s);
		
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		s = (num1 > num2)?"num1이 num2보다 크다":
			"num2가 num1보다 크다";
		System.out.println("num1 : "+num1+" ,num2 : "+num2);
		System.out.println(s);

//		int num = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("수 입력 : ");
//		num = scan.nextInt();
//		
//		boolean result; 
//		result = (num%2)==0 && (num%3)==0;
//		System.out.println(num + " = 짝수");
//		System.out.println(num + " = 3의 배수이다");
//		
//		result = (num%2)==0 || (num%3)==0;
//		System.out.println(num + " = 홀수");
//		System.out.println(num + " = 3의 배수가 아니다");
		
	}

}
