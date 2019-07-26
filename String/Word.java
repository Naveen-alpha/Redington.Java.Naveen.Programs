package com.redington.java.String;

public class Word {

	public void findWord(String sen, String f) throws Exception {

		if (sen.contains(f)) {
			System.out.println(f + " is Present in " + sen);
		} else {
			throw new Exception(f + " is Not Present in " + sen);
		}

	}
}
