class Increament01 
{
	public static void main(String[] args) 
	{
		//a++과 a+1은 다르다 
		//a++은 a 자신이 달라지는 것임

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
