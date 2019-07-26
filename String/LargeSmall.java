package com.redington.java.String;

public class LargeSmall {
	String largest,smallest;
	public String[] findLargest(String[] word){
		int n=word.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(word[i].length()>word[j].length()){
				largest=word[i];
				word[i]=word[j];
				word[j]=largest;
				}
			}
		}
		return word;
		
		
	}
	public String[] findSmallest(String[] wor){
		int n=wor.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(wor[i].length()<wor[j].length()){
				smallest=wor[i];
				wor[j]=wor[i];
				wor[i]=smallest;
				}
			}
		}
		return wor;
	}
}
