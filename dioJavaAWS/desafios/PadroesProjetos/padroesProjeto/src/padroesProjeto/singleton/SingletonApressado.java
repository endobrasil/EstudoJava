package padroesProjeto.singleton;
/**
 * Singleton Apressado
 * @author wendel
 *
 */
public class SingletonApressado {

	private static SingletonApressado instancia;
	
	private SingletonApressado() {
		super();
	}
	
	public static SingletonApressado getInstancia() {
		if(instancia==null) {
			instancia=new SingletonApressado();
		}
		return instancia;
	}
	

}
