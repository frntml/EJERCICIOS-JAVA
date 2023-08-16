package ejercicio2;

import java.util.Scanner;

public class Program {
	public static void divisores(int number) {
		for(int i=2; i<(number/2); i++) {
			if(number%i==0) {
				System.out.println(number/i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int b=0;
		
		do {
			System.out.print("ingrese un numero del 50 al 100: ");
			number = sc.nextInt();
		}while(number<50 || number>100);
		for(int i=2; i<(number/2); i++) {
			if(number%i!=0) {
				b=1;
			}
		}
		if(b==1) {
			System.out.println("El numero no es primo");
			divisores(number);
		}
		else System.out.println("El numero es primo");
	}
}
