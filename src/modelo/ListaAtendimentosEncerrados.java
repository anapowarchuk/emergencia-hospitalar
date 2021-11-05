package modelo;

public class ListaAtendimentosEncerrados {

	private NoLista primeiro;
	private NoLista ultimo;

	// Construtor da lista
	public ListaAtendimentosEncerrados() {
		this.primeiro = null;
		this.ultimo = null;
	}

	// Verifica se a lista está vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	// Adiciona o atendimento encerrado no começo da lista
	public void adicionarInicio(Atendimento atendimento) {
		NoLista novo = new NoLista(atendimento);
		if (estaVazia()) {
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			novo.setProximo(this.primeiro);
			this.primeiro.setAnterior(novo);
		}
		this.primeiro = novo;
	}

	// Adiciona o atendimento encerrado no final da lista
	public void adicionarFinal(Atendimento atendimento) {
		NoLista novo = new NoLista(atendimento);

		if (estaVazia()) {
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			this.ultimo.setProximo(novo);
			novo.setAnterior(ultimo);
			this.ultimo = novo;
		}
	}

	// Buscar um atendimento na lista pelo CPF
	public Atendimento buscarCPF(String cpf) {
		NoLista aux = this.primeiro;
		Atendimento elemento = null;

		while (true) {
			if (tamanho() == 0) {
				break;
			}
			if (cpf.equals(aux.getAtendimento().getPaciente().getCpf())) {
				elemento = aux.getAtendimento();
				break;
			}
			if (aux == this.ultimo) {
				break;
			}
			aux = aux.getProximo();
		}
		return elemento;
	}

	// Verifica o tamanho da lista
	public int tamanho() {
		int cont = 1;
		NoLista aux = this.primeiro;

		if (aux == null) {
			return 0;
		} else {
			while (aux != this.ultimo) {
				aux = aux.getProximo();
				cont++;
			}
			return cont;
		}
	}

