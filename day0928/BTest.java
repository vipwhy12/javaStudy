import java.util.Scanner;

class BTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		boolean falg;


		System.out.println("문자열을 입력하세요");
		data = sc.next();

		if (data.length() == 4)
			System.out.println(true);
		else
			System.out.println(false);

		//result = data.length() >= 4
		{
		}
	}
}
