package modelo;

import java.util.Random;

public class ListaPacientes {

	private NoLista primeiro;
	private NoLista ultimo;

	// Construtor da lista de pacientes
	public ListaPacientes() {
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

	// Adiciona o paciente e ordena alfabeticamente
	public void adicionar(Paciente pac) {
		if (estaVazia()) {
			NoLista novo = new NoLista(pac);
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			int cont = 0;
			for (NoLista aux = this.primeiro; aux != null; aux = aux.getProximo()) {
				int comp = pac.getNome().compareToIgnoreCase(aux.getPaciente().getNome());
				if (cont == 0) {
					if (comp < 0) {
						NoLista novo = new NoLista(aux.getAnterior(), pac, aux);
						if (aux.getAnterior() != null) {
							aux.getAnterior().setProximo(novo);
						}
						aux.setAnterior(novo);
						if (this.primeiro.equals(aux)) {
							this.primeiro = novo;
						}
						cont++;
					} else if (comp > 0) {

					}
					// se forem iguais adiciona antes igual
					else {
						NoLista novo = new NoLista(aux.getAnterior(), pac, aux);
						this.primeiro = novo;
						cont++;
					}
				}
			}
		}
	}

	// Remove um elemento em uma determinada posição
	public void removePosicao(int posicao) {
		NoLista aux = this.primeiro;

		if (posicao <= tamanho()) {
			if (posicao < 1) {
				System.out.println("Posição inexistente");
			} else if (posicao == 1) {
				this.primeiro = this.primeiro.getProximo();
			} else if (posicao > 1) {
				for (int i = 1; i < posicao; i++) {
					aux = aux.getProximo();
				}
				if (aux != this.ultimo) {
					aux.getAnterior().setProximo(aux.getProximo());
					aux.getProximo().setAnterior(aux.getAnterior());
				} else {
					this.ultimo = aux.getAnterior();
					aux.getAnterior().setProximo(aux.getProximo());
				}
			} else {
				System.out.println("Posição inexistente");
			}
		}
	}

	// Buscar um elemento pelo CPF do paciente
	public Paciente buscarCpf(String cpf) {
		NoLista aux = this.primeiro;
		Paciente elemento = null;
		while (true) {
			if (tamanho() == 0) {
				break;
			}
			if (cpf.equalsIgnoreCase(aux.getPaciente().getCpf())) {
				elemento = aux.getPaciente();
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

	// Imprimir a lista de paciente
	public String imprimirPacientes() {
		NoLista aux = this.primeiro;
		String impressao = null;

		if (tamanho() == 1) {
			impressao = "\nNome: " + aux.getPaciente().getNome() + "\nCPF: " + aux.getPaciente().getCpf()
					+ "\nData de Nascimento: " + aux.getPaciente().getDataNasc() + "\n---------------------------";

		} else if (this.primeiro != null) {
			while (aux != this.ultimo) {
				if (aux == this.primeiro) {
					impressao = "\nNome: " + aux.getPaciente().getNome() + "\nCPF: " + aux.getPaciente().getCpf()
							+ "\nData de Nascimento: " + aux.getPaciente().getDataNasc()
							+ "\n---------------------------";

					aux = aux.getProximo();

				} else {
					impressao = impressao.concat("\nNome: " + aux.getPaciente().getNome() + "\nCPF: "
							+ aux.getPaciente().getCpf() + "\nData de Nascimento: " + aux.getPaciente().getDataNasc()
							+ "\n---------------------------");
					aux = aux.getProximo();// Avança para o novo nodo
				}
			}
			impressao = impressao
					.concat("\nNome: " + aux.getPaciente().getNome() + "\nCPF: " + aux.getPaciente().getCpf()
							+ "\nData de Nascimento: " + aux.getPaciente().getDataNasc() + "\n--------------------");
		} else {
			impressao = "A Lista de Pacientes está vazia!";
		}

		// Retorna a String.
		return impressao;
	}

	// Limpar lista
	public void limpar() {
		this.primeiro = null;
		this.ultimo = null;
	}

}