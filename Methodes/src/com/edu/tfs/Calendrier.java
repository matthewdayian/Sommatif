/*
* @Author : jzagabe
* @Date : Dec. 9, 2020
* @Description :Programme permettant d'afficher
* le calendrier d'un mois de l'année connaissant le jour
* de debut du mois et le nombre total des jours du mois 
*/

package com.edu.tfs;

import java.util.Scanner;

public class Calendrier
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int deb=sc.nextInt(); // jour de la semaine
	int fin=sc.nextInt(); // nombre de jours du mois
	
	// Jours de la semaine
	System.out.println("D \t L \t M \t M \t J \t V \t S \t");
	// afficher les espaces si nécessaire
	for(int i=1;i<deb;i++)
		System.out.print("\t");
	
	// première ligne
	int svt=9-deb;
	for(int i=1;i<svt;i++)
		System.out.print(i + "\t");
	System.out.println();
	int c=svt;
	for(int i=0;i<fin;i++)
	{
		for(int j=0;j<7;j++)
		{
			System.out.print(c + "\t");
			c++;
			if(c>fin)
				System.exit(1);
		}
		System.out.println();
	}
    sc.close();
	}

}
