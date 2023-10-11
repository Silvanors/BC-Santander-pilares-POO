package exemplo_pilarespoo;

public class Carro extends Veiculo {
	
	
	
	public void ligar() {
		/*
		 * os métodos confereCombustivel e confereCambio estão encapsulados no método "ligar()"
		 */
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCombustivel() {
		System.out.println("conferindo combustível");
	}
	
	private void confereCambio() {
		System.out.println("conferindo cambio em P");
	}
}
