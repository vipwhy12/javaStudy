import java.util.Scanner;

class ScholarshipTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int kor , eng, math, avg;
		String name;

		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("국어점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오");
		math = sc.nextInt();

		avg = (kor + eng + math)/3;



		if(avg >= 90 && kor >= 60)
			System.out.println("귀하는 장학금을 받을 수 있습니다.");
		else
			System.out.println("장학금 선정 대상자가 아닙니다.");


	}
}
