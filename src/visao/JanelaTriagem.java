package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.Atendimento;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class JanelaTriagem extends Pai {

	private JPanel contentPane;

	private JTextField fieldNome;
	private JTextField fieldOximetria;
	private JTextField fieldTempCorporal;
	private JTextField fieldFrequenciaCardiaca;
	private JTextField fieldFluxoResp;
	private JTextField fieldFrequenciarRespiratoria;

	private JLabel labelSofrimentoAgudo;
	private JLabel labelFrequenciaRespiratria;
	private JLabel lblRpm;
	private JLabel labelPorcentagem;
	private JLabel lblDorAguda;
	private JLabel labelSitucaoDeAltoRisco;

	private JFormattedTextField fieldCPF;

	private ButtonGroup risco;
	private ButtonGroup situacao;
	private ButtonGroup dor;
	private ButtonGroup sofrimento;

	private JRadioButton rdbtnConfuso;
	JRadioButton rdbtnLetargico;
	private JRadioButton rdbtnSimDorAguda;
	private JRadioButton rdbtnNaoDorAguda;
	private JRadioButton rdbtnDesorientado;
	private JRadioButton rdbtnSofrimentoAgudoSim;
	private JRadioButton rdbtnSofrimentoAgudoNao;
	private JRadioButton rdbtnSituaçãoDeAltoRiscoSim;
	private JRadioButton rdbtnSituaçãoDeAltoRiscoNao;

	private JCheckBox chckbxEntubado;
	private JCheckBox chckbxComApneia;
	private JCheckBox chckbxSemPulso;
	private JCheckBox chckbxSemReao;

	private JCheckBox checkBoxRaioX;
	private JCheckBox checkBoxInjecoes;
	private JCheckBox checkBoxTesteLaboratoriais;
	private JCheckBox checkBoxEG;

	private JButton buttonFinalizarTriagem;
	private JRadioButton rdbtnConsciente;
	private JLabel lblInformaesDoPaciente;

	public JRadioButton getRdbtnConsciente() {
		return rdbtnConsciente;
	}

	public void setRdbtnConsciente(JRadioButton rdbtnConsciente) {
		this.rdbtnConsciente = rdbtnConsciente;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldOximetria() {
		return fieldOximetria;
	}

	public void setFieldOximetria(JTextField fieldOximetria) {
		this.fieldOximetria = fieldOximetria;
	}

	public JTextField getFieldTempCorporal() {
		return fieldTempCorporal;
	}

	public void setFieldTempCorporal(JTextField fieldTempCorporal) {
		this.fieldTempCorporal = fieldTempCorporal;
	}

	public JTextField getFieldFrequenciaCardiaca() {
		return fieldFrequenciaCardiaca;
	}

	public void setFieldFrequenciaCardiaca(JTextField fieldFrequenciaCardiaca) {
		this.fieldFrequenciaCardiaca = fieldFrequenciaCardiaca;
	}

	public JTextField getFieldFluxoResp() {
		return fieldFluxoResp;
	}

	public void setFieldFluxoResp(JTextField fieldFluxoResp) {
		this.fieldFluxoResp = fieldFluxoResp;
	}

	public JTextField getFieldFrequenciarRespiratoria() {
		return fieldFrequenciarRespiratoria;
	}

	public void setFieldFrequenciarRespiratoria(JTextField fieldFrequenciarRespiratoria) {
		this.fieldFrequenciarRespiratoria = fieldFrequenciarRespiratoria;
	}

	public JLabel getLabelSofrimentoAgudo() {
		return labelSofrimentoAgudo;
	}

	public void setLabelSofrimentoAgudo(JLabel labelSofrimentoAgudo) {
		this.labelSofrimentoAgudo = labelSofrimentoAgudo;
	}

	public JLabel getLabelFrequenciaRespiratria() {
		return labelFrequenciaRespiratria;
	}

	public void setLabelFrequenciaRespiratria(JLabel labelFrequenciaRespiratria) {
		this.labelFrequenciaRespiratria = labelFrequenciaRespiratria;
	}

	public JLabel getLblRpm() {
		return lblRpm;
	}

	public void setLblRpm(JLabel lblRpm) {
		this.lblRpm = lblRpm;
	}

	public JLabel getLabelPorcentagem() {
		return labelPorcentagem;
	}

	public void setLabelPorcentagem(JLabel labelPorcentagem) {
		this.labelPorcentagem = labelPorcentagem;
	}

	public JLabel getLblDorAguda() {
		return lblDorAguda;
	}

	public void setLblDorAguda(JLabel lblDorAguda) {
		this.lblDorAguda = lblDorAguda;
	}

	public JLabel getLabelSitucaoDeAltoRisco() {
		return labelSitucaoDeAltoRisco;
	}

	public void setLabelSitucaoDeAltoRisco(JLabel labelSitucaoDeAltoRisco) {
		this.labelSitucaoDeAltoRisco = labelSitucaoDeAltoRisco;
	}

	public JFormattedTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JFormattedTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public ButtonGroup getRisco() {
		return risco;
	}

	public void setRisco(ButtonGroup risco) {
		this.risco = risco;
	}

	public ButtonGroup getSituacao() {
		return situacao;
	}

	public void setSituacao(ButtonGroup situacao) {
		this.situacao = situacao;
	}

	public ButtonGroup getDor() {
		return dor;
	}

	public void setDor(ButtonGroup dor) {
		this.dor = dor;
	}

	public ButtonGroup getSofrimento() {
		return sofrimento;
	}

	public void setSofrimento(ButtonGroup sofrimento) {
		this.sofrimento = sofrimento;
	}

	public JRadioButton getRdbtnConfuso() {
		return rdbtnConfuso;
	}

	public void setRdbtnConfuso(JRadioButton rdbtnConfuso) {
		this.rdbtnConfuso = rdbtnConfuso;
	}

	public JRadioButton getRdbtnLetargico() {
		return rdbtnLetargico;
	}

	public void setRdbtnLetargico(JRadioButton rdbtnLetargico) {
		this.rdbtnLetargico = rdbtnLetargico;
	}

	public JRadioButton getRdbtnSimDorAguda() {
		return rdbtnSimDorAguda;
	}

	public void setRdbtnSimDorAguda(JRadioButton rdbtnSimDorAguda) {
		this.rdbtnSimDorAguda = rdbtnSimDorAguda;
	}

	public JRadioButton getRdbtnNaoDorAguda() {
		return rdbtnNaoDorAguda;
	}

	public void setRdbtnNaoDorAguda(JRadioButton rdbtnNaoDorAguda) {
		this.rdbtnNaoDorAguda = rdbtnNaoDorAguda;
	}

	public JRadioButton getRdbtnDesorientado() {
		return rdbtnDesorientado;
	}

	public void setRdbtnDesorientado(JRadioButton rdbtnDesorientado) {
		this.rdbtnDesorientado = rdbtnDesorientado;
	}

	public JRadioButton getRdbtnSofrimentoAgudoSim() {
		return rdbtnSofrimentoAgudoSim;
	}

	public void setRdbtnSofrimentoAgudoSim(JRadioButton rdbtnSofrimentoAgudoSim) {
		this.rdbtnSofrimentoAgudoSim = rdbtnSofrimentoAgudoSim;
	}

	public JRadioButton getRdbtnSofrimentoAgudoNao() {
		return rdbtnSofrimentoAgudoNao;
	}

	public void setRdbtnSofrimentoAgudoNao(JRadioButton rdbtnSofrimentoAgudoNao) {
		this.rdbtnSofrimentoAgudoNao = rdbtnSofrimentoAgudoNao;
	}

	public JRadioButton getRdbtnSituaçãoDeAltoRiscoSim() {
		return rdbtnSituaçãoDeAltoRiscoSim;
	}

	public void setRdbtnSituaçãoDeAltoRiscoSim(JRadioButton rdbtnSituaçãoDeAltoRiscoSim) {
		this.rdbtnSituaçãoDeAltoRiscoSim = rdbtnSituaçãoDeAltoRiscoSim;
	}

	public JRadioButton getRdbtnSituaçãoDeAltoRiscoNao() {
		return rdbtnSituaçãoDeAltoRiscoNao;
	}

	public void setRdbtnSituaçãoDeAltoRiscoNao(JRadioButton rdbtnSituaçãoDeAltoRiscoNao) {
		this.rdbtnSituaçãoDeAltoRiscoNao = rdbtnSituaçãoDeAltoRiscoNao;
	}

	public JCheckBox getChckbxEntubado() {
		return chckbxEntubado;
	}

	public void setChckbxEntubado(JCheckBox chckbxEntubado) {
		this.chckbxEntubado = chckbxEntubado;
	}

	public JCheckBox getChckbxComApneia() {
		return chckbxComApneia;
	}

	public void setChckbxComApneia(JCheckBox chckbxComApneia) {
		this.chckbxComApneia = chckbxComApneia;
	}

	public JCheckBox getChckbxSemPulso() {
		return chckbxSemPulso;
	}

	public void setChckbxSemPulso(JCheckBox chckbxSemPulso) {
		this.chckbxSemPulso = chckbxSemPulso;
	}

	public JCheckBox getChckbxSemReao() {
		return chckbxSemReao;
	}

	public void setChckbxSemReao(JCheckBox chckbxSemReao) {
		this.chckbxSemReao = chckbxSemReao;
	}

	public JCheckBox getCheckBoxRaioX() {
		return checkBoxRaioX;
	}

	public void setCheckBoxRaioX(JCheckBox checkBoxRaioX) {
		this.checkBoxRaioX = checkBoxRaioX;
	}

	public JCheckBox getCheckBoxInjecoes() {
		return checkBoxInjecoes;
	}

	public void setCheckBoxInjecoes(JCheckBox checkBoxInjecoes) {
		this.checkBoxInjecoes = checkBoxInjecoes;
	}

	public JCheckBox getCheckBoxTesteLaboratoriais() {
		return checkBoxTesteLaboratoriais;
	}

	public void setCheckBoxTesteLaboratoriais(JCheckBox checkBoxTesteLaboratoriais) {
		this.checkBoxTesteLaboratoriais = checkBoxTesteLaboratoriais;
	}

	public JCheckBox getCheckBoxEG() {
		return checkBoxEG;
	}

	public void setCheckBoxEG(JCheckBox checkBoxEG) {
		this.checkBoxEG = checkBoxEG;
	}

	public JButton getButtonFinalizarTriagem() {
		return buttonFinalizarTriagem;
	}

	public void setButtonFinalizarTriagem(JButton buttonFinalizarTriagem) {
		this.buttonFinalizarTriagem = buttonFinalizarTriagem;
	}

	public void limparTriagem() {
		fieldCPF.setText("");
		fieldFluxoResp.setText("");
		fieldFrequenciaCardiaca.setText("");
		fieldFrequenciarRespiratoria.setText("");
		fieldNome.setText("");
		fieldOximetria.setText("");
		fieldTempCorporal.setText("");
		chckbxComApneia.setSelected(false);
		chckbxEntubado.setSelected(false);
		chckbxSemPulso.setSelected(false);
		chckbxSemReao.setSelected(false);
		checkBoxEG.setSelected(false);
		checkBoxInjecoes.setSelected(false);
		checkBoxRaioX.setSelected(false);
		checkBoxTesteLaboratoriais.setSelected(false);
		situacao.clearSelection();
		risco.clearSelection();
		dor.clearSelection();
		sofrimento.clearSelection();
	}

	public JanelaTriagem(Atendimento a1) {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setToolTipText("TRIAGEM");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelTriagem1 = new JLabel("TRIAGEM");
		labelTriagem1.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelTriagem1);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow]", "[][][][]12[][][]12[]6[]12[]6[]6[]6[]6[]12[]6[]12[][grow]"));

		risco = new ButtonGroup();
		situacao = new ButtonGroup();
		dor = new ButtonGroup();
		sofrimento = new ButtonGroup();

		lblInformaesDoPaciente = new JLabel("INFORMA\u00C7\u00D5ES DO PACIENTE");
		lblInformaesDoPaciente.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(lblInformaesDoPaciente, "cell 0 0 2 0,alignx center");

		JLabel labelNome = new JLabel("Nome ");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelNome, "flowx,cell 0 1 5 0,alignx center");

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setEditable(false);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldNome, "cell 0 1 5 0,alignx center");
		fieldNome.setColumns(15);

		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCPF, "flowx,cell 0 1 5 0,alignx left");

		JLabel labelTriagem = new JLabel("TRIAGEM");
		labelTriagem.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelTriagem, "cell 0 3 5 0,alignx center");

		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(lblSituao, "flowy,cell 0 4,alignx left");

		chckbxEntubado = new JCheckBox("Entubado");
		chckbxEntubado.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(chckbxEntubado, "flowx,cell 0 5 2 0,alignx left");

		rdbtnConfuso = new JRadioButton("Confuso");
		situacao.add(rdbtnConfuso);
		rdbtnConfuso.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnConfuso, "flowx,cell 0 6 2 0,alignx left");

		lblDorAguda = new JLabel("Dor Aguda");
		lblDorAguda.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(lblDorAguda, "flowx,cell 0 7 2 0,alignx left");

		rdbtnSimDorAguda = new JRadioButton("Sim");
		rdbtnSimDorAguda.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		dor.add(rdbtnSimDorAguda);
		panel2.add(rdbtnSimDorAguda, "flowx,cell 0 7");

		labelSofrimentoAgudo = new JLabel("Sofrimento Agudo");
		labelSofrimentoAgudo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelSofrimentoAgudo, "flowx,cell 0 8 2 0,alignx left");

		JLabel labelTempCorporal = new JLabel("Temperatura Corporal");
		labelTempCorporal.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelTempCorporal, "flowx,cell 0 9,alignx left");

		fieldTempCorporal = new JTextField();
		fieldTempCorporal.setBackground(Color.WHITE);
		fieldTempCorporal.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldTempCorporal.setColumns(3);
		panel2.add(fieldTempCorporal, "flowx,cell 1 9,alignx left");

		JLabel labelFrequnciaCardiaca = new JLabel("Frequ\u00EAncia Cardiaca");
		labelFrequnciaCardiaca.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFrequnciaCardiaca, "flowx,cell 0 10,alignx left");

		fieldFrequenciaCardiaca = new JTextField();
		fieldFrequenciaCardiaca.setBackground(Color.WHITE);
		fieldFrequenciaCardiaca.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		fieldFrequenciaCardiaca.setColumns(3);
		panel2.add(fieldFrequenciaCardiaca, "flowx,cell 1 10,alignx left");

		labelFrequenciaRespiratria = new JLabel("Frequ\u00EAncia Respirat\u00F3ria");
		labelFrequenciaRespiratria.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFrequenciaRespiratria, "flowx,cell 0 11,alignx right");

		fieldFrequenciarRespiratoria = new JTextField();
		fieldFrequenciarRespiratoria.setBackground(Color.WHITE);
		fieldFrequenciarRespiratoria.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		fieldFrequenciarRespiratoria.setColumns(3);
		panel2.add(fieldFrequenciarRespiratoria, "flowx,cell 1 11");

		JLabel labelOximetria = new JLabel("Oximetria do Pulso");
		labelOximetria.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelOximetria, "flowx,cell 0 12,growx");

		fieldOximetria = new JTextField();
		fieldOximetria.setBackground(Color.WHITE);
		fieldOximetria.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(fieldOximetria, "flowx,cell 1 12,alignx left");
		fieldOximetria.setColumns(3);

		JLabel labelFluxoRespiratorio = new JLabel("Fluxo Respirat\u00F3rio");
		labelFluxoRespiratorio.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFluxoRespiratorio, "flowx,cell 0 13,alignx left");

		fieldFluxoResp = new JTextField();
		fieldFluxoResp.setBackground(Color.WHITE);
		fieldFluxoResp.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		fieldFluxoResp.setColumns(3);
		panel2.add(fieldFluxoResp, "flowx,cell 1 13,alignx left");

		JLabel labelOutrosProcedimentos = new JLabel("Outros Procedimentos");
		labelOutrosProcedimentos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelOutrosProcedimentos, "flowx,cell 0 14 2 0");

		checkBoxRaioX = new JCheckBox("Raio X");
		checkBoxRaioX.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(checkBoxRaioX, "flowx,cell 0 15 2 0,alignx left");

		labelSitucaoDeAltoRisco = new JLabel("Situa\u00E7\u00E3o de Alto Risco");
		labelSitucaoDeAltoRisco.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelSitucaoDeAltoRisco, "flowx,cell 0 16 2 0");

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setEditable(false);
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		fieldCPF.setActionCommand("cpf");
		panel2.add(fieldCPF, "cell 0 1 5 0,alignx center");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(10);

		chckbxComApneia = new JCheckBox("Com Apneia");
		chckbxComApneia.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(chckbxComApneia, "cell 0 5 2 0,alignx center");

		chckbxSemPulso = new JCheckBox("Sem Pulso");
		chckbxSemPulso.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(chckbxSemPulso, "cell 0 5 2 0,alignx left");

		chckbxSemReao = new JCheckBox("Sem Rea\u00E7\u00E3o");
		chckbxSemReao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(chckbxSemReao, "cell 0 5 2 0,alignx left");

		rdbtnDesorientado = new JRadioButton("Desorientado");
		situacao.add(rdbtnDesorientado);
		rdbtnDesorientado.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnDesorientado, "cell 0 6 2 0");

		rdbtnLetargico = new JRadioButton("Letargico");
		situacao.add(rdbtnLetargico);
		rdbtnLetargico.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnLetargico, "cell 0 6 2 0");

		rdbtnConsciente = new JRadioButton("Consciente");
		situacao.add(rdbtnConsciente);
		rdbtnConsciente.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnConsciente, "cell 0 6 2 0,alignx left");

		checkBoxInjecoes = new JCheckBox("Inje\u00E7\u00F5es");
		checkBoxInjecoes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(checkBoxInjecoes, "cell 0 15 2 0");

		checkBoxTesteLaboratoriais = new JCheckBox("Teste Laboratoriais");
		checkBoxTesteLaboratoriais.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(checkBoxTesteLaboratoriais, "cell 0 15 2 0");

		checkBoxEG = new JCheckBox("E.G");
		checkBoxEG.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(checkBoxEG, "cell 0 15 2 0");

		rdbtnSituaçãoDeAltoRiscoSim = new JRadioButton("Sim");
		rdbtnSituaçãoDeAltoRiscoSim.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		risco.add(rdbtnSituaçãoDeAltoRiscoSim);
		panel2.add(rdbtnSituaçãoDeAltoRiscoSim, "cell 0 16 2 0");

		rdbtnSituaçãoDeAltoRiscoNao = new JRadioButton("N\u00E3o");
		risco.add(rdbtnSituaçãoDeAltoRiscoNao);
		rdbtnSituaçãoDeAltoRiscoNao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnSituaçãoDeAltoRiscoNao, "cell 0 16 2 0");

		buttonFinalizarTriagem = new JButton("Finalizar Triagem");
		buttonFinalizarTriagem.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		buttonFinalizarTriagem.setBackground(new Color(244, 164, 96));
		buttonFinalizarTriagem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonFinalizarTriagem, "cell 0 17 2 0,alignx center");

		JLabel labelGrausCelsius = new JLabel(" \u00BAC   ");
		labelGrausCelsius.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelGrausCelsius, "cell 1 9");

		JLabel labelBpm = new JLabel("bpm");
		labelBpm.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelBpm, "cell 1 10");

		lblRpm = new JLabel("rpm");
		lblRpm.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(lblRpm, "cell 1 11");

		labelPorcentagem = new JLabel(" %   ");
		panel2.add(labelPorcentagem, "cell 1 12");

		JLabel lblLmin = new JLabel("l/min");
		panel2.add(lblLmin, "cell 1 13,alignx left");

		rdbtnNaoDorAguda = new JRadioButton("N\u00E3o");
		dor.add(rdbtnNaoDorAguda);
		rdbtnNaoDorAguda.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnNaoDorAguda, "cell 0 7 2 0");

		rdbtnSofrimentoAgudoSim = new JRadioButton("Sim");
		rdbtnSofrimentoAgudoSim.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		sofrimento.add(rdbtnSofrimentoAgudoSim);
		panel2.add(rdbtnSofrimentoAgudoSim, "cell 0 8 2 0");

		rdbtnSofrimentoAgudoNao = new JRadioButton("N\u00E3o");
		sofrimento.add(rdbtnSofrimentoAgudoNao);
		rdbtnSofrimentoAgudoNao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(rdbtnSofrimentoAgudoNao, "flowx,cell 0 8 2 0,alignx left,aligny bottom");

		this.setLocationRelativeTo(null);
		setResizable(true);

	}

}