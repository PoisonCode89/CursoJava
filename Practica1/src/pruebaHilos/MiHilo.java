package pruebaHilos;

public class MiHilo implements Runnable {
	Thread hilo;
	static SumArray sumarray = new SumArray();
	int a[];
	int resp;

	// Construye un nuevo hilo.
	MiHilo(String nombre, int nums[]) {
		hilo = new Thread(this, nombre);
		a = nums;
	}

	// Un m�todo que crea e inicia un hilo
	public static MiHilo creaEInicia(String nombre, int nums[]) {
		MiHilo miHilo = new MiHilo(nombre, nums);
		miHilo.hilo.start(); // Inicia el hilo
		return miHilo;
	}

	// Punto de entrada del hilo
	public void run() {
		System.out.println(hilo.getName() + " iniciando.");
		resp = sumarray.sumArray(a);
		System.out.println("Suma para " + hilo.getName() + " es " + resp);
		System.out.println(hilo.getName() + " terminado.");
	}

}
