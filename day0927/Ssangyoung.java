import java.util.Scanner;
class Ssangyoung {
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      
      String name;
      int age, hight;

      System.out.println("이름을 입력하세요");
      name = sc.next();
      System.out.println("나이를 입력하세요");
      age = sc.nextInt();
      System.out.println("키를 입력하세요");
      hight = sc.nextInt();
      

      if(age >= 20 && hight <=160 )
         System.out.println("입장가능");
      else
         System.out.println("입장불가능");
   }
}