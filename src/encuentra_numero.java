import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//Esta clase es para jugar a encontrar el número secreto. Tendrá un máximo de 10 oportunidades, y tendrá que acertar entre 50 números.




public class encuentra_numero implements introduccion {

	//Este es elmétodo que voy a iniciar desde la clase principal desde el main.
	public void principal() {
		
		Random rm = new Random();
		intro();
		//Aquí se crea número aleatorio
		int numero = rm.nextInt(50)+1;
		
		Scanner S = new Scanner(System.in);
		int entrada=99;
		int oportunidades=5;
		//Este booleano es para ver si ha acertado
		boolean acertado = false;
		boolean correcto=false;
		
		
		for(int i=0;i<5&&acertado==false;i++) {
		while(!correcto||entrada>50||entrada<1) {
			System.out.println("Introduce un número:");
			try {
			entrada = S.nextInt();
			correcto = true;
			//Para verificar por mensaje que el númeo no está entre 1 y 50
			if(entrada<1||entrada>50)
				System.out.println("O número introducido debe estar comprendido entre o 1 e o 50");
			
			}catch(InputMismatchException e) {
				System.out.println("Non podes introducir unha letra. Debe ser un número comprendido entre o 1 e o 50");
				S.nextLine();
				
			}
		}//Fin bucle while
		
			if(entrada<numero) {
				oportunidades--;
				if(oportunidades>0) {
				System.out.println("¡Ups! É un pouco máis alto. Quedan "+oportunidades+" oportunidades.");
				}
				correcto=false;
			}else if(entrada>numero) {
				oportunidades--;
				if(oportunidades>0) {
				System.out.println("El número que buscas é menor. Quedan "+oportunidades+" oportunidades.");
				}
				correcto=false;
			}else if(entrada==numero) {
				acertado=true;
			}
		}//Fin de bucle for
		
		
		if(!acertado) {
			System.out.println("Perdiches todas as túas posibilidades. Volve intentalo outra vez");
		}else {
			System.out.println("¡Acertaches! O número secreto era o "+ numero +". A pista é a seguinte: 36.525351 ");
		}
		
		
		
		System.out.println("Prima ENTER para continuar");
		S.nextLine();
		S.nextLine();
		
	}
	
	
	public void intro() {
		System.out.println("Xerouse un número aleatorio e tes que adiviñar de que número se trata."
				+ " Este número está entre o 1 e o 50 (inclusive) e só terás 5 oportunidades.");
	}
	
}
