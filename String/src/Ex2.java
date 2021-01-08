import java.util.Scanner;

/*
* Author : farahmansour
*Date : 6-Jan-2021
*/

public class Ex2
	{

		public static void main(String[] args)
			{
			    String machaine;
			    Scanner sc = new Scanner(System.in);
			    machaine= sc.nextLine();
			    char [] a= machaine.toCharArray();
			    int cptj=0;
			    int cptt=0;
			    for(int i=0;i<a.length;i++) {
				if ((a[i]==':') && (a[i+1]=='-') && (a[i+2]==')')) 
					cptj++;
				else if ((a[i]==':') && (a[i+1]=='-') && (a[i+2]=='(')) 
						cptt++;
				}
			    if (cptt>cptj)
			    System.out.println("triste");
			    else if (cptt<cptj)
			    System.out.println("joyeux");
			    else if (cptt==cptj)
			    System.out.println("incertaine");
			    else System.out.println("aucun");
			    
			    sc.close();

			}

	}
