import java.util.Scanner;

/*
* Author : farahmansour
*Date : 6-Jan-2021
*/

public class Ex1
	{

		public static void main(String[] args)
			{
				
				
				int troispointsA;
				int deuxpointsA;
				int unpointA;
				
				int troispointsB;
				int deuxpointsB;
				int unpointB;
				
				Scanner sc = new Scanner(System.in);
				troispointsA= sc.nextInt()*3;
				deuxpointsA= sc.nextInt()*2;
				unpointA= sc.nextInt();
					
				troispointsB= sc.nextInt()*3;
				deuxpointsB= sc.nextInt()*2;
				unpointB= sc.nextInt();
				
				int Ananastotale=troispointsA+deuxpointsA+unpointA;
				int Bananetotale=troispointsB+deuxpointsB+unpointB;
				
				if (Bananetotale>Ananastotale)
					System.out.println("B");
				else if (Bananetotale<Ananastotale)
					System.out.println("A");
				else 
					System.out.println("T");
				sc.close();
			}

	}
