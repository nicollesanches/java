package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	public interface contaRepository {

		// CRUD de Conta
		public void procurarPorNumero(int numero);

		public void listarTodas();

		public void cadastrar(Conta conta);

		public void atualizar(Conta conta);

		public void deletar(int numero);

		// Métodos Bancários
		public void sacar(int numero, float valor);

		public void depositar(int numero, float valor);

		public void transferir(int numeroOrigem, int numeroDestino, float valor);

	}

	void procurarPorNumero(int numero);

	void listarTodas();

	void cadastrar(Conta conta);

	void atualizar(Conta conta);

	void deletar(int numero);

	void sacar(int numero, float valor);

	void depositar(int numero, float valor);

	void transferir(int numeroOrigem, int numeroDestino, float valor);
}