import java.util.Scanner;

public class zadachki {

	public static void main(String[] args) {
		
//	zad 1
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int b;
//		int sum;
//		
//		
//		System.out.println("Enter first num");
//		 a = sc.nextInt();
//		
//		System.out.println("Enter second num");
//		 b = sc.nextInt();
//		
//		 sum = a+b;
//		
//		System.out.println("Sum is: " + (a+b));
//		System.out.printf("Sum is %d ", sum);
		
//		//zad 2.Напишете приложение, което извежда числата от 1 до 4 на един
//		ред,разделени със запетая и шпация след нея.Използвайте следните
//		технки
		
//		int a = 1,
//		    b = 2,
//		    c = 3,
//		    d = 4;
		
		/*System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		System.out.print(a + ", ");
		System.out.print(b + ", ");
		System.out.print(c + ", ");
		System.out.print(d);
		
		System.out.println();
		System.out.println(a + ", " + b + ", " + c + ", " + d);	*/
		
		//3 Напишете приложение, което имплементира следния алгоритъм :
//		1. Прочетете цяло число x от клавиатурата
//		2.Отпечатайте x
//		3.Разделете x на две
//		4.Отпечатайте x
//		5.Умножете x по 3 и прибавете 1
//		6.Отпечатайте x
		
		Scanner scc = new Scanner(System.in);
		
		System.out.println("enter num");
		int a = scc.nextInt();
		
		int sum = a/2;
		int sum2 = (a*3) + 1;
		
		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Sum2 is %d", sum2);
	}

}
