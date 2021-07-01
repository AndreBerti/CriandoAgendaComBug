package entites;

public class People {

	private String nome,tel,cpf;
	
	public People(String nome, String tel, String cpf) {
		this.nome = nome;
		this.tel = tel;
		this.cpf =cpf;
	}
	public String getNome() {
		return this.nome;
	}
	public String getTel() {
		return this.tel;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String toString() {
		return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nTelefone: "+this.tel;
	}
	

}
