package n1exercici1;

public class Main {

	public static void main(String[] args) {

		Sujeto sujeto = new Sujeto();

		new Bolsa1(sujeto);
		new Bolsa2(sujeto);
		new Bolsa3(sujeto);

		sujeto.setEstado("sube");

	}
}
