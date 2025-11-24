package exam1124;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(num1 + num2);
			
			scanner.close();
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
		}
	}

}
