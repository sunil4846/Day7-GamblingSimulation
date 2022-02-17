package com.bridgelabz.gamblingSimulator;

public class GamblingSimulation {
	
	static int stake = 100;
	static int everyBet = 0;
	static int win = 0;
	static int loose = 0;
	
	public static void main(String[] args) {
		stakeEveryday();
//		resignForDay();
	}
	
	public static int random() {
		double random = ((Math.random()*100)%2);
		return (int) random;
	}
	
	public static void stakeEveryday() {
		while( stake >= 0 && stake <= 100 ) {
			int random = random();
			if(random == 1) {
				System.out.println("gambler won");
				stake += 1; 				//everyBet;
				win += 1;
			}else {
				System.out.println("gambler loose");
				stake -= 1;           //everyBet
				loose += 1;
			}
			everyBet = everyBet + 1;
		}
		System.out.println("Win count = "+win);
		System.out.println("Loose Count = "+loose);
		System.out.println("TotalBet :"+everyBet);
		System.out.println("stake :"+stake);
//uc3
		if(stake >= win/2 && stake >= loose/2) {
			System.out.println("Gambler resigned for the day");
		}else {
			System.out.println("Gambler still playing");
		}
//uc4
		System.out.println("Total amount won after 20 days :"+ 20 * win);
		System.out.println("Total amount loose after 20 days :"+ 20 * loose);
//uc5		
		int winTotalForEachMonth = 0;
		int looseTotalForEachMonth = 0;
		int i;
		for(i = 1; i < 12; i++) {
			winTotalForEachMonth = win*30 ;
			looseTotalForEachMonth = loose*30;
		}
		System.out.println("For Each month total won :"+winTotalForEachMonth);
		System.out.println("For Each month total loss :"+looseTotalForEachMonth);
	}
	
	public static void resignForDay() {
		
	}

}
