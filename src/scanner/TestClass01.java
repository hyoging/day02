package scanner;

import java.util.Scanner;

public class TestClass01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		String name;
		
		System.out.print("이름입력 : ");
		name = scan.next();
		
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		
		System.out.println("이름 : "  + name);
		System.out.println("입력 수 : " + num);
	}

}
