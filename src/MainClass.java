import java.util.Scanner;


public class MainClass
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
				sommaediff();
					break;
				case 2:

				break;
				case 3:

				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
 static void sommaediff()
{
	 System.out.println("quanti numeri voi scrivere");
	  int somma=0;
	 int diff=0;
	  int num = Integer.parseInt(in.nextLine());
	 int []numeri = new int [num];
	 for ( int i=0 ; i<num ; i++)
	 {
		System.out.println("Scrvi num");
		numeri [i]= in.nextInt();
		if (numeri [i] % 2 ==0)
		{
		   somma = numeri [i] + somma;	
		}
		else 
		{
		diff -= numeri[i];	
		}
	 }
	System.out.println("somma è:"+somma);
	System.out.println("differenza è:"+diff);
 }
}
