import java.util.Scanner;


public class Gugudan {

	public static void main(String[] args) {
		//2단
		
	// 4단
		System.out.println("4단");
		int result = 4*1;
		System.out.println(result);
		result = 4 *2;
		System.out.println(result);
		result = 4 *3;
		System.out.println(result);
		result = 4 *4;
		System.out.println(result);
		result = 4 *5;
		System.out.println(result);
		result = 4 *6;
		System.out.println(result);
		result = 4 *7;
		System.out.println(result);
		result = 4 *8;
		System.out.println(result);
		result = 4 *9;
		System.out.println(result);
		
		
		System.out.println("입력할 수:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println(number* 1);
		System.out.println(number* 2);
		System.out.println(number* 3);
		System.out.println(number* 4);
		System.out.println(number* 5);
		System.out.println(number* 6);
		System.out.println(number* 7);
		System.out.println(number* 8);
		System.out.println(number* 9);
	
		
		int j = 1;

			while(j < 10) {
				System.out.println(j * 6);
				j = j + 1;
			}
		
		
	}

}
