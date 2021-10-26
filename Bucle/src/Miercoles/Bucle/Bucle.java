package Miercoles.Bucle;

import java.util.Scanner;

public class Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Pedir un número y sacar la tabla de multipicar de ese número desde 0 hasta 20
		
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("Introduce la tabla que quieres ver: ");
		int tabla= teclado.nextInt();
		
		int a = 0;
		while(a <= 20){
            int resultado = tabla * a;
			System.out.println(tabla + " x " + a + " = "+ resultado);
			a += 1;
		}
	}

}
	


