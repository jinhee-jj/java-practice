package javapractice.arrayPractice;

import java.util.Random;

public class ArrayPractice {
	public static void main(String[] args) {
		
		int[] iarr = new int[6];
		
		Random random = new Random();
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random()*45)+1;
			
			
			
			for(int j = 0; j < i; j ++) {
				
				if(iarr[i] == iarr[j]) {
					int num2 = (int)(Math.random()*45)+1;
					
					iarr[j] = num2;
					
				} 
			}
			
			
		}
			
		for(int i = 0; i < iarr.length; i++) {
			
		
			for(int j = 0; j < i; j++) {
				
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
					
					
				} 
				
			}
		}
		
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}
}
