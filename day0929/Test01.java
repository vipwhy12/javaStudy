import java.util.Scanner;

class Test01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price, number, total;
		String name;

		System.out.println("��ǰ���� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("���ż����� �Է��Ͻÿ�");
		number = sc.nextInt();
		System.out.println("�ܰ��� �Է��Ͻÿ�");
		price = sc.nextInt();

		total = (number * price);

		if(number >= 10 || price >= 20000)
			System.out.println("10%������ �����մϴ�" + (total - (total * 0.1)) + "�Դϴ�." );
		else
			System.out.println("�ѱݾ�" + total);
			
	}
}