import java.util.Scanner;

class FirstText
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      String data;

      System.out.println("문자를 입려하세요?");
      data = sc.next();

	  char first = data.charAt(0);
	  System.out.println("맨 처음 문자는 " + first +"입니다.");

	}
}
