package com.interfac;


public class MissingNum {
	public static void main(String arg[]) {
		OneToHundred();
	 }
	public static void OneToHundred() {
		int[] array = {1,10,2,4,8,3,5,6,11,9};
		int length = array.length;
		int max = array[0];
		
		for(int i=0; i<length; i++) {
//			System.out.println(array[i]);
			if(max<array[i]) {
				max=array[i];
			}
		}
		for(int i=0; i<max; i++) {
			if(!contains(array,i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
}
