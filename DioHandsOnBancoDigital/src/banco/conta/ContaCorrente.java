package banco.conta;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);		
	}

	@Override
	public void extrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();		
	}

}
