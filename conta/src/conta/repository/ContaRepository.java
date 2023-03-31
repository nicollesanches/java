package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	public interface contaRepository {

	   
	    public void procurarPorNumero(int numero);
	    public void listarTodas();
	    public void cadastrar(Conta conta);
	    public void atualizar(Conta conta);
	    public void deletar(int numero);

	   
	    public void sacar(int numero, float valor);
	    public void depositar(int numero, float valor);
	    public void transferir(int numeroOrigem, int numeroDestino, float valor);

	}

	void transferir(int numeroOrigem, int numeroDestino, float valor);

	/**
	 *  Procurar Conta por numero
	 * */
	void procurarPorNumero(int numero);

	/**
	 *  Método Listar todas as Contas
	 * */
	void listarTodas();

	/** 
	 * Método Cadastrar no Conta
	 * */
	void cadastrar(Conta conta);

	/**
	 * Atualizar dados da Conta
	 * */
	void atualizar(Conta conta);

	/**
	 *  Apagar Conta
	 * */
	void deletar(int numero);

	void sacar(int numero, float valor);

	void depositar(int numero, float valor);

}
