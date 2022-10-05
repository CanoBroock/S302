package n1exercici1;

public class Bolsa1 extends Observador {

	public Bolsa1(Sujeto sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("La bolsa " + sujeto.getEstado());

	}

}
