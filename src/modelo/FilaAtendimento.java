package modelo;

public class FilaAtendimento {
	private NoFila primeiro;
	private int tamanho = 0;

	// Construtor da fila de atendimento
	public FilaAtendimento() {
		this.primeiro = null;
	}

	// Verifica se a fila está vazia
	public boolean estaVazia() {
		return (this.primeiro == null);
	}

	// Adiciona um novo atendimento no final da fila
	public void adicionar(Atendimento atendimento) {
		NoFila novoAtendimento = new NoFila(atendimento);
		if (estaVazia()) {
			this.primeiro = novoAtendimento;
		} else {
			NoFila aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoAtendimento);
		}
		tamanho++;
	}

	// Remover um atendimento no inicío da fila
	public Atendimento remover() {
		if (estaVazia()) {
			System.out.println("A fila de Atendimento está vazia!");
			return null;
		} else {
			Atendimento elemento = this.primeiro.getAtendimento();
			this.primeiro = this.primeiro.getProximo();
			tamanho--;
			return elemento;
		}
	}

	// Retorna o primeiro atendimento da fila
	public Atendimento topo() {
		if (estaVazia()) {
			System.out.println("A fila de Atendimento está vazia!");
			return null;
		} else {
			return this.primeiro.getAtendimento();
		}
	}

	// Retorna o tamanho da fila
	public int tamanho() {
		return tamanho;
	}

	// Imprime a fila
	public String imprimirAtendimentos() {
		NoFila aux = this.primeiro;
		String impressao = null;

		if (tamanho() == 1) {
			impressao = "\nNome: " + aux.getAtendimento().getPaciente().getNome() + "\nCPF: "
					+ aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
					+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
					+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
					+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
					+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
					+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
					+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
					+ aux.getAtendimento().getParecer() + "\n----------------------------------------------";
		} else if (this.primeiro != null) {
			while (aux.getProximo() != null) {
				if (aux == this.primeiro) {
					impressao = "\nNome: " + aux.getAtendimento().getPaciente().getNome() + "\nCPF: "
							+ aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
							+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
							+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
							+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
							+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
							+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
							+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
							+ aux.getAtendimento().getParecer() + "\n----------------------------------------------";
					aux = aux.getProximo();
				} else {
					impressao = impressao.concat(impressao = "\nNome: " + aux.getAtendimento().getPaciente().getNome()
							+ "\nCPF: " + aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
							+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
							+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
							+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
							+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
							+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
							+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
							+ aux.getAtendimento().getParecer() + "\n----------------------------------------------");
					aux = aux.getProximo();
				}
			}
			impressao = impressao.concat(impressao = "\nNome: " + aux.getAtendimento().getPaciente().getNome()
					+ "\nCPF: " + aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
					+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
					+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
					+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
					+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
					+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
					+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
					+ aux.getAtendimento().getParecer() + "\n----------------------------------------------");
		} else {
			impressao = "A fila está vazia!";
		}
		return impressao;
	}

	// Limpa a fila
	public void limpa() {
		this.primeiro = null;
	}
}