class RangByte 
{
	public static void main(String[] args) 
	{
		//1byte는 8bit(전기선 가닥이 하나)로 구성
		//1bit로 표현할 수 있는 수의 범위는 0,1 enrkwl dlqslek. 
		//2bit가 있다면
		//   0 0
		//   0 1
		//   1 0
		//   1 1

		//1byte(8개의 bit)중에 맨 왼쪽에 있는 bit는 음수인지 양수인지 파별하는 부호 비트로 사용하고 
		//나머지 7개의 비트로 숫자를 표현합니다.
		//따라서 표현할 수 있는 수의 범위가 다음과 같습니다. 
		//음수 2의 7승부터 양수 2의 7승 -1
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
-128 (오버플로우)*/