import java.util.Scanner;
class Ssangyoung {
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      
      String name;
      int age, hight;

      System.out.println("�̸��� �Է��ϼ���");
      name = sc.next();
      System.out.println("���̸� �Է��ϼ���");
      age = sc.nextInt();
      System.out.println("Ű�� �Է��ϼ���");
      hight = sc.nextInt();
      

      if(age >= 20 && hight <=160 )
         System.out.println("���尡��");
      else
         System.out.println("����Ұ���");
   }
}