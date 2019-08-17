
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 =new Persona("Arturo","Borja",new Mascota(),0);
		
		p1.start();
		p1.mascota.start();

	}

}
