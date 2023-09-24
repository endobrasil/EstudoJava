package padroesProjeto.facade;


public class CrmSService {
private static CrmSService instancia = new CrmSService();
	
	private CrmSService() {
		super();
	}
	
	public static CrmSService getInstancia() {
		return instancia;
	}
	
	public String recuperaCidade(String cep) {
		return "cidade";
	}
	
	public String recuperaEstado(String cep) {
		return "Estado";
	}
	
	

}