	// Imprime lista
	public String imprimirAtendimentos() {
		NoLista aux = this.primeiro;
		String impressao = null;

		if (tamanho() == 1) {// Caso exista apenas um registro na lista
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
			while (aux != this.ultimo) {
				// Caso seja o primeiro, apenas adiciona à string
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
				} else {
					if (aux == this.primeiro) {
						impressao = "\nNome: " + aux.getAtendimento().getPaciente().getNome() + "\nCPF: "
								+ aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
								+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
								+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
								+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
								+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
								+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
								+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
								+ aux.getAtendimento().getParecer()
								+ "\n----------------------------------------------";
						aux = aux.getProximo();
					} else {
						impressao = impressao.concat(impressao = "\nNome: "
								+ aux.getAtendimento().getPaciente().getNome() + "\nCPF: "
								+ aux.getAtendimento().getPaciente().getCpf() + "\nData de Nascimento: "
								+ aux.getAtendimento().getPaciente().getDataNasc() + "\nHora Chegada: "
								+ aux.getAtendimento().getHoraChegada() + ":" + aux.getAtendimento().getMinutoChegada()
								+ "\nHora Atendimento: " + aux.getAtendimento().getHoraAtendimento() + ":"
								+ aux.getAtendimento().getMinutoAtendimento() + "\nHora Saída: "
								+ aux.getAtendimento().getHoraSaida() + ":" + aux.getAtendimento().getMinutoSaida()
								+ "\nPrioridade: " + aux.getAtendimento().getPrioridade() + "\nParecer: "
								+ aux.getAtendimento().getParecer()
								+ "\n----------------------------------------------");
						aux = aux.getProximo();
					}
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
			impressao = "A Lista está vazia!";
		}
		return impressao;
	}

	public String tempoMedioDeEspera() {
		NoLista aux = this.primeiro;
		int tempoChegada = 0; // Acumulador para o tempo total da chegada
		int tempoConsulta = 0; // Acumulador para o tempo total da consulta
		int cont = 0; // Contador
		int total = 0;
		int hora = 0;
		int minutos = 0;
		String tempoMedio = "00:00 HRs";

		// Caso a lista não esteja vazia
		if (primeiro != null) {
			// laço para percorrer a lista
			for (int i = 0; i < tamanho(); i++) {
				// Acumula o tempo em minutos ((Hora*60)+Minutos)
				tempoChegada += (aux.getAtendimento().getHoraChegada() * 60) + aux.getAtendimento().getMinutoChegada();
				tempoConsulta += (aux.getAtendimento().getHoraAtendimento() * 60)
						+ aux.getAtendimento().getMinutoAtendimento();
				cont++; // Incrementa acumulador
				aux = aux.getProximo(); // passa para o próximo nodo
			}

			// CASO A CONSULTA SEJA NO DIA SEGUINTE
			if (tempoChegada > tempoConsulta) {
				total = (((24 * 60) - tempoChegada) + tempoConsulta) / cont;
				hora = total / 60;
				minutos = total % 60;

				if (total < 60) {
					tempoMedio = Integer.toString(total) + " Min";
				} else {
					// Transforma o int hora e minutos em uma String
					String hr = Integer.toString(hora);
					String m = Integer.toString(minutos);

					if (hora < 10) {
						hr = "0" + Integer.toString(hora);
					}

					if (minutos < 10) {
						m = "0" + Integer.toString(minutos);
					}

					tempoMedio = hr + ":" + m + " HRs";
				}

			} else {
				// Faz o calculo da média de tempo ((Hora da consulta - Hora de Entrada)/total
				// de atendimentos na lista)/60
				total = (tempoConsulta - tempoChegada) / cont;
				hora = total / 60;
				minutos = total % 60;

				if (total < 60) {
					tempoMedio = Integer.toString(total) + " Min";
				} else {
					// Transforma o int hora e minutos em uma String
					String hr = Integer.toString(hora);
					String m = Integer.toString(minutos);

					if (hora < 10) {
						hr = "0" + Integer.toString(hora);
					}

					if (minutos < 10) {
						m = "0" + Integer.toString(minutos);
					}

					tempoMedio = hr + ":" + m + " HRs";
				}
			}

		}

		return tempoMedio;
	}

	public String tempoMedioDeAtendimentoPaciente() {
		NoLista aux = this.primeiro;
		int tempoConsulta = 0;
		int tempoSaida = 0;
		int cont = 0;
		int total = 0;
		int hora = 0;
		int minutos = 0;
		String tempoMedio = "00:00 HRs";

		// Caso a lista não esteja vazia
		if (primeiro != null) {
			// laço para percorrer a lista
			for (int i = 0; i < tamanho(); i++) {
				// Acumula o tempo em minutos ((Hora*60)+Minutos)
				tempoConsulta += (aux.getAtendimento().getHoraAtendimento() * 60)
						+ aux.getAtendimento().getMinutoAtendimento();
				tempoSaida += (aux.getAtendimento().getHoraSaida() * 60) + aux.getAtendimento().getMinutoSaida();
				cont++; // Incrementa acumulador
				aux = aux.getProximo(); // passa para o próximo nodo
			}

			// CASO A SAIDA SEJA NO DIA SEGUINTE
			if (tempoConsulta > tempoSaida) {
				total = (((24 * 60) - tempoConsulta) + tempoSaida) / cont;
				hora = total / 60;
				minutos = total % 60;

				if (hora < 0 || minutos < 0) {
					tempoMedio = "00:00 HRs";
				} else if (total < 60) {
					tempoMedio = Integer.toString(total) + " Min";
				} else {
					// Transforma o int hora e minutos em uma String
					String hr = Integer.toString(hora);
					String m = Integer.toString(minutos);

					if (hora < 10) {
						hr = "0" + Integer.toString(hora);
					}

					if (minutos < 10) {
						m = "0" + Integer.toString(minutos);
					}

					tempoMedio = hr + ":" + m + " HRs";
				}
			} else {
				// Faz o calculo da média de tempo ((Hora da consulta - Hora de Entrada)/total
				// de atendimentos na lista)
				total = (tempoSaida - tempoConsulta) / cont;
				hora = total / 60;
				minutos = total % 60;

				if (hora < 0 || minutos < 0) {
					tempoMedio = "00:00 HRs";
				} else if (total < 60) {
					tempoMedio = Integer.toString(total) + " Min";
				} else {
					// Transforma o int hora e minutos em uma String
					String hr = Integer.toString(hora);
					String m = Integer.toString(minutos);

					if (hora < 10) {
						hr = "0" + Integer.toString(hora);
					}

					if (minutos < 10) {
						m = "0" + Integer.toString(minutos);
					}

					tempoMedio = hr + ":" + m + " HRs";
				}
			}
		}
		return tempoMedio;
	}

	public String tempoMedioDeAtendimentoFila(int prioridade) {
		NoLista aux = this.primeiro;
		int tempoChegada = 0; // Acumulador para o tempo total da chegada
		int tempoSaida = 0; // Acumulador para o tempo total da saída
		int cont = 0; // Contador
		int total = 0;
		int hora = 0;
		int minutos = 0;
		String horas;
		String min;
		String tempoMedio = "00:00 HRs";

		// Caso a lista não esteja vazia
		if (primeiro != null) {

			// laço para percorrer a lista
			for (int i = 0; i < tamanho(); i++) {
				// VAI FAZER APENAS COM ATENDIMENTOS DE PRIORIDADE DETERMINADA
				if (aux.getAtendimento().getPrioridade() == prioridade) {
					if (aux.getAtendimento().getHoraSaida() == 0 && aux.getAtendimento().getMinutoSaida() == 0) {

					} else {
						// Acumula o tempo em minutos ((Hora*60)+Minutos)
						tempoChegada += (aux.getAtendimento().getHoraChegada() * 60)
								+ aux.getAtendimento().getMinutoChegada();
						tempoSaida += (aux.getAtendimento().getHoraSaida() * 60)
								+ aux.getAtendimento().getMinutoSaida();
						cont++; // Incrementa acumulador
					}
				}

				aux = aux.getProximo(); // passa para o próximo nodo
			}

			// Caso tenham sido contabilizados atendimentos com a prioridade definida:
			if (cont != 0) {

				// CASO A SAIDA SEJA NO DIA SEGUINTE
				if (tempoChegada > tempoSaida) {
					total = (((24 * 60) - tempoChegada) + tempoSaida) / cont;
					hora = total / 60;
					minutos = total % 60;

					// Transforma o int hora e minutos em uma String
					if (total < 60) {
						tempoMedio = Integer.toString(total) + " Min";
					} else {
						if (hora < 10) {

							horas = "0".concat(Integer.toString(hora));
						} else {
							horas = Integer.toString(hora);
						}

						if (minutos < 10) {
							min = "0".concat(Integer.toString(minutos));
						} else {
							min = Integer.toString(minutos);
						}

						tempoMedio = horas + ":" + min + " HRs";
					}
				} else {
					// Faz o calculo da média de tempo ((Hora da consulta - Hora de Entrada)/total
					// de atendimentos na lista)
					total = (tempoSaida - tempoChegada) / cont;
					hora = total / 60;
					minutos = total % 60;

					// Transforma o int hora e minutos em uma String
					if (total < 60) {
						tempoMedio = Integer.toString(total) + " Min";
					} else {
						if (hora < 10) {

							horas = "0".concat(Integer.toString(hora));
						} else {
							horas = Integer.toString(hora);
						}

						if (minutos < 10) {
							min = "0".concat(Integer.toString(minutos));
						} else {
							min = Integer.toString(minutos);
						}

						tempoMedio = horas + ":" + min + " HRs";
					}
				}

			}

		}

		return tempoMedio;
	}

	// Limpar lista
	public void limpar() {
		this.primeiro = null;
		this.ultimo = null;
	}

}