import java.util.Scanner;


class Pound
{	
	System.out.println("시간을 초 단위로 입력하시오");{
		Scanner sc = new scanner(System.in);

		int min, hor, sec ,total;
		System.out.println("시간을 초 단위로 입력하시오");
		total = sc.nextInt();
		
		hor = sec / 3600;
		min = (sec % 3600) / 60 ;
		sec =  min % 60;


		System.out.println(hor + "시" +  min + "분" + sec + "초");



	
	}
}
