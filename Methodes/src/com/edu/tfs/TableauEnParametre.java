package com.edu.tfs;

public class TableauEnParametre {

	public static void main(String[] args) 
	{
		int [] monTab= {1,8,4,9,876};
		
		//imprimerTableau(monTab);
		TableauEnParametre monObjet=new TableauEnParametre();
		monObjet.Imprimer2Tableau(monTab);

	}
	// méthode Statique void qui reçoit un tableau comme paramètre
	public static void imprimerTableau(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	//methode non statique
	public void Imprimer2Tableau(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	
	

}
