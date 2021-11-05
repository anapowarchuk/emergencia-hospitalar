package modelo;

public class NoLista {
	private NoLista anterior;
	private Paciente paciente;
	private Atendimento atendimento;
	private NoLista proximo;

	// Construtor Paciente
	public NoLista(Paciente paciente) {
		this.paciente = paciente;
		this.proximo = null;
		this.anterior = null;
	}

	//Construtor Paciente
	public NoLista(NoLista anterior, Paciente paciente, NoLista proximo) {
		super();
		this.anterior = anterior;
		this.paciente = paciente;
		this.proximo = proximo;
	}

	// Construtor Atendimento
	public NoLista(Atendimento atendimento) {
		this.atendimento = atendimento;
		this.proximo = null;
		this.anterior = null;
	}

	public NoLista getAnterior() {
		return anterior;
	}

	public void setAnterior(NoLista anterior) {
		this.anterior = anterior;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public NoLista getProximo() {
		return proximo;
	}

	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

}