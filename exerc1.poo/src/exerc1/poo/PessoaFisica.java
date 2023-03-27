package exerc1.poo;

public class PessoaFisica extends ClientePoo{
	
	private String statusCivil;

	public PessoaFisica(String nome, int idade, String endereço, String email, String nomeDaMae, String statusCivil) {
		super(nome, idade, endereço, email, nomeDaMae);
		this.statusCivil = statusCivil;
	}

	public String getStatusCivil() {
		return statusCivil;
	}

	public void setStatusCivil(String statusCivil) {
		this.statusCivil = statusCivil;
	}
	@Override
public void visualizar() {
	super.visualizar();
	System.out.println("Status civil:" + this.statusCivil);
	
}
	
}
