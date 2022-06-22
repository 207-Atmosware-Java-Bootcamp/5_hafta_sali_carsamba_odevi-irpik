package com.turkcell;

import java.util.Scanner;

public class _20x7_VizeFinal {
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
		// not ortalaması: ortalama<50 altında ise kaldı
		// not ortalaması: ortalama==50 Geçti
		// not ortalaması: 55<=x<=70 BB
		// not ortalaması: 70<=x<=84 BA
		// not ortalaması: 84<=x<=100 AA
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Vize: ");
		int vizeNote = scn.nextInt();
		System.out.print("Final: ");
		int finalNote = scn.nextInt();
		int average = (vizeNote + finalNote) / 2;
		
		if (average >= 84 && average <= 100)
			System.out.println("AA");
		else if (average >= 70 && average < 84)
			System.out.println("BA");
		else if (average >= 55 && average < 70)
			System.out.println("BB");
		else if (average >= 50 && average < 55)
			System.out.println("Geçti");
		else if (average < 50 && average >= 0)
			System.out.println("Kaldı");
		else
			System.out.println("Geçersiz Not");
	}
}
