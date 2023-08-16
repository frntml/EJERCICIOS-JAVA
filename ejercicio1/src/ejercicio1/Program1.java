package ejercicio1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		do {
			System.out.print("ingrese un numero (del 1 al 100): ");
			number = sc.nextInt();
		}while(number>100);
		if(number%2==0) {
			System.out.println("Es par");
			System.out.print(number);
		}
		else System.out.println("Es impar");
	}
}
