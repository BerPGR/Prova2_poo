package entities;

public abstract class Avaliacao {

	private String descricao;

	public Avaliacao(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract float getNota();
	
		
}
