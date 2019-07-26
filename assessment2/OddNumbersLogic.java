package com.redington.java.assessment2;

public class OddNumbersLogic {

	public void findOddNumbers(int[] num) {
		// TODO Auto-generated method stub
		int n=num.length;
		int odd=0,even=0;
		for(int i=0;i<n;i++){
			if(num[i]%2!=0){
				System.out.println("Number Position "+(i+1)+" have an Odd Number of "+num[i]);
				odd++;
			}else{
				even++;
			}
		}
		System.out.println();
		System.out.println("The Number of Odd Numbers\t:"+odd);
		System.out.println("The Number of Even Numbers\t:"+even);
	}

}
