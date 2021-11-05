package modelo;

public class NoFila {

	private Atendimento atendimento;
	private NoFila proximo;

	// Construtor do NoAtendimento
	public NoFila(Atendimento atendimento) {
		super();
		this.atendimento = atendimento;
		this.proximo = null;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public NoFila getProximo() {
		return proximo;
	}

	public void setProximo(NoFila proximo) {
		this.proximo = proximo;
	}
}