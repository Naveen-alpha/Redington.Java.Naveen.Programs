package com.redington.java.String;

public class Numbers {
int v=0,c=0,w=0;
public int findVowels(String sent){
	for(int i=0;i<sent.length();i++)
	{
		if((sent.charAt(i)=='a')||(sent.charAt(i)=='e')||(sent.charAt(i)=='i')||(sent.charAt(i)=='o')||(sent.charAt(i)=='u'))
		{
			v++;
		}
	}
	return v;
}
public int findConsonants(String sent){
	for(int i=0;i<sent.length();i++)
	{
		
		if((sent.charAt(i)!='a')&&(sent.charAt(i)!='e')&&(sent.charAt(i)!='i')&&(sent.charAt(i)!='o')&&(sent.charAt(i)!='u')&&(sent.charAt(i)!=' '))
		{
			c++;
		}
	}
	return c;
}
public int findWhiteSpace(String sent){
	for(int i=0;i<sent.length()-1;i++)
	{
		if(sent.charAt(i)==' ')
		{
			w++;
		}
	}
	return w;
}
}
