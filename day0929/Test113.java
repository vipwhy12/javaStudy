import java.util.Scanner;

class Test113
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("1 부터 어떤 수까지 더할까요? 정수를 입력하시오");
		a = sc.nextInt();


		for(int i = 1; i <= a ; i++){
			total += i;
		}
		System.out.println(total);

	}
}
