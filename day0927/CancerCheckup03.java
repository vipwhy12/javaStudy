import java.util.Scanner;
class CancerCheckup03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int year,age;
   
      System.out.println("�̸��� �Է��ϼ���");
      name = sc.next();
      System.out.println("����⵵�� �Է��ϼ���");
      year = sc.nextInt();
      age = 2021 - year;
      

      if(age >= 40)
         System.out.println(name + "���� ���� �ϰ��� ������Դϴ�.");
      else
         System.out.println(name + "���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
   }
} 