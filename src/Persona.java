
public class Persona extends Thread implements Acciones{
	String nombre;
	String apellido;
	double kmetro;
	Mascota mascota;
	
	public Persona(String nombre, String apellido, Mascota mascota, double kmetro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mascota = mascota;
		this.kmetro=kmetro;
	}
	public void run() {
		if(kmetro<40) {
			Correr();
		}
	}
	public void Imprimir() {
		System.out.print (nombre+" "+apellido);
	}

	@Override
	public void Caminar() {
		int a1=100;
		do {
			kmetro+=0.3;
			a1-=1;
			Imprimir();
			System.out.println(" Esta caminando ("+kmetro+")");
		}while(a1>0);
		Parar();
		
	}

	@Override
	public void Correr() {
		int a1=100;
		do {
			kmetro+=2.0;
			a1-=20;
			Imprimir();
			System.out.println(" Esta corriendo("+kmetro+")");		
		}while(a1>0);
		Caminar();
		
	}

	@Override
	public void Parar() {
		Imprimir();
		System.out.println(" Paro("+kmetro+")");
		
	}
	
}
