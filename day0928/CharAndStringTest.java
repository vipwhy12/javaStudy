class CharAndStringTest
{
	public static void main(String[] args) 
	{

		// �ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �ٸ�
		// �ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� Ȫ����ǥ�� �������
		//���ڿ��� �ֵ���ǥ
		//�ϳ��� ����������, �ֵ���= string
		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "��";
        System.out.println(lastName);

		String data;
		data = "Hello";
		char last = data.charAt(4);
		System.out.println("�� �������� �ִ� ���ڴ�" + last + "�Դϴ�.");



		/*

		CharAndStringTest.java:19: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           1 error */
	}
}
