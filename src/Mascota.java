
public class Mascota extends Thread implements Acciones {
	String nombre;
	double kmetro;
	double energia;
	public Mascota() {
		this.nombre = "firulai";
		this.kmetro = 0;
		this.energia=200;
	}
	public void Imprimir() {
		System.out.print(nombre);
	}
	public void run() {
		if(kmetro<40) {
			Correr();
		}
	}
	@Override
	public void Caminar() {
		do {
			kmetro+=1;
			energia-=5;
			Imprimir();
			System.out.println(" Esta caminando ("+kmetro+")");
		}while(energia>0);
		Parar();
		
	}

	@Override
	public void Correr() {
		do {
			kmetro+=4.0;
			energia-=20;
			Imprimir();
			System.out.println(" Esta corriendo("+kmetro+")");		
		}while(energia>100);
		Caminar();
		
	}

	@Override
	public void Parar() {
		do {
			energia+=50;
			Imprimir();
			System.out.println(" Paro("+kmetro+")");		
		}while(energia>100);
		run();	
	}
	
}
