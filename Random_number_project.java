	package Project;
import java.util.Scanner;
public class Random_number_project {

	public static void main(String[] args) {
		// mini project
		Scanner sc=new Scanner(System.in);
		int mynumber=(int)(Math.random()*100);
		int usernumber=0;
		do
		{
			System.out.println("gess my number");
			 usernumber=sc.nextInt();
			
			if(usernumber==mynumber)
			{
				System.out.println("WOOHOO____CORRECT NUMBER");
				break;
			}
			else if(usernumber>mynumber)
			{
				System.out.println("your numbeer is large ");
				
			}
			else 
			{
				System.out.println("your number is small");
			}
			
		}
		while (usernumber>=0);
		System.out.println("my number was");
		System.out.println(mynumber);
	
	
		

	}

}

