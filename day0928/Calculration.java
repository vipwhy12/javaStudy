import java.util.Scanner;

class Calculration 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, add, mul, mi, c, mode;


		System.out.println("첫번째 수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
		b = sc.nextInt();

		add = a + b;
		mi = a - b;
		mul = a * b;
		c = a / b;
		mode = a % b;

		System.out.println(a + "+" + b + "=" + add);
		System.out.println(a + "-" + b + "=" + mi);
		System.out.println(a + "*" + b + "=" + mul);
		System.out.println(a + "/" + b + "=" + c);
		System.out.println(a + "%" + b + "=" + mode);
	
	}
}
