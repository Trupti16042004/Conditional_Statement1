import java.util.Scanner;
class If_Else
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Indian Rupees : ");
		float inr = sc.nextFloat();

		System.out.println("CONCURRENCY CONVERTER :");
		System.out.println("1.USD");
		System.out.println("2. EURO");
		System.out.println("3. GBP");
		System.out.println("4. PKB");
		System.out.println("5. DRIHAM");
		System.out.println("6. RUPEL");

		System.out.println("Enter your Choice : ");
		String ch = sc.next().toUpperCase();


		float conCurr;
		if(ch.equals("USD"))
		{

		conCurr = inr/86.95f;
		System.out.println(inr + "INR = " +conCurr+ " USD " );
		}

		else if(ch.equals("EURO")){
			conCurr = inr/90.25f;
		System.out.println(inr + "INR = " +conCurr+ " EURO " );

		}
		else if(ch.equals("GBP")){
			conCurr = inr/90.25f;
		System.out.println(inr + "INR = " +conCurr+ " GBP " );

		}
		else if(ch.equals("PKB")){
			conCurr = inr/3.25f;
		
		System.out.println(inr + "INR = " +conCurr+ " PKB " );

		}

		else if(ch.equals("DRIHAM")){
			conCurr = inr/90.25f;
		System.out.println(inr + "INR = " +conCurr+ " DIRHAM " );

		}
		else if(ch.equals("RUPEL")){
			conCurr = inr/90.25f;
		System.out.println(inr + "INR = " +conCurr+ " RUBLE " );

		}

		else{

			System.out.println("Wtomh");
		}
	}
}