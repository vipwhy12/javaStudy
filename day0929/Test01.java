import java.util.Scanner;

class Test01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price, number, total;
		String name;

		System.out.println("상품명을 입력하시오");
		name = sc.next();
		System.out.println("구매수량을 입력하시오");
		number = sc.nextInt();
		System.out.println("단가를 입력하시오");
		price = sc.nextInt();

		total = (number * price);

		if(number >= 10 || price >= 20000)
			System.out.println("10%할인이 가능합니다" + (total - (total * 0.1)) + "입니다." );
		else
			System.out.println("총금액" + total);
			
	}
}
