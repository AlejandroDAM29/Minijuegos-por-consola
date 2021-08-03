import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//Esta clase es para jugar a encontrar el n�mero secreto. Tendr� un m�ximo de 10 oportunidades, y tendr� que acertar entre 50 n�meros.




public class encuentra_numero implements introduccion {

	//Este es elm�todo que voy a iniciar desde la clase principal desde el main.
	public void principal() {
		
		Random rm = new Random();
		intro();
		//Aqu� se crea n�mero aleatorio
		int numero = rm.nextInt(50)+1;
		
		Scanner S = new Scanner(System.in);
		int entrada=99;
		int oportunidades=5;
		//Este booleano es para ver si ha acertado
		boolean acertado = false;
		boolean correcto=false;
		
		
		for(int i=0;i<5&&acertado==false;i++) {
		while(!correcto||entrada>50||entrada<1) {
			System.out.println("Introduce un n�mero:");
			try {
			entrada = S.nextInt();
			correcto = true;
			//Para verificar por mensaje que el n�meo no est� entre 1 y 50
			if(entrada<1||entrada>50)
				System.out.println("O n�mero introducido debe estar comprendido entre o 1 e o 50");
			
			}catch(InputMismatchException e) {
				System.out.println("Non podes introducir unha letra. Debe ser un n�mero comprendido entre o 1 e o 50");
				S.nextLine();
				
			}
		}//Fin bucle while
		
			if(entrada<numero) {
				oportunidades--;
				if(oportunidades>0) {
				System.out.println("�Ups! � un pouco m�is alto. Quedan "+oportunidades+" oportunidades.");
				}
				correcto=false;
			}else if(entrada>numero) {
				oportunidades--;
				if(oportunidades>0) {
				System.out.println("El n�mero que buscas � menor. Quedan "+oportunidades+" oportunidades.");
				}
				correcto=false;
			}else if(entrada==numero) {
				acertado=true;
			}
		}//Fin de bucle for
		
		
		if(!acertado) {
			System.out.println("Perdiches todas as t�as posibilidades. Volve intentalo outra vez");
		}else {
			System.out.println("�Acertaches! O n�mero secreto era o "+ numero +". A pista � a seguinte: 36.525351 ");
		}
		
		
		
		System.out.println("Prima ENTER para continuar");
		S.nextLine();
		S.nextLine();
		
	}
	
	
	public void intro() {
		System.out.println("Xerouse un n�mero aleatorio e tes que adivi�ar de que n�mero se trata."
				+ " Este n�mero est� entre o 1 e o 50 (inclusive) e s� ter�s 5 oportunidades.");
	}
	
}
