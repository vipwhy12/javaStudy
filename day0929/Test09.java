import java.util.Scanner;

class Test09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("ù��° ���� �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		b = sc.nextInt();
		System.out.println((a >b)? "�Է���" + a + "�� �� Ů�ϴ�.":"�Է��� " + b + "�� �� Ů�ϴ�.");
	}
}