package com.practice;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int result = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int value = sc.nextInt();
				matrix[i][j] = value;
				if(value == 1) {
					int r = Math.abs(i - 2);
					int c = Math.abs(j - 2);
					result = r+c;
				}
			}
		}
		
		System.out.println(result);
		
		sc.close();

	}

}
