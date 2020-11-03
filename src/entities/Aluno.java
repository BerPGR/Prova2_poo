package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private List<Avaliacao> ava = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Avaliacao> getAva() {
		return ava;
	}

	public void addAvaliacao(Avaliacao a) {
		ava.add(a);
	}
	
	public float getMedia() {
		return 0f;
	}
	
	public String exibeBoletim() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}
	

}
