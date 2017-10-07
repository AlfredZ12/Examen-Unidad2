public class Examen {
	public int numeros(int a, int b){
	   int mcd = b%a; //utilizando la formula de euclides
       return mcd;
       
       /* Dividimos el valor de  B de Dividendo / el valor de A como divisor para que nos de de cociente 1 y el residuo que nos deje 
          dichas division sera el maximo comun divisor */
        
        //int Factorizar = 0;
	}
	
	public void Ciclo(int a, int b){
		
		 int f,c; 
	  for (f = 1 , c = 1; f <= a && c <= b;f++ ,c++){
		 int valor = a%f;
		 
		if ( valor   == 0)
			System.out.println("\t >>> divisores de a: "+f);
		
		int valor2 = b%c;
		if(valor2 == 0)
			System.out.println("\t divisores de b: " +c);
	   }
	  //Buscamos todos los divisores de dos numeros y los mostramos en consola y de esos numeros encontrados elegir el maximo que divida a ambos 	
	}
 
	public int Ciclowhile(int a, int b){
		int mcd;
		do{
			if (a > b){
			 mcd = a % b;}
			else mcd = b % a;
			
		}while(mcd == 0);
		return mcd;
	}
	
	public int MCMRecursivo(int a, int b){
		if(b <=0) 
			return a
					;
		else 
			return MCMRecursivo(b, a%b);
	}
	
	public  void Arrays (int a, int b){
		int [] Num = {a}; 
		for (int f = 0; f < Num.length;f++){
			Num[f] = b%a;
			System.out.println("\n Maximo comun Divisor: " + Num[f]);
		}
	}
}
