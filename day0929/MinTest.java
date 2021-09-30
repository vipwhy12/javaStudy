
import java.util.Scanner;

class MinTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b;

		System.out.println("하나의 정수를 입력하세요");
		a = sc.nextInt();
		System.out.println("다른 하나의 정수를 입력하세요");
		b = sc.nextInt();
		

		if(a < b)
		System.out.println("작은 수는 "+ a +"입니다.");
		else
		System.out.println("작은 수는" + b + "입니다.");
	}
}
