import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int a, b;
      Scanner sc = new Scanner(System.in);
      System.out.println("ÇÏ³ªÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
      a = sc.nextInt();
      System.out.println("´Ù¸¥ ÇÏ³ªÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
      b = sc.nextInt();
   

      System.out.println("**°á°úÃâ·Â**");
      System.out.println("µ¡¼À:" + (a + b));
      System.out.println("»¬¼À:" + (a - b));
      System.out.println("°ö¼À:" + (a * b));
      System.out.println("³ª´°¼À:" + (a / b));
   }
 
}
