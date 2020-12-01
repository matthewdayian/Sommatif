package com.edu.tfs;

public class NombrePair {

	public static void main(String[] args) 
	{
		int nbr=29;
		if(isPair(nbr))
			System.out.println("Pair");
		else
		
			System.out.println("impair");
	}
	
	static boolean isPair(int nbr)
	{
		if(nbr%2==0)
			return true;
		else
			return false;
	}

}
