import java.util.Scanner;
import java.util.Date;

class CancerTest05{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();

      String name;
      int userYear;
      int thisYear = today.getYear()+1900;
      
   
      System.out.println("�̸��� �Է��ϼ���");
      name = sc.next();
      System.out.println("����⵵�� �Է��ϼ���");
      userYear = sc.nextInt();
      int age = thisYear - userYear;

      if(age >= 40 && thisYear % 2 == userYear % 2)
         System.out.println(name + "��," + thisYear + "�⵵�� ���� �ϰ��� ������Դϴ�.");
      else
         System.out.println(name + "��," + thisYear + "�⵵�� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
   }
} 