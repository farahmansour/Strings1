import java.util.Scanner;

/*
* Author : farahmansour
*Date : 6-Jan-2021
*/

public class Ex4
	{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int placesstanionnement = Integer.parseInt(sc.nextLine());
		String hier = sc.nextLine();
		String aujourdhui = sc.nextLine();
		sc.close();
		int cpt=0;
		
		
		for (int i = 0; i < placesstanionnement; i++) {			
			if (hier.charAt(i) ==aujourdhui.charAt(i) && aujourdhui.charAt(i) == 'C') {
				cpt++;
			}			
		}
		
		System.out.println(cpt);

	}

}
	

	
