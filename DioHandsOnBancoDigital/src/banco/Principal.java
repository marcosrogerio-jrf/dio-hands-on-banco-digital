package banco;

import banco.cliente.Cliente;
import banco.conta.Banco;
import banco.conta.Conta;
import banco.conta.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		
		Banco bb = new Banco();
		bb.setNome("Banco do Brasil");
				
		Cliente c1 = new Cliente();
		c1.setNome("Izabel");
		
		Cliente c2 = new Cliente();
		c2.setNome("Pedro");
		
		Conta cc1 = new ContaCorrente(c1);
		Conta cc2 = new ContaCorrente(c2);
		
		cc1.deposito(150);
		cc1.tranferencia(100, cc2);
		
		cc1.extrato();
		cc2.extrato();
	}
}
