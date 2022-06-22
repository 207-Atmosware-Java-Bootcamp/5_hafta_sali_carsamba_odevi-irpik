package com.turkcell;

import java.util.Scanner;

public class _20x9_Factoriyel {
	public static void main(String[] args) {
		
		// girilen bir sayının faktoriyelini kodlayan algoritma
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = scn.nextInt();
		for (int i = number - 1; i > 1; i--) {
			number *= i;
		}
		System.out.println(number);
		
	}
}
