/*
* @Author : jzagabe
* @Date : Dec. 6, 2020
* @Description : 
*/

package com.edu.tfs;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int deb=sc.nextInt(); // variable pour debut
		int fin=sc.nextInt();// variable pour fin
		// écrire la ligne des jours
		System.out.println("D\tL\tM\tM\tJ\tV\tS\t");
		
		// afficher les espaces si nécessaire (les jours appartenant au mois précédent)
		for(int i=1;i<deb;i++)
			{
			System.out.print("\t");
			}
		// première ligne
		int svt=9-deb;
		for(int i=1;i<svt;i++)
		{
			System.out.print(i+ "\t");
		}
		System.out.println();
		int c=svt;
		for (int i=0;i<fin;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(c+ "\t");
				c++;
				if(c>fin)
					System.exit(1);
			}
			System.out.println();
		}
		sc.close();
	}
}
