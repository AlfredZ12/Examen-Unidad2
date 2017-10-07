
public class Program {
	public static void main(String args[]){
		Examen G = new Examen();
		System.out.println("\n El maximo comun divisor  de A y B es: " + G.numeros(48,60));
		
		G.Ciclo(15,20);
		
		System.out.println("\n el Maximo comun divisor de A y B es: " + G.Ciclowhile(30,18));
		
		System.out.println("\n El Maximo comun divisor de A y B es: "+ G.MCMRecursivo(15, 20 ));
		
		G.Arrays(35,90);
	}

}
