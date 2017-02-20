package com.usc.karthik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MinCoinChange {

	private static ArrayList<Integer> sortCoins(HashMap<Integer, Integer> coins) {
		/*
		 * Sort the Keys and reverse it to have the 
		 * values in descending order so that
		 * we can pick up the highest valued bill to make up the amount
		 */
		ArrayList<Integer> keys = new ArrayList<Integer>(coins.keySet());
		Collections.sort(keys);
		Collections.reverse(keys);
		return keys;
	}

	public static void main(String args[]) {
		
		/*
		 * 	HashMap contains Key as coin denomination &
			corresponding Value as count of the coin denomination.
			So in this example, coin bill 1 has 2 count,coin bill 2 has 10 counts
			coin bill 5 has 2 counts and So on.
		 */
		HashMap<Integer, Integer> coins = new HashMap<Integer, Integer>();
		coins.put(1, 2);
		coins.put(2, 10);
		coins.put(5, 2);
		coins.put(10, 1);
		coins.put(25, 10);
		coins.put(50, 10);

		int amount = 21;
		int coinCount = 0;
		ArrayList<Integer> sortedCoins = sortCoins(coins);
		
		//If the amount is  less than or Zero then print suitable message.
		if(amount <= 0){
				System.out.println("Please enter the amount greater than ZERO !");
		}
		else{
			//If the amount is greater than ZERO , proceed !
			System.out.println("Coins bill needed :");
			while (amount > 0 && coins.size() > 0) {

				// Get the maximum value coin
				Integer coin = sortedCoins.get(0);

				if (coin > amount) {
					coins.remove(coin);
					sortedCoins.remove(0);
					continue;
				}
				//Print the coin bill
				System.out.println(coin);
				//Update the  amount with remaining amount to find the bills for them
				amount = amount - coin;
				//Keep track of coin bills contribute to amount.
				coinCount++;

				Integer count = coins.get(coin);
				count = count - 1;
				if (count == 0) {
					//Coin bills no more required if count is 0 , so remove
					//it from ArrayList as well as from HashMap
					coins.remove(coin);
					sortedCoins.remove(0);
				} else {
					//Update the count of coin bills in HasMap
					coins.put(coin, count);
				}

			}
			System.out.println("No of coins needed :" + coinCount);
			if (amount != 0) {
				System.out.println("Cannot make amount with given coins !!");
			}
		}
		

	}

}