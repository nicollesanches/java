package exerc1.poo;

public class PessoaJuridica extends ClientePoo{
	

	public PessoaJuridica(String nome, int idade, String endereço, String email, String nomeDaMae,
			String NumeroDoCnpj) {
		super(nome, idade, endereço, email, nomeDaMae);
		this.NumeroDoCnpj = NumeroDoCnpj;
	}

	private String NumeroDoCnpj;

	public String getNumeroDoCnpj() {
		return NumeroDoCnpj;
	}

	public void setNumeroDoCnpj(String NumeroDoCnpj) {
		this.NumeroDoCnpj = NumeroDoCnpj;
	}

	public void visualizar() {
	super.visualizar();
	System.out.println("Numero Do Cnpj:" + this.NumeroDoCnpj);}
	

}
	

