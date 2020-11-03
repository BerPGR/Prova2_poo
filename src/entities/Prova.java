package entities;

public class Prova extends Avaliacao{

	private float nota;

	public Prova(String descricao, float nota) {
		super(descricao);
		this.setNota(nota);
	}


	public void setNota(float nota) {
		this.nota = nota;
	}


	@Override
	public float getNota() {
		return 0;
	}
	
	
	
}
