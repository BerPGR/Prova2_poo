package entities;

public class Trabalho extends Avaliacao{

	private char conceito;

	public Trabalho(String descricao, char conceito) {
		super(descricao);
		this.setConceito(conceito);
	}

	public char getConceito() {
		return conceito;
	}

	public void setConceito(char conceito) {
		this.conceito = conceito;
	}

	@Override
	public float getNota() {
		return 0;
	}
	
	
	
}
