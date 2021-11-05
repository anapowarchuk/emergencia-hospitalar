package modelo;

public class Triagem {

	//Atributos da classe Triagem
	private double temperaturaCorporal;
	private boolean situacaoDeRisco;
	private boolean entubado;
	private boolean comApneia;
	private boolean semPulso;
	private boolean semReacao;
	private String situacao;
	private boolean dor;
	private boolean sofrimento;
	private boolean raioX;
	private boolean injecoes;
	private boolean testesLab;
	private boolean eg;
	private double frequenciaCardiaca;
	private double frequenciaRespiratoria;
	private double oximetriaDePulso;
	private double ipfr;
	private int qtdProcedimentos;
	
	//Construtor da classe Triagem
	public Triagem(double temperaturaCorporal, boolean situacaoDeRisco, boolean entubado, boolean comApneia,
			boolean semPulso, boolean semReacao, String situacao, boolean dor, boolean sofrimento, boolean raioX,
			boolean injecoes, boolean testesLab, boolean eg, double frequenciaCardiaca, double frequenciaRespiratoria,
			double oximetriaDePulso, double ipfr, int qtdProcedimentos) {
		super();
		this.temperaturaCorporal = temperaturaCorporal;
		this.situacaoDeRisco = situacaoDeRisco;
		this.entubado = entubado;
		this.comApneia = comApneia;
		this.semPulso = semPulso;
		this.semReacao = semReacao;
		this.situacao = situacao;
		this.dor = dor;
		this.sofrimento = sofrimento;
		this.raioX = raioX;
		this.injecoes = injecoes;
		this.testesLab = testesLab;
		this.eg = eg;
		this.frequenciaCardiaca = frequenciaCardiaca;
		this.frequenciaRespiratoria = frequenciaRespiratoria;
		this.oximetriaDePulso = oximetriaDePulso;
		this.ipfr = ipfr;
		this.qtdProcedimentos = qtdProcedimentos;
	}

	public double getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(double temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public boolean isSituacaoDeRisco() {
		return situacaoDeRisco;
	}

	public void setSituacaoDeRisco(boolean situacaoDeRisco) {
		this.situacaoDeRisco = situacaoDeRisco;
	}

	public boolean isEntubado() {
		return entubado;
	}

	public void setEntubado(boolean entubado) {
		this.entubado = entubado;
	}

	public boolean isComApneia() {
		return comApneia;
	}

	public void setComApneia(boolean comApneia) {
		this.comApneia = comApneia;
	}

	public boolean isSemPulso() {
		return semPulso;
	}

	public void setSemPulso(boolean semPulso) {
		this.semPulso = semPulso;
	}

	public boolean isSemReacao() {
		return semReacao;
	}

	public void setSemReacao(boolean semReacao) {
		this.semReacao = semReacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public boolean isDor() {
		return dor;
	}

	public void setDor(boolean dor) {
		this.dor = dor;
	}

	public boolean isSofrimento() {
		return sofrimento;
	}

	public void setSofrimento(boolean sofrimento) {
		this.sofrimento = sofrimento;
	}

	public boolean isRaioX() {
		return raioX;
	}

	public void setRaioX(boolean raioX) {
		this.raioX = raioX;
	}

	public boolean isInjecoes() {
		return injecoes;
	}

	public void setInjecoes(boolean injecoes) {
		this.injecoes = injecoes;
	}

	public boolean isTestesLab() {
		return testesLab;
	}

	public void setTestesLab(boolean testesLab) {
		this.testesLab = testesLab;
	}

	public boolean isEg() {
		return eg;
	}

	public void setEg(boolean eg) {
		this.eg = eg;
	}

	public double getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}

	public void setFrequenciaCardiaca(double frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}

	public double getFrequenciaRespiratoria() {
		return frequenciaRespiratoria;
	}

	public void setFrequenciaRespiratoria(double frequenciaRespiratoria) {
		this.frequenciaRespiratoria = frequenciaRespiratoria;
	}

	public double getOximetriaDePulso() {
		return oximetriaDePulso;
	}

	public void setOximetriaDePulso(double oximetriaDePulso) {
		this.oximetriaDePulso = oximetriaDePulso;
	}

	public double getIpfr() {
		return ipfr;
	}

	public void setIpfr(double ipfr) {
		this.ipfr = ipfr;
	}

	public int getQtdProcedimentos() {
		return qtdProcedimentos;
	}

	public void setQtdProcedimentos(int qtdProcedimentos) {
		this.qtdProcedimentos = qtdProcedimentos;
	}

}