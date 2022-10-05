package n1exercici1;

import java.util.ArrayList;

public class Sujeto {

	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}

	public void notificarTodosObservadores() {
		observadores.forEach(x -> x.actualizar());
	}

}
