import java.util.Scanner;


public class Gugudan {

	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i<result.length ; i++) {

			result[i] = (i+1) * times;
		}
		return result;	}
	
	public static void print(int[] result)
	{
		for(int i = 0; i <10; i++) {
			System.out.println(result[i]);
		}
	}


	public static void main(String[] args) {

	
		int[] a = calculate(5);
		print(a);
	}
}
//
//
//		// 8단
//		System.out.println("원하는 구구단의 수를 입력하세요:");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값:" + number );
//
//		if ( number < 2) {
//			System.out.println("값을 잘못 입력했습니다.");
//		}
//		else if(number > 9)
//		{
//			System.out.println("값을 잘못 입력했습니다.");
//
//		}
//	}






//		int[] result = new int[9];
//
//		for (int i = 0; i<result.length; i++)
//		{
//			result[i] = 2 * (i + 1);
//		}
//
//		for (int i = 0; i<result.length; i++)
//		{
//			System.out.println(result[i]);
//		}
//
//	}
//}
// 4단
//		System.out.println("4단");
//		int result = 4*1;
//		System.out.println(result);
//		result = 4 *2;
//		System.out.println(result);
//		result = 4 *3;
//		System.out.println(result);
//		result = 4 *4;
//		System.out.println(result);
//		result = 4 *5;
//		System.out.println(result);
//		result = 4 *6;
//		System.out.println(result);
//		result = 4 *7;
//		System.out.println(result);
//		result = 4 *8;
//		System.out.println(result);
//		result = 4 *9;
//		System.out.println(result);
//
//
//		System.out.println("입력할 수:");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//
//		System.out.println(number* 1);
//		System.out.println(number* 2);
//		System.out.println(number* 3);
//		System.out.println(number* 4);
//		System.out.println(number* 5);
//		System.out.println(number* 6);
//		System.out.println(number* 7);
//		System.out.println(number* 8);
//		System.out.println(number* 9);
//
//
//		int j = 1;
//
//		while(j < 10) {
//			System.out.println(j * 6);
//			j = j + 1;
//		}
//



