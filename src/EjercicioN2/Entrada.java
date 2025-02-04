package EjercicioN2;
import java.util.*;

public class Entrada {
		
		//private static Scanner input = new Scanner(System.in).useLocale(Locale.US);
		private static Scanner input = new Scanner(System.in);
		
		//private static boolean dato_correcto = false;

		public static byte leerByte(String mensaje) {
			
			byte dato = 0;
			boolean isByte = false;
			do{
				try {
					System.out.println(mensaje);
					dato = input.nextByte();
					//input.nextLine();
					isByte = true;
				
				}catch (InputMismatchException e){
					System.out.println("El dato introducido no es de tipo Byte, Ingresa el tipo de dato solicitado");
					input.nextLine();	
				}
			
		     }while(!isByte);
			
			System.out.print("Byte " + dato);
			return dato;	
        }

		public static int leerInt(String mensaje) {
			
			int dato=0;
			boolean isInt = false;
			
			do {
				try {
					System.out.println(mensaje);
					dato = input.nextInt();
					//input.nextLine();
					isInt = true;
				}catch (InputMismatchException e){
					System.out.println("El dato Introducido no es de tipo Entero, Ingresa el tipo de dato solicitado");
					input.nextLine();
				}
		     }while(!isInt);
			System.out.print("Int " + dato);
			return dato;
        }
		
		
		public static float leerFloat(String mensaje) {
			
			float dato = 0;
			boolean isfloat = false;
			do{
				try{
					System.out.println(mensaje);					
					String numero = input.next();
					
					if(numero.contains(".")) {
						 System.out.println("Error de Fomato, ingresa el decimal con una coma");	 
					}else if(numero.contains(",") && numero.endsWith("f")) {
						numero = numero.replace(",", ".");
						
						try {
							dato = Float.parseFloat(numero);
							isfloat = true;
						}catch(NumberFormatException e){
							System.out.println("Error de formato p");	
						}
					}else {
						try {
							dato = Integer.parseInt(numero);
							System.out.println("El dato no es válido, ingresa un numero con decimales");
						}catch (NumberFormatException e) {
							System.out.println("El dato Introducido no es de tipo Float, Ingresa el tipo de dato solicitado ej: 2.33f");
						}
					}
					
							
				}catch (InputMismatchException e){
					System.out.println("El dato Introducido no es de tipo Float, Ingresa el tipo de dato solicitado");
					input.nextLine();
				}
			
		     }while(!isfloat);
			
			System.out.print("Float " + dato);
			return dato;
        }
		
		public static double leerDouble(String mensaje) {
			
			double dato = 0;
			boolean isdouble = false;
	
			do {
				try {	
					System.out.println(mensaje);					
					String numero = input.next();
					
					if(numero.contains(".")) {	
						 System.out.println("Error de Fomato, ingresa el decimal con una coma");
					}else if(numero.contains(",") && !(numero.contains("f"))){
						numero = numero.replace(",", ".");
						try {
							dato = Double.parseDouble(numero);
							isdouble = true;
						}catch(NumberFormatException e){
							System.out.println("Error de formato p");
						}
					}else {
						try{
							dato = Integer.parseInt(numero);
							System.out.println("El dato no es válido, ingresa un numero con decimales");
						}catch (NumberFormatException e) {
							System.out.println("El dato Introducido no es de tipo Double, Ingresa el tipo de dato solicitado ej: 2,3333333");
						}
					}			
				}catch (InputMismatchException e){
					System.out.println("El dato Introducido no es de tipo Double, Ingresa el tipo de dato solicitado");
					input.nextLine();
				}
			
		     }while(!isdouble);
			
			System.out.print("Double " + dato);
			return dato;
        }
		
		public static char leerChar(String mensaje) throws InvalidDataException {
					
				System.out.println(mensaje);
				String dato = input.nextLine();
				char caracter;
					
				if(dato.length() != 1) {		
				throw new InvalidDataException("Debes ingresar un unico Caracter para que sea válido");
				}
					
				caracter = dato.charAt(0);	
				System.out.print("Char " + caracter);	
				return caracter;			
		}
		
		public static String leerString(String mensaje) throws InvalidDataException{
			
				System.out.println(mensaje);
				String dato = input.nextLine();
				Float isfloat;
				int isInt;
				//boolean isString = false;
			
				if (dato.length()<=1){
					throw new InvalidDataException("Debes Ingresar una cadena de carateres");
				}
				if(dato.contains(".") || dato.contains(",")){
					try {
						isfloat = Float.parseFloat(dato);
						throw new InvalidDataException("Debes Ingresar una cadena de carateres");	
					}catch(NumberFormatException e) {
						System.out.println(dato + " Es un String");
					}
					}else{
						try{
							isInt = Integer.parseInt(dato);
							throw new InvalidDataException("Debes Ingresar una cadena de carateres");
						}catch(NumberFormatException e) {
							//System.out.println(dato + " Es un String");
						}
					}
					
					System.out.print("String " + dato);
					return dato;
		}
 		
		public static boolean leerSINO(String mensaje) throws InvalidDataException{
			
				boolean dato = false;
				//char caracter;
				System.out.println(mensaje);
				String opcion = input.nextLine();
				
				if(opcion.length() > 1) {
					throw new InvalidDataException("Debes elegir la opcion correcta S/N");
				}else if(opcion.contains("s") || opcion.contains("S")) {
					dato = true;
				}else if(opcion.contains("n") || opcion.contains("N")) {
					dato = false;
				}else{
					throw new InvalidDataException("Debes elegir la opcion correcta S/N");
				}
			
				System.out.print(dato);
				return dato;
		}
		
} 
