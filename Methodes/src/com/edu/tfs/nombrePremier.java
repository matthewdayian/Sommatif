package com.edu.tfs;

public class nombrePremier {

	public static void main(String[] args) 
	{	
		int nbr=30;
	
		if(isPrimeNumber(nbr))
			System.out.println("Premier");
		else
			System.out.println("Non premier");
	}
	
	static boolean isPrimeNumber(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i ==0)
			{
				return false;
			}
		}
		return true;
		
	}

}
