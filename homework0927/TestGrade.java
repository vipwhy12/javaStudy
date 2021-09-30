import java.util.Scanner;

class TestGrade{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com, clan, eng, math;

      System.out.println("컴퓨터 개론 과목의 점수를 입력하세요.");
      com = sc.nextInt();

      System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오.");
      clan = sc.nextInt();

      System.out.println("영어 과목의 점수를 입력하세요");
      eng = sc.nextInt();

      System.out.println("일반 수학 과목의 점수를 입력하세요");
      math = sc.nextInt();


      System.out.println("평균 점수는" + (com + clan + eng + math)/4  + "입니다.");
      

   }
}