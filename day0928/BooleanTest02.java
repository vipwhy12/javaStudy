import java.util.Scanner;

class BooleanTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n;
		boolean a;

		System.out.println("N의 값을 입력하세요");
		n = sc.nextInt();
		a = n % 6 == 0;

		System.out.println(a);


		
		
	}
}
