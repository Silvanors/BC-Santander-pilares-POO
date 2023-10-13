package exemplo_msnmessenger.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}

/*código utilizado antes da criação da Classe "ServicoMensagemInstantanea"*/
//public class MSNMessenger {
	
//	public void enviarMensagem() {
//		validarConectadoInternet();
//		System.out.println("Enviando mensagem pelo MSN Messenger");
//		salvarHistoricoMensagem();
//	}
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem pelo MSN Messenger");
//	}
//	private void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o histórico da mensagem");
//	}
}
