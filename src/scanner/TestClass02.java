package scanner;

public class TestClass02 {

	public static void main(String[] args) {
		
		/*
		 *초기화 방법
		 *- 자료형의 첫 문자가 소문자면 0으로 초기화한다.
		 *- 자료형의 첫 무낮가 대문자면 null로 초기화 한다
		 */
		
		int num = 0;
		String name = null;
		
		System.out.println(name);
		System.out.println(num);
		
		int kor = 0, eng =0 , sum;
		
		sum = kor + eng;
		System.out.println("kor + eng =" + sum);
	}

}
