package EjercicioN2;

public class InvalidDataException extends Exception  {
	
	public InvalidDataException() {
		super("El tipo de dato ingresado es incorrecto");
	}
	
	
	public InvalidDataException(String mensaje) {
		
		super(mensaje);
	}
	

}
