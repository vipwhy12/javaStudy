class RangByte 
{
	public static void main(String[] args) 
	{
		//1byte�� 8bit(���⼱ ������ �ϳ�)�� ����
		//1bit�� ǥ���� �� �ִ� ���� ������ 0,1 enrkwl dlqslek. 
		//2bit�� �ִٸ�
		//   0 0
		//   0 1
		//   1 0
		//   1 1

		//1byte(8���� bit)�߿� �� ���ʿ� �ִ� bit�� �������� ������� �ĺ��ϴ� ��ȣ ��Ʈ�� ����ϰ� 
		//������ 7���� ��Ʈ�� ���ڸ� ǥ���մϴ�.
		//���� ǥ���� �� �ִ� ���� ������ ������ �����ϴ�. 
		//���� 2�� 7�º��� ��� 2�� 7�� -1
		//-128 ~ 127
		

		//byte data = 127;
		//System.out.println(data);
		//data = (byte)(data + 1); 
		//System.out.println(data);  // overFlow

		byte data = -128;
		System.out.println(data);
		data = (byte)(data - 1);
		System.out.println(data);//underFlow
	}
}




/* C:\javastudy\day0928>java RangByte
127
-128 (�����÷ο�)*/