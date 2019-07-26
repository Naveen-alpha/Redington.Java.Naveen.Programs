package com.redington.java.String;

public class DeleteConsonants {

	public void deleteConsonants(String sen)
	{
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u')
			{
				System.out.print(" "+sen.charAt(i));
			}
		}
	}
}
