public class Main {
	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("José Silva");
		
		Conta cc = new ContaCorrente(daniel);
		Conta poupança = new ContaPoupança(daniel);
		
		cc.depositar(300.00);
		cc.trasferir(100.00, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
	}
}
