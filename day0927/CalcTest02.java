import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int a, b;
      Scanner sc = new Scanner(System.in);
      System.out.println("�ϳ��� ������ �Է��ϼ���");
      a = sc.nextInt();
      System.out.println("�ٸ� �ϳ��� ������ �Է��ϼ���");
      b = sc.nextInt();
   

      System.out.println("**������**");
      System.out.println("����:" + (a + b));
      System.out.println("����:" + (a - b));
      System.out.println("����:" + (a * b));
      System.out.println("������:" + (a / b));
   }
 
}
