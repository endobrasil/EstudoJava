package padroesProjeto.singleton;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonPreguica preguica=SingletonPreguica.getInstancia();
		System.out.println(preguica);
		preguica=SingletonPreguica.getInstancia();
		System.out.println(preguica);
		
		SingletonApressado apressado=SingletonApressado.getInstancia();
		System.out.println(apressado);
		apressado=SingletonApressado.getInstancia();
		System.out.println(apressado);
		
		SingletonLazyHolder lazy = SingletonLazyHolder.getInstancia();
		System.out.println(lazy);
		lazy=SingletonLazyHolder.getInstancia();
		System.out.println(lazy);
		

	}

}
