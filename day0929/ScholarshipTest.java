import java.util.Scanner;

class ScholarshipTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int kor , eng, math, avg;
		String name;

		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.println("���������� �Է��Ͻÿ�");
		kor = sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�");
		eng = sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�");
		math = sc.nextInt();

		avg = (kor + eng + math)/3;



		if(avg >= 90 && kor >= 60)
			System.out.println("���ϴ� ���б��� ���� �� �ֽ��ϴ�.");
		else
			System.out.println("���б� ���� ����ڰ� �ƴմϴ�.");


	}
}
