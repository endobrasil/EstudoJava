package padroesProjeto.facade;

public class Facede {
	public void migrarCliente(String nome, String cep) {
		String cidade= CrmSService.getInstancia().recuperaCidade(cep);
		String estado =CrmSService.getInstancia().recuperaEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade,estado);
		
	}
	
}
