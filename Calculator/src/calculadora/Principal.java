package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//VARIABLES
		double num1=0, num2=0;
		double suma, resta;
		int opcion;
		
		System.out.println("Bienvenido a esta calculadora pro de ultima genereshion, disfruta rey ;). ");
		
		//</br>
		
		do {
			
			System.out.println("Elija una opcion:\n[1] Suma\n[2] Resta\n[3] Multiplique\n[0] Salir ");
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1: 
					System.out.println("Usted escogio sumar :) ");
					
					System.out.println("Diga el primer numero");
					num1=Leer.datoDouble();
					
					System.out.println("Diga el segundo numero");
					num2=Leer.datoDouble();
					suma=num1+num2; 
					System.out.println("La sol es: "+suma);
					suma=num1+num2;
					break;
					
				case 2: 
					System.out.println("Diga el primer numero");
					num1=Leer.datoDouble();
					System.out.println("Diga el segundo numero");
					num2=Leer.datoDouble();
					
					resta = num1 - num2;
					System.out.println("El resultado de la resta es: "+resta);
					break;
					
				case 3: 
					
				case 0: 
					System.out.println("Saliendo con éxito");
					break;
					
				default:
					System.out.println("¿Quien te crees por meter un número que no aparece en el menú?");
					System.out.println("Vuelve a meter otro... (que aparezca en el menú)");
			}
			
		}while (opcion != 0);
		

		
		
	}
}