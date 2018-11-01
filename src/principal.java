import java.util.Random;

//Realizar la multiplicacion de todos los elementos de un vector de enteros por 10.


public class principal extends Thread{
	//si queremos que varios hilos accedan a la misma varaible debemos declararla estática
	//en el caso de la varaible tamb debe ser estática porque irá dentro de una variable 
	//usada por los hilos 
	private static int tam = 8;
	private static int[] vec = new int[tam];
	private int ini, fin;
	
	public principal(int ini, int fin) {
		this.ini = ini;
		this.fin = fin;
	}
	
	
	public void run() {
		for(int i = ini; i < fin; i++) {
			vec[i] *= 10;
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random(System.nanoTime());
		
		for(int i = 0; i < vec.length; i++) {
			vec[i] = rand.nextInt(10);
		}
		
		//instanciamos dos objetos de la clase principal. 
		principal h1 = new principal(0, 4);
		principal h2 = new principal(4, 8);
		
		//lanzamos los dos hilos
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}catch(Exception ex) {}

		
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
		}
	}

}
