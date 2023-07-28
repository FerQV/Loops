import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingresa el valor de n: ");
		int n = in.nextInt(); //Se establece n como dicta el ejercicio
		
		int sum = 0; // nos indica que la variable debe empezar con 0
		int sum1 = 1; //  y con 1
		int fibonacci=n;// nos indica los números fibonacci que nos dan, puse n para no tener límite
		int cont = 0; // Recuerda: el 0 pq empeiza a contar de 0 hasta n, como establece la actividad
		
		do {
			fibonacci = sum; //Recuerda que quedó con sum pq queremos que sea el núm anterior al actual
			sum = sum1; //Recuerda que es el número anterior al que queremos calcular
			sum1 = fibonacci + sum; //Aquí inicia la suma (sum of the two proceding ones)
			
			System.out.println("n(" + cont + ") = " + "Fibonacci" + "(" + fibonacci + ")"); //Recuerda cómo hicimos para encerrar en paréntesis
			cont++; //Recuerda que ++ es para que no quede en buble y vaya aumentando de 1 en 1
		} while (cont <=n); // Funcione mientras mi cont sea menor o igual a mi n, ya que empezará en 0, pero tiene que aumentarse cada vez
	}
	
}
