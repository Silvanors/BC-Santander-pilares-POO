package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("Copiando via Multifincional");
	}

	public void digitalizar() {
		System.out.println("Digitalizando via Multifincional");
		
	}

	public void imprimir() {
		System.out.println("Imprimindo via Multifincional");
		
	}

}
