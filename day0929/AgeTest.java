import java.util.Scanner;

class AgeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a_age, b_age;
		String a,b;

		System.out.println("�̸��� �Է��Ͻÿ�");
		a = sc.next();
		System.out.println("���̸�  �Է��Ͻÿ�");
		a_age = sc.nextInt();

		System.out.println("�̸��� �Է��Ͻÿ�");
		b = sc.next();
		System.out.println("���̸�  �Է��Ͻÿ�");
		b_age = sc.nextInt();

		if (a_age == b_age)
			System.out.println("�� ����� ���̰� �����ϴ�.");
		else
			System.out.println("�� ����� ���̰� �ٸ��ϴ�.");



	}
}
