/*
* @Author : jzagabe
* @Date : Nov. 26, 2020
* @Description : 
*/

package com.edu.tfs;

public class Diviseur
{

	public static void main(String[] args)
	{
		System.out.println(pgcd(180,120));

	}
	
	static int pgcd(int a,int b)
	{
		int div=1;
		int k=1; // possible gcd
		while(k<=a && k<=b)
		{
			if(a%k==0 && b%k==0)
				div=k;
			k++;
		}
		return div;
	}

}
