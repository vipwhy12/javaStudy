import java.util.Scanner;
class CancerCheckup{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int year,age;
   
      System.out.println("이름을 입력하세요");
      name = sc.next();
      System.out.println("출생년도를 입력하세요");
      year = sc.nextInt();
      age = 2021 - year;
      

      if(age >= 40)
         System.out.println(name + "님은 무료 암검진 대상자입니다.");
      else
         System.out.println(name + "님은 무료 암검진 대상자가 아닙니다.");
   }
} 