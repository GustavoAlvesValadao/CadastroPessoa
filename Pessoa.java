package Pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa() {
		super();
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
	
	
	@Override
    public String toString(){
		if(idade >= 0 && idade <12) {
			return ("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Categoria:  " + "Criança " + "\n") ;				
		}else
		if (idade >=12 && idade <= 19){
			return ("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Categoria:  " + "Adolescente " + "\n");
		}else 
		if(idade >=20 && idade <65) {
			return ("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Categoria:  " + "Adulto " + "\n");
		}
		else{
			return ("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Categoria:  " + "Idoso " + "\n");
		}
    }
	
	
}
	


	