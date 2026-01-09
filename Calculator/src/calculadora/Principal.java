package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		double num1, num2;
		double suma;
		double mult;
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
					
					
				case 3: 
					System.out.println("Usted escogio multiplicar :) ");
					
					System.out.println("Diga el primer numero");
					num1=Leer.datoDouble();
					
					System.out.println("Diga el segundo numero");
					num2=Leer.datoDouble();
					mult=num1+num2; 
					System.out.println("La sol es: "+mult);
					break;
				case 0: 
			}
			
		}while (opcion != 0);
		
		
		
		
	}

}
