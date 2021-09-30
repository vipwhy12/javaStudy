import java.util.Scanner;

class Test09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("첫번째 값을 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력하시오");
		b = sc.nextInt();
		System.out.println((a >b)? "입력한" + a + "가 더 큽니다.":"입력한 " + b + "가 더 큽니다.");
	}
}
