import java.util.Scanner;

class AverageTest 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		double avg;
		String name;

	 	System.out.println("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("��������� ������ �Է��Ͻÿ�");
		kor = sc.nextInt();
		System.out.println("���а����� ������ �Է��Ͻÿ�");
		math = sc.nextInt();
		System.out.println("���� ������ ������ �Է��Ͻÿ�");
		eng = sc.nextInt();
		avg = ( kor + eng + math ) / 3.0;

		if (avg > 60)
		System.out.println(name + "���� ���������" + avg +"�̸� �հ��Դϴ�." );
		else
		System.out.println(name + "���� ���������" + avg +"�̸� ���հ��Դϴ�." );
		{
		}
	}
}
