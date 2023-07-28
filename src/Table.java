	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num; // Se estableció que es número
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num); // Ingresar el número que queremos ue muestre la tabla de multiplicar
	        
	        int cont = 1; // Se estableció el valor de la variable, para que inicie desde 1.
	        while(cont <=100) { // con este while haremos que funcione con números igual o menor de 100
	        	int result = num * cont; //Ahora, esta variable se creó para que la operación funcione
	        	System.out.println (num + " x " + cont + " = " + result); // Imprimimos el mensaje para que salga el número, más nuestra variable que denominará de dónde a dónde será el while y el result para que muestre resultado de operación
	        	cont ++; //Recuerda que ++ es para que no quede en buble y vaya aumentando de 1 en 1
	        }
	       //TODO implement While loop to get print result
	    }
	}
