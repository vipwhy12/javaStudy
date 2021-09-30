import java.util.Scanner;

class AgeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a_age, b_age;
		String a,b;

		System.out.println("이름을 입력하시오");
		a = sc.next();
		System.out.println("나이를  입력하시오");
		a_age = sc.nextInt();

		System.out.println("이름을 입력하시오");
		b = sc.next();
		System.out.println("나이를  입력하시오");
		b_age = sc.nextInt();

		if (a_age == b_age)
			System.out.println("두 사람의 나이가 같습니다.");
		else
			System.out.println("두 사람의 나이가 다릅니다.");



	}
}
