import java.util.Scanner;
import java.until.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age, userYear;
      int thisYear;
      thisYear = today.getYear()+1900;
     
   
      System.out.println("�̸��� �Է��ϼ���");
      name = sc.next();
      System.out.println("����⵵�� �Է��ϼ���");
      userYear = sc.nextInt();
      age = thisYear - useryear;
      System.out.println("���ش�" + thisYear+"�⵵�Դϴ�.");

      if(age >= 40)
         System.out.println(name + "���� ���� �ϰ��� ������Դϴ�.");
      else
         System.out.println(name + "���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
   }
} 