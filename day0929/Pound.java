import java.util.Scanner;


class Pound
{	
	System.out.println("�ð��� �� ������ �Է��Ͻÿ�");{
		Scanner sc = new scanner(System.in);

		int min, hor, sec ,total;
		System.out.println("�ð��� �� ������ �Է��Ͻÿ�");
		total = sc.nextInt();
		
		hor = sec / 3600;
		min = (sec % 3600) / 60 ;
		sec =  min % 60;


		System.out.println(hor + "��" +  min + "��" + sec + "��");



	
	}
}
