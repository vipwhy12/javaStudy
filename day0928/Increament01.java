class Increament01 
{
	public static void main(String[] args) 
	{
		//a++�� a+1�� �ٸ��� 
		//a++�� a �ڽ��� �޶����� ����

		int i, j;

		int a = 10;
		int b = 10;

		System.out.println(a + 1);

		System.out.println(b++);

		System.out.println(a++);
		System.out.println(b);
		System.out.println(b + 1);
		System.out.println("----------------------------------");


		i = 5;
		j = 5;
		a = ++i;
		b = j++;

		System.out.println("i: " + i);
		System.out.println("j: " + j );
		System.out.println("a : " + a);
		System.out.println("b : " + b);






	}
}
