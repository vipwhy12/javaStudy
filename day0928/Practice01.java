import java.util.Scanner;

class Practice01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		int cnt = 0;
		char ch;
		

		System.out.println("���ڸ� �Է��ϼ���");
		data = sc.next();

		for(int i = 0 ; i < data.length() ; i = i + 1  ){
			ch = data.charAt(i);
			if (ch == 'o')
				cnt = cnt + 1;
			{
			}

		}



		System.out.println("�ҹ��� o�� ������ " + cnt);

	}
}
