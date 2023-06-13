package scanner;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {
		
		String name;
		int kor =0, eng = 0, mat=0, sum; 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================");
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = scan.next();
		
		System.out.println("===========================");
		
		System.out.print(name + " 님의 국어 점수 : ");
		kor = scan.nextInt();
		
		System.out.print(name + " 님의 영어 점수 : ");
		eng = scan.nextInt();
		
		System.out.print(name + " 님의 수학 점수 : ");
		mat = scan.nextInt();
		
		System.out.println("===========================");
		
		sum = kor + eng + mat;
		System.out.println("합계 : " + sum);
		
		System.out.println("===========================");
		
	}

}
