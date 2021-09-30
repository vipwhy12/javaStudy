import java.util.Scanner;
class Quadrangle{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int width, height;

      System.out.println("사각형의 가로를 입력하시오");
      width = sc.nextInt();
      System.out.println("사각형의 세로를 입력하시오");
      height = sc.nextInt();
      System.out.println("사각형의 면적은" + (width * height) +"입니다.");

   }
}