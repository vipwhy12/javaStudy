import java.util.Scanner;

class Exame08
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int data , thousand , hundred, ten, one;

		System.out.println("정수를 입력하세요");
		data = sc.next();

		thousand = data / 1000;
		hundred = data / 100;
		ten = data / 10;
		one = data / 1;
		
		 System.out.println("천의자리" + thousand);
		 System.out.println("백의 자리" + hundred );
		 System.out.println("십의 자리" + ten):
		 System.out.println("일의 자리 " + one);
		
		
		

		


	

			
			}

		}


}
