import java.util.Random;

//Realizar la multiplicacion de todos los elementos de un vector de enteros por 10.


public class principal extends Thread{
	//si queremos que varios hilos accedan a la misma varaible debemos declararla estática
	//en el caso de la varaible tamb debe ser estática porque irá dentro de una variable 
	//usada por los hilos 
	private static int tam = 8;
	private static int[] vec = new int[tam];
	
	
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		Random rand = new Random(System.nanoTime());
		
		for(int i = 0; i < vec.length; i++) {
			vec[i] = rand.nextInt(10);
		}
		
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
		}
	}

}
