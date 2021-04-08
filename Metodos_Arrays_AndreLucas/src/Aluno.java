
public class Aluno {
	
	private String Nome;
	private boolean Presenca;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public boolean isPresenca() {
		return Presenca;
	}
	public void setPresenca(boolean presenca) {
		Presenca = presenca;
	}
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, boolean presenca) {
		super();
		Nome = nome;
		Presenca = presenca;
	}
	
}
