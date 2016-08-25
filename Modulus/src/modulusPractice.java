import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class modulusPractice
	{
		public static void main(String[] args) 
			{
				//challange1();
				//challange2();
				//challange3();
				challange4();
			}
		public static void challange1()
		{
			System.out.println("HELLO USER! If you would please input a number, I'll tell you if it's even or odd!");
			Scanner userInput=new Scanner(System.in);
			int num=userInput.nextInt();
			if (num%2==0)
				{
					System.out.println("THE NUMBER IS EVEN!");
				}
			else
				{
					System.out.println("That's an odd number, folks");
				}
		}
		public static void challange2()
			{
				System.out.println("Now, if you'd input a year...");				
					Scanner userInput=new Scanner(System.in);
				int year=userInput.nextInt();
				if (year%4==0)
					{
						System.out.println("Leap year.");
					}
				else
					{
						System.out.println("NOT a leap year.");
					}
			}
		public static void challange3()
			{
				int[] hardCoded=new int[] {2, 5, -7, 1, 3, 12, 19, -16, -16, 4, 20};
				for (int i=0; i<hardCoded.length+1;i++)
					{
						if (i%3==0)
							{
								System.out.println(hardCoded[i]);
							}
					}
			}
		public static void challange4()
		{
			
			for (int i=1; i<=100; i++)
				{
					String print=i.toString();
					if (i%3==0)
						{
							print="FIZZ";
						}
					else if (i%5==0)
						{
							print=print + "BUZZ";
						}
					System.out.println(print);
				}
		}
	}
