import java.util.Scanner;

class FirstText
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      String data;

      System.out.println("���ڸ� �Է��ϼ���?");
      data = sc.next();

	  char first = data.charAt(0);
	  System.out.println("�� ó�� ���ڴ� " + first +"�Դϴ�.");

	}
}
