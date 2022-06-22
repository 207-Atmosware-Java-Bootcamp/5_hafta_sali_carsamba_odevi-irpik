package com.turkcell;

import java.util.Scanner;

public class _20x8_AsalSayi {
	public static void main(String[] args) {
		
		// girilen bir sayının asal olup olmaması kodlayan algoritma
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = scn.nextInt();
		boolean primeNumber = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				primeNumber = false;
				break;
			}
		}
		if (primeNumber)
			System.out.println(number + " asal sayıdır.");
		else
			System.out.println(number + " asal sayı değil.");
		
	}
}
