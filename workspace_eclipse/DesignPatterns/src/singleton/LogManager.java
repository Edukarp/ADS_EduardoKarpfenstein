package singleton;
//Singleton -> Controla o numero de instancias de uma classe restringindo a uma, assim
//nao ocorrendo o risco de acontecer sobrecarga no sistema
public class LogManager {
	
	//cria uma 'instance' privada e estatica do tipo da classe
	private static LogManager instance;
	
	//Cria o construtor de forma PRIVADA
	private LogManager() {
		
	}
	
	//Quando for chamado ele vai avaliar se ja existe alguma instancia, se nao tiver ele cria
	public static LogManager getInstance() {
		if(instance == null) {
			instance = new LogManager();
			
		}
		return instance;
	}
	
	public void info(String msg) {
		System.out.println("info: " + msg);
	}
	
	public void error(String msg) {
		System.out.println("error: " + msg);
	}
	
	public void warn(String msg) {
		System.out.println("warn: " + msg);
	}

}
