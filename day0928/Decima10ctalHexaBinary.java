class Decima10ctalHexaBinary 
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 014;
		int c = 0xc;
		int d = 0b1100;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}



/*
8   10	16	2
---------------------------------------
0	0	0	0
1	1	1	1
2	2	2	10	
3	3	3	11
4	4	4	100
5	5	5	101
6	6	6	110
7	7	7	111
10	8	8	1000
11	9	9	1001
12	10	A	
13	11	B	
14	12	C
		D
		E
		F
		10
		11
! 자바에서 8진수 표현시 앞에 숫자 '0'을 붙여 표현하기 
*/