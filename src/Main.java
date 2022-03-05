
public class Main {

	public static void main(String[] args) {

		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		cc.depositar(100);
		
		Conta cp = new ContaPoupança(bruno);
		cp.depositar(150);
		
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
