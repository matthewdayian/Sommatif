/*
* @Author : jzagabe
* @Date : Dec. 2, 2020
* @Description : 
*/

package com.edu.tfs;

import java.util.Arrays;

public class ChangerHasard
{

	public static void main(String[] args)
	{
		int []maliste= {0,1,2,3,4,5,6,7,8,9,10};
		
			maliste=shiftGauche(maliste);
			//System.out.println(maliste[3]);
			
			  for (int i : maliste) { System.out.println(i); 
			  }
			 
	}
	/*Méthode qui permet de mélanger au hasard les chiffres
	 * 
	 */
	static int[]shuffleTableau (int[] a)
	{
		for(int i=a.length-1;i>0;i--)
		{
			int j=(int)(Math.random()*(i+1));
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return a;
	}
	 
	 
static int []shiftGauche(int [] a)
{
	int temp=a[0];
	for (int i = 1; i < a.length; i++)
	{
		a[i-1]=a[i];
	}
	a[a.length-1]=temp;
	return a;
}

}
