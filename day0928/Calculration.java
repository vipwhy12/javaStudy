import java.util.Scanner;

class Calculration 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, add, mul, mi, c, mode;


		System.out.println("ù��° ���� �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
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