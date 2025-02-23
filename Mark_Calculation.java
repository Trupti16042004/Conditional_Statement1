import java.util.Scanner;
class Mark_Calculation
{
	public static void main(String[] args) {
		
		Scanner wd  = new Scanner(System.in);

		float total = wd.nextFloat();

		float percentage = (total/600) *100 ;
		String ans = (percentage>=75 || percentage<=100)
		?(("A ")?(percentage>=60 || percentage<=35)?("B"))
		:((percentage>=60 || percentage<=35)?("C")):("FAil");

		System.out.print(ans);

	}
}