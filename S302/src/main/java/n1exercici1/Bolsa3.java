package n1exercici1;

public class Bolsa3 extends Observador {

	public Bolsa3(Sujeto sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("La bolsa " + sujeto.getEstado());

	}

}
