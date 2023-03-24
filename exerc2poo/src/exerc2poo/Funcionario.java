package exerc2poo;

public class Funcionario {
	
	
	private String nome; 
	private String email; 
	private String cargo; 
	private float salario; 
	private boolean ativo;
	public Funcionario(String nome, String email, String cargo, float salario, boolean ativo) {
		this.salario = salario;
		this.email = email;
		this.cargo = cargo;
		this.nome = nome;
		this.ativo = ativo;
	}
	public String getnome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	} 
 
	public void visualizar() {
		
		   
		   System.out.println("*****************************************");
		   System.out.println("             DADOS DO FUNCIONÁRIO        ");
		   System.out.println("*****************************************");
		   System.out.println("nome: " + this.nome);
		   System.out.println("email: " + this.email);
		   System.out.println("cargo: " + this.cargo);
		   System.out.println("salario: " + this.salario);
		   System.out.println("ativo: " + this.ativo);
		   
		
	}
	
}
