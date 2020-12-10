/*
* @Author : jzagabe
* @Date : Dec. 2, 2020
* @Description : 
*/

package com.edu.tfs;

public class Hasard
{

	public static void main(String[] args)
	{
		int []myTab=new int[10];
		for(int i=0;i<10;i++)
		{
			myTab[i]=(int)(Math.random()*(i+1));	
		}
		for (int element : myTab)
		{
			System.out.println(element);
		}
			

		
	}

}
