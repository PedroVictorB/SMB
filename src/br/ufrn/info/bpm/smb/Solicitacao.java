package br.ufrn.info.bpm.smb;

import br.ufrn.info.bpm.api.KeySigObject;

public class Solicitacao implements KeySigObject{
	private long id;
	private String isbn;
	private int numeroSolicitante; //0 - estudante / 1 - professor / 2 - coordenador
	private boolean analiseSetorDeCompras;
	private boolean analiseCoordenador;
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumeroSolicitante() {
		return numeroSolicitante;
	}

	public void setNumeroSolicitante(int numeroSolicitante) {
		this.numeroSolicitante = numeroSolicitante;
	}

	public boolean isAnaliseSetorDeCompras() {
		return analiseSetorDeCompras;
	}

	public void setAnaliseSetorDeCompras(boolean analiseSetorDeCompras) {
		this.analiseSetorDeCompras = analiseSetorDeCompras;
	}

	public boolean isAnaliseCoordenador() {
		return analiseCoordenador;
	}

	public void setAnaliseCoordenador(boolean analiseCoordenador) {
		this.analiseCoordenador = analiseCoordenador;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public long getId() {
		return this.id;
	}
}
