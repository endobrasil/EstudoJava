package padroesProjeto.facade;

public class CrmService {
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade,String estado) {
		System.out.println("Cliente salvo no crm "+nome+cep+cidade+estado);
	}

}
