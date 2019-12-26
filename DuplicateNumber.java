package com.interfac;

public class DuplicateNumber {
	public static void main(String arg[]) {
		duplicate();
	}
	
	private static void duplicate() {
		int[] duplicateArrey = {2,3,5,5,1,4};
		for(int i=0;i<duplicateArrey.length;i++) {
			for(int j=i+1; j <duplicateArrey.length; j++) {
				if(duplicateArrey[i]==duplicateArrey[j]) {
					System.out.println(duplicateArrey[i]);
				}
			}
		}
	}
}
