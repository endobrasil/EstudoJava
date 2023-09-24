package padroesProjeto.singleton;
/**
 * Singleton preguiçoso
 * @author wendel
 *
 */
public class SingletonPreguica {
	
	private static SingletonPreguica instancia;
	
	private SingletonPreguica() {
		super();
	}
	
	public static SingletonPreguica getInstancia() {
		if(instancia==null) {
			instancia=new SingletonPreguica();
		}
		return instancia;
	}
}
