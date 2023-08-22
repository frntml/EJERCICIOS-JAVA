package ejercicio4;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int res=0;
		
		System.out.print("ingrese un numero: ");
		a = sc.nextInt();
		System.out.println("que desea hacer:\n- sumar(1)\n- restar(2)\n- multiplicar(3)\n- dividir(4)");
		c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.print(a);
			System.out.print(" + ");
			b = sc.nextInt();
			res= a + b;
			break;
		case 2:
			System.out.print(a);
			System.out.print(" - ");
			b = sc.nextInt();
			res= a - b;
			break;
		case 3:
			System.out.print(a);
			System.out.print(" x ");
			b = sc.nextInt();
			res= a*b;
			break;
		case 4:
			System.out.print(a);
			System.out.print(" % ");
			b = sc.nextInt();
			res= a/b;
			break;
		}
		System.out.print("es resultado es: ");
		System.out.print(res);
	}
}
