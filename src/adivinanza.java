import java.util.InputMismatchException;
import java.util.Scanner;
public class adivinanza extends adivina implements introduccion{

	Scanner S =new Scanner(System.in);
	String teclado; // Para saber lo que el usuario introduce por teclado
	boolean continua=false;
	int puntos=0;
	int opcion;
	
	String adivinanza1="Adivinanza 1: \n¿Que é o primeiro que un home pon nunha muller cando se casan?";
	String adivinanza2="Adivinanza 2: \nCoñecenme na guerra, o meu nome é maiúsculo, se me poñas sobre a mesa estou seguro de que te gustará.";
	String adivinanza3="Adivinanza 3: \nA miña nai é unha tartamudeira, meu pai é un cantante, o meu vestido é branco e o meu corazón amarelo. Quen son eu?";
	String adivinanza4="Adivinanza 4: \nTrátanme como un santo e tráeme o día comigo, son redondo e encarnado e teño sangue frío";
	String adivinanza5="Adivinanza 5: \nEstá na sopa e nunca debes comelo ...";
	
	
	
	//Constructor de esta clase, que hace referencia a la clase padre en él con super. La variable poema es de la clase padre.
	public adivinanza() {
		super();
	}//Fin de constructor
	
	public void principal() {
		
		intro();
		
		System.out.println(adivinanza1);
		teclado=S.nextLine().toLowerCase();
		compRespuesta("anillo");
		System.out.println(adivinanza2);
		teclado=S.nextLine().toLowerCase();
		compRespuesta("granada");
		System.out.println(adivinanza3);
		teclado=S.nextLine().toLowerCase();
		compRespuesta("huevo");
		System.out.println(adivinanza4);
		teclado=S.nextLine().toLowerCase();
		compRespuesta("sandía");
		System.out.println(adivinanza5);
		teclado=S.nextLine().toLowerCase();
		compRespuesta("cuchara");
		
		if(puntos==5)
			System.out.println("Adiviñaches todas as adivinanzas. O mensaxe oculto é o seguinte: , (é unha coma)");
		else
			System.out.println("Parece que non acertaches todas as adivinanzas."
					+ " Agardo por ti ata que descubras todas as respostas.");
		
		System.out.println("Pulsa ENTER para volver ao menú principal.");
		S.nextLine();
	}
	
	
	public int compRespuesta(String respuesta) {
		do {
		if(respuesta.equals(teclado)) {
			System.out.println("¡Acertaches! tes un punto máis. Pulsa ENTER para continuar..");
			puntos++;
			continua=true;
		}else {
			System.out.println("Sen sorte. Escolla unha opción e prema ENTER \n1 - Inténtao de novo.\n2 - Continúa ata a seguinte");
		do {
			try {
			opcion = S.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Debes escribir un número entre 1 e 2. Non valen letras.");
			S.nextLine();
		}
			}while(opcion<1||opcion>2);
			if(opcion==1) {
			continua =false;
			System.out.println("Escribe a túa resposta de novo:");
			S.nextLine();
			teclado =S.nextLine().toLowerCase();
			System.out.println("Presiona ENTER a ver se o acertaches.");
			}else if(opcion==2) {
				continua=true;
			}else {
				continua=false;
			}
		}
		S.nextLine();
		opcion=0;//Esta instrucción es para que no pase de poema por si se queda la opcion 2 guardada del anterior poema.
		}while(!continua);
		
		return puntos;//Si se reúnen los 5 puntos, pues se deja en verdadero para que dé el mensaje.
	}
	
	
	
	public void intro() {
		System.out.println("Trata de adiviñar as respostas das seguintes adivinanzas. Cando o teñas claro, escribe o"  
				+ "responde e prema ENTER. Ten en conta que as respostas son dunha soa palabra.");
	}
}
