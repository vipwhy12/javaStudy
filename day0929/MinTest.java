
import java.util.Scanner;

class MinTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b;

		System.out.println("�ϳ��� ������ �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("�ٸ� �ϳ��� ������ �Է��ϼ���");
		b = sc.nextInt();
		

		if(a < b)
		System.out.println("���� ���� "+ a +"�Դϴ�.");
		else
		System.out.println("���� ����" + b + "�Դϴ�.");
	}
}
