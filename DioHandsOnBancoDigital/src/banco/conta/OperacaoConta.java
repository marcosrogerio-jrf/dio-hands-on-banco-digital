package banco.conta;

public interface OperacaoConta {
	void saque(double valor);
	void deposito(double valor);
	void tranferencia(double valor, Conta contaDestino);
	void extrato();
}
