package exemplo_msnmessenger;

import exemplo_msnmessenger.apps.FacebookMessenger;
import exemplo_msnmessenger.apps.MSNMessenger;
import exemplo_msnmessenger.apps.ServicoMensagemInstantanea;
import exemplo_msnmessenger.apps.Telegram;

/*
 * Simulação do uso da classe MSNMessenger sem polimorfismo
 */
//public class ComputadorPedrinho {
//	public static void main(String[] args) {
//		//abrindo MSN Messenger
//		System.out.println(">>>--MSN--<<<");
//		MSNMessenger msn = new MSNMessenger();
//		//msn.validarConectadoInternet();
//		msn.enviarMensagem();
//		//msn.salvarHistoricoMensagem();
//		msn.receberMensagem();
//		
//		System.out.println(">>>--FACEBOOK--<<<");
//		FacebookMessenger fcb = new FacebookMessenger();
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
//		
//		System.out.println(">>>--TELEGRAM--<<<");
//		Telegram tlg = new Telegram();
//		tlg.enviarMensagem();
//		tlg.receberMensagem();
//	}


public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*  No Polimorfismo
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
		
		//Com o protected as classe filhas e no mesmo pacote podem visualizar
		//smi.validarConectadoInternet();
	}
}