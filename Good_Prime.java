import java.util.Scanner;
class Good_Prime
{
	public static void main(String[] args) {
		
		boolean flag = true;
		System.out.print("Enter a Number : ");
		int num =new Scanner(System.in).nextInt();

		for(int i=2 ;i<=num;i++)
		{
			if(num%2==0)
			{
				flag = false;
				break;
			}
			
		}
		if(flag){
			System.out.print(num + "is Prime Number");
			for(int i=num;i>=2;i/=10)
			{
				int rev=0;
				int rem = i%10;
				rev = rev*10+rem;
				System.out.print(rev);
				if(rem==1)
				{
					flag = false;
					break;
				}
				for(int j=2 ;j<=rev;j++)
			{
			if(rev%2==0)
			{
				flag = false;
				break;
			}
			
			}

			}

			if(flag)
			{
			System.out.print( "Good Prime");
			}
		else {
			System.out.print("Not a Good Prime");
		}



		}
		

		else {
			System.out.print("Not a Prime Number");
		}




	}
}