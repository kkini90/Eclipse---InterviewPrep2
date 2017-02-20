package com.usc.karthik;

public class Primes {

	public static void main(String[] args) {

		int N = 10;
		boolean[] isPrime = new boolean[N + 1];

		Primes.initializeSeive(isPrime);
		for (int i = 2; i < N; i++)
			if (isPrime[i])   //&& i > start for start no
				System.out.println(i);
	}

	public static void initializeSeive(boolean[] seive) {

		int N = seive.length;
		System.out.println(N);

		for (int i = 2; i < N; i++) {
			seive[i] = true;
		}

		for (int i = 2; i * i <= N; i++) {
			if (seive[i]) {
				for (int j = i; i * j <= N; j++) {
					seive[i * j] = false;
				}
			}
		}
	}
}
//O(n log log n)