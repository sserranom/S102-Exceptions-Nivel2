package EjercicioN2;

import java.util.Scanner;

public class LeerEntrada {

	public static void main(String[] args) {
		
		System.out.println("******Elija la opcion que desea Comprobar******\n");
		System.out.println(" 1. Leer Byte \n 2. Leer Int \n 3. Leer Float \n 4. Leer Double"
				+ "\n 5. Leer Char \n 6. Leer String \n 7. Leer SINO ");
		
		
		Scanner input = new Scanner(System.in);
		
		int opcion = input.nextInt();
		
		switch(opcion) {
			
			case 1:
				
				Entrada.leerByte("Ingresa un dato de tipo byte: ");
			break;
			
			
			case 2:
				
				Entrada.leerInt("Ingrese un dato de tipo Int: ");
			break;
			
			
			case 3:
			
				Entrada.leerFloat("Ingresa un dato de tipo float: ");
			break;
			
			
			case 4:
				
				Entrada.leerDouble("Ingresa un dato de tipo Double: ");
			break;
			
			
			case 5:
				
				do {
				
					try {
						
						Entrada.leerChar("Ingrese un dato de un solo caracter: ");
						break;
						
					}catch(InvalidDataException e){
						
						System.out.println(e.getMessage());
						
					}	
				
				}while(true);
			break;
			
			
			case 6:
				
				boolean isString = false;
				do {
					try {
						
						Entrada.leerString("Ingresa un dato de tipo String: ");
						isString = true;
						
					}catch(InvalidDataException e) {
						
						System.out.println(e.getMessage());
					}
					
				}while(!isString);
			break;
			
			
			case 7:
				
				boolean isTrue = false;
				do {
					
					try {
						
						Entrada.leerSINO("Digite S Rara devolver True o  N para devolver False (S/N)");
						isTrue = true;
						
					}catch(InvalidDataException e) {
						
						System.out.println(e.getMessage());
						
					}
						
				}while(!isTrue);
			break;	
				
		}
			
	}
	
}
