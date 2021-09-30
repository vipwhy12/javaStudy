import java.util.Scanner;

class AverageTest 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		double avg;
		String name;

	 	System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("국어과목의 점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("수학과목의 점수를 입력하시오");
		math = sc.nextInt();
		System.out.println("영어 과목의 점수를 입력하시오");
		eng = sc.nextInt();
		avg = ( kor + eng + math ) / 3.0;

		if (avg > 60)
		System.out.println(name + "님의 평균점수는" + avg +"이며 합격입니다." );
		else
		System.out.println(name + "님의 평균점수는" + avg +"이며 불합격입니다." );
		{
		}
	}
}
