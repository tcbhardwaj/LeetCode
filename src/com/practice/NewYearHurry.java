package com.practice;

import java.util.Scanner;

public class NewYearHurry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int totalMin = 240;
		int remainingMin = totalMin - k;
		int timeConsumedContest = 0;
		int result = 0;
		int i = 1;
		while(i <= n) {
			timeConsumedContest += i*5;
			if(timeConsumedContest > remainingMin) {
				System.out.print(i-1);
				break;
			}
			i++;
		}
		
		if(timeConsumedContest <=remainingMin) {
			System.out.print(i-1);
		}
		
		

	}

}
