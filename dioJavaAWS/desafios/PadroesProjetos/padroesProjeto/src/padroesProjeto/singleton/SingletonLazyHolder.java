package padroesProjeto.singleton;
/**
 * Singleton Lazy Holder
 * @author wendel
 * 
 * stackoverflow.com/24018148
 *
 */
public class SingletonLazyHolder {

	private static SingletonLazyHolder instancia;
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		if(instancia==null) {
			instancia=new SingletonLazyHolder();
		}
		return instancia;
	}
	

}
