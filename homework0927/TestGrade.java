import java.util.Scanner;

class TestGrade{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com, clan, eng, math;

      System.out.println("��ǻ�� ���� ������ ������ �Է��ϼ���.");
      com = sc.nextInt();

      System.out.println("C��� ���α׷��� ������ ������ �Է��Ͻÿ�.");
      clan = sc.nextInt();

      System.out.println("���� ������ ������ �Է��ϼ���");
      eng = sc.nextInt();

      System.out.println("�Ϲ� ���� ������ ������ �Է��ϼ���");
      math = sc.nextInt();


      System.out.println("��� ������" + (com + clan + eng + math)/4  + "�Դϴ�.");
      

   }
}