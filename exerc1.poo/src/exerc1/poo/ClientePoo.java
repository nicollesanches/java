package exerc1.poo;

public class ClientePoo {
	
	private String nome;
	private int idade;
	private String endereço; 
	private String email; 
	private String nomeDaMae;
	
	public ClientePoo(String nome, int idade, String endereço, String email, String nomeDaMae) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
		this.email = email;
		this.nomeDaMae = nomeDaMae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	} 
	
	
   public void visualizar() {
	   
	   
	   System.out.println("*****************************************");
	   System.out.println("             DADOS DO CLIENTE            ");
	   System.out.println("*****************************************");
	   System.out.println("Nome: " + this.nome);
	   System.out.println("Idade: " + this.idade);
	   System.out.println("Endereço: " + this.endereço);
	   System.out.println("Email: " + this.email);
	   System.out.println("Nome Da Mãe: " + this.nomeDaMae);
	   
	   
   }

}
