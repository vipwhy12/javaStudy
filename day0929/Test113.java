import java.util.Scanner;

class Test113
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("1 ���� � ������ ���ұ��? ������ �Է��Ͻÿ�");
		a = sc.nextInt();


		for(int i = 1; i <= a ; i++){
			total += i;
		}
		System.out.println(total);

	}
}