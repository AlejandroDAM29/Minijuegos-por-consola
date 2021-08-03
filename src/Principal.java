import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	
	//Aquí es donde voy a declarar todas las instancias de clase
	encuentra_numero en = new encuentra_numero();
	Impresiones im = new Impresiones();
	adivinanza ad = new adivinanza();
	Ahorcado ah = new Ahorcado();
	Scanner Sc = new Scanner(System.in);
	
	//Variables
	int eleccion;
	
System.out.println("OS XOGOS DE BEATRIZ. \nPara ler a mensaxe oculta nesta aplicación, debes "
		+ "completar cada videoxogo e descubrir que letras hai na parte inferior da pantalla.");
	Impresiones.seleccion();
	
	do {
	eleccion = im.elegirNumero();
	//Dependiendo de lo que escoja, jugará a un juego u otro.
	
	switch(eleccion) {
	case 1:
		//Juego encontrar número
		en.principal();
		Impresiones.cls();
		Impresiones.seleccion();
		break;
	case 2:
		ad.principal();
		Impresiones.cls();
		Impresiones.seleccion();
		break;
	case 3:
		ah.principal();
		Impresiones.cls();
		Impresiones.seleccion();
		break;
	case 4: 
		System.out.println("¡¡¡Ata pronto!!! Prema ENTER para saír.");
		Sc.nextLine();
		
		break;
	}
	}while(eleccion !=4);
	
	
}//Fin de método static



}

class Impresiones{
	
	//Constructores que necesito para esta clase
	Scanner S = new Scanner(System.in);
	int nEleccion;
	boolean correcto=false;
	String limpiador;
	
	
	
	//Para borrar pantalla
	public static final void cls() {
	for(int i=0;i<5;i++) 
		System.out.println();
	}
	
	
	
	//Para imprimir un mensaje
	public static final void seleccion() {
		System.out.println("Selecciona un número e prema ENTER para comezar un xogo:"
				+ "\n1 - Busca o número secreto."
				+ "\n2 - Adiviña adiviñanza."
				+ "\n3 - Aforcado."
				+ "\n4 - saír do programa.");
		}
	
	
	public int elegirNumero() {
		
	while(!correcto) {	
		try {
		nEleccion = S.nextInt();
			if(nEleccion >0 && nEleccion <5)
				correcto = true;
			else {
				System.out.println("Selecciona un número entre 1 e 4.");
			}
		}catch (InputMismatchException e) {
			System.out.println("Non se poden introducir letras ou números que non estean entre 1 e 4. Por favor, ténteo de novo");
			limpiador = S.nextLine();
		}
		}
	cls();
	correcto=false;
	return nEleccion;
	}//Final de método
	}//Final de clase
	
