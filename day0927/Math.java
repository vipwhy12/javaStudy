import java.util.Scanner;
class Math{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a, b, plus, multiply, division ;
      
      System.out.println("�ϳ��� ������ �Է��ϼ���");
      a = sc.nextInt();
      System.out.println("�ٸ� �ϳ��� ������ �Է��ϼ���");
      b = sc.nextInt();
      plus = a + b;
      multiply = a * b;
      division = a / b;

      System.out.println("**������**");
      System.out.println("����:" + plus);
      System.out.println("����:" + multiply);
      System.out.println("������:" + division);
   }
 
}
