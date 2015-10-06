import java.io.Serializable;
public class Persona implements Serializable{
	private String nome;
	private int idade;
	final static long serialVersionUID=1L;
	public Persona(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}
	public Persona(){}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setIdade(int idade){
		this.idade=idade;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
}//class