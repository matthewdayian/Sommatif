package com.edu.tfs;

public class Methode2 
{
	// méthode statique sans argument, ne retourne rien
	public static void saluer()
	{
		System.out.println("Salutations de la part de Methode 2");
	}
	// méthode statique reçoit 2 arguments, ne retourne un entier
	public static int addition(int a, int b)
	{
		return a+b;
	}
	
	//méthode non statique, ne retourne rien, aucun argument
	public void Crier()
	{
		System.out.println("Blah...");
		
	}
	
}
