import java.util.Scanner;
class Math{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a, b, plus, multiply, division ;
      
      System.out.println("하나의 정수를 입력하세요");
      a = sc.nextInt();
      System.out.println("다른 하나의 정수를 입력하세요");
      b = sc.nextInt();
      plus = a + b;
      multiply = a * b;
      division = a / b;

      System.out.println("**결과출력**");
      System.out.println("덧셈:" + plus);
      System.out.println("곱셈:" + multiply);
      System.out.println("나눗셈:" + division);
   }
 
}
