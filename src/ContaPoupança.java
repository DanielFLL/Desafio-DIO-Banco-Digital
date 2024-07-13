

public class ContaPoupança extends Conta {
	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("**Extrato Poupança**");
		super.imprimirInfosComuns();		
	}	
}
