package ejercicio3;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int b;
		
		do {
			b=0;
			System.out.print("ingrese un numero: ");
			number = sc.nextInt();
			for(int i=2; i*i<=number; i++) {
				if(number%i==0) {
					b=1;
				}
			}
		}while(number<100 || b==1);
		System.out.print("yey!");
		sc.close();
	}
}
