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
     
   
      System.out.println("이름을 입력하세요");
      name = sc.next();
      System.out.println("출생년도를 입력하세요");
      userYear = sc.nextInt();
      age = thisYear - useryear;
      System.out.println("올해는" + thisYear+"년도입니다.");

      if(age >= 40)
         System.out.println(name + "님은 무료 암검진 대상자입니다.");
      else
         System.out.println(name + "님은 무료 암검진 대상자가 아닙니다.");
   }
} 