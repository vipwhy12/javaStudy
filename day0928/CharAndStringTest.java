class CharAndStringTest
{
	public static void main(String[] args) 
	{

		// 자바에서는 단일문자의 처리와 문자열의 처리가 다름
		// 하나의 문자를 표현하기 위해서는 홋따옴표로 묶어야함
		//문자열은 쌍따옴표
		//하나의 문자이지만, 쌍따옴= string
		char firstName;
		firstName = '박';
		System.out.println(firstName);

		String name;
		name = "박성미";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "미";
        System.out.println(lastName);

		String data;
		data = "Hello";
		char last = data.charAt(4);
		System.out.println("맨 마지막에 있는 문자는" + last + "입니다.");



		/*

		CharAndStringTest.java:19: error: incompatible types: String cannot be converted to char
                lastName = "미";
                           1 error */
	}
}
