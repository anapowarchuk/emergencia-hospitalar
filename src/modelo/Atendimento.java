package modelo;

public class Atendimento {

	//Atributos da classe Atendimento
	private int senha;
	private Paciente paciente;
	private Triagem triagem;
	private int horaChegada;
	private int minutoChegada;
	private int horaAtendimento;
	private int minutoAtendimento;
	private int horaSaida;
	private int minutoSaida;
	private int prioridade;
	private String parecer;

	//Construtor vazio da classe Atendimento
	public Atendimento() {
		super();
	}

	//Construtor da classe Atendimento
	public Atendimento(Paciente paciente, Triagem triagem, int horaChegada, int minutoChegada, int horaAtendimento,
			int minutoAtendimento, int horaSaida, int minutoSaida, int prioridade, String parecer) {
		super();
		this.paciente = paciente;
		this.triagem = triagem;
		this.horaChegada = horaChegada;
		this.minutoChegada = minutoChegada;
		this.horaAtendimento = horaAtendimento;
		this.minutoAtendimento = minutoAtendimento;
		this.horaSaida = horaSaida;
		this.minutoSaida = minutoSaida;
		this.prioridade = prioridade;
		this.parecer = parecer;
	}

	//Construtor da classe Atendimento
	public Atendimento(int senha, Paciente paciente, int horaChegada, int minutoChegada) {
		this.senha = senha;
		this.paciente = paciente;
		this.horaChegada = horaChegada;
		this.minutoChegada = minutoChegada;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Triagem getTriagem() {
		return triagem;
	}

	public void setTriagem(Triagem triagem) {
		this.triagem = triagem;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}

	public int getMinutoChegada() {
		return minutoChegada;
	}

	public void setMinutoChegada(int minutoChegada) {
		this.minutoChegada = minutoChegada;
	}

	public int getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(int horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public int getMinutoAtendimento() {
		return minutoAtendimento;
	}

	public void setMinutoAtendimento(int minutoAtendimento) {
		this.minutoAtendimento = minutoAtendimento;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getMinutoSaida() {
		return minutoSaida;
	}

	public void setMinutoSaida(int minutoSaida) {
		this.minutoSaida = minutoSaida;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	//Método que imprime atendimento
	public String ImprimeAtendimento() {
		return "\n--- Informações do paciente ---" + "\nNome: " + paciente.getNome() + "\nCPF: " + paciente.getCpf()
				+ "\nAno Nascimento: " + paciente.getDataNasc() + "\n--- ATENDIMENTO ---" + "\nSenha: " + this.senha 
				+ "\nHora Chegada: " + this.horaChegada + ":" + this.minutoChegada + "\nHora Atendimento: "
				+ this.horaAtendimento + ":" + this.minutoAtendimento + "\nHora Saída: " + this.horaSaida + ":"
				+ this.minutoSaida + "\nPrioridade: " + this.prioridade + "\nParecer: " + this.parecer;

	}
}