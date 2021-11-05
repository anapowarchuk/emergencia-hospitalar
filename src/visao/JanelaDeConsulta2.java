package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.Atendimento;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JanelaDeConsulta2 extends Pai {

	private JPanel contentPane;
	private JTextField fieldPaciente;
	private JFormattedTextField fieldCPF;
	private JTextField fieldPrioridade;
	private JTextField fieldHoraAtendimento;
	private JTextField fieldMinutos;
	private JTextArea textAreaParecerMedico;
	private JButton btnFinalizarConsulta;
	private JTextField fieldSituacao;
	private JTextField fieldEntubado;
	private JTextField fieldComApneia;
	private JTextField fieldSemPulso;
	private JTextField fieldSemReacao;
	private JTextField fieldDorAguda;
	private JTextField fieldSofrimentoAgudo;
	private JTextField fieldAltoRisco;
	private JTextField fieldTemperaturaCorporal;
	private JTextField fieldFreqCard;
	private JTextField fieldFreqResp;
	private JTextField fieldOximetria;
	private JTextField fieldFluxoResp;
	private JTextField fieldRaioX;
	private JTextField fieldInjecoes;
	private JTextField fieldTL;
	private JTextField fieldEg;

	public JTextField getFieldPaciente() {
		return fieldPaciente;
	}

	public void setFieldPaciente(JTextField fieldPaciente) {
		this.fieldPaciente = fieldPaciente;
	}

	public JFormattedTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JFormattedTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldPrioridade() {
		return fieldPrioridade;
	}

	public void setFieldPrioridade(JTextField fieldPrioridade) {
		this.fieldPrioridade = fieldPrioridade;
	}

	public JTextField getFieldHoraAtendimento() {
		return fieldHoraAtendimento;
	}

	public void setFieldHoraAtendimento(JTextField fieldHoraAtendimento) {
		this.fieldHoraAtendimento = fieldHoraAtendimento;
	}

	public JTextField getFieldMinutos() {
		return fieldMinutos;
	}

	public void setFieldMinutos(JTextField fieldMinutos) {
		this.fieldMinutos = fieldMinutos;
	}

	public JTextArea getTextAreaParecerMedico() {
		return textAreaParecerMedico;
	}

	public void setTextAreaParecerMedico(JTextArea textAreaParecerMedico) {
		this.textAreaParecerMedico = textAreaParecerMedico;
	}

	public JButton getBtnFinalizarConsulta() {
		return btnFinalizarConsulta;
	}

	public void setBtnFinalizarConsulta(JButton btnFinalizarConsulta) {
		this.btnFinalizarConsulta = btnFinalizarConsulta;
	}

	public JTextField getFieldSituacao() {
		return fieldSituacao;
	}

	public void setFieldSituacao(JTextField fieldSituacao) {
		this.fieldSituacao = fieldSituacao;
	}

	public JTextField getFieldEntubado() {
		return fieldEntubado;
	}

	public void setFieldEntubado(JTextField fieldEntubado) {
		this.fieldEntubado = fieldEntubado;
	}

	public JTextField getFieldComApneia() {
		return fieldComApneia;
	}

	public void setFieldComApneia(JTextField fieldComApneia) {
		this.fieldComApneia = fieldComApneia;
	}

	public JTextField getFieldSemPulso() {
		return fieldSemPulso;
	}

	public void setFieldSemPulso(JTextField fieldSemPulso) {
		this.fieldSemPulso = fieldSemPulso;
	}

	public JTextField getFieldSemReacao() {
		return fieldSemReacao;
	}

	public void setFieldSemReacao(JTextField fieldSemReacao) {
		this.fieldSemReacao = fieldSemReacao;
	}

	public JTextField getFieldDorAguda() {
		return fieldDorAguda;
	}

	public void setFieldDorAguda(JTextField fieldDorAguda) {
		this.fieldDorAguda = fieldDorAguda;
	}

	public JTextField getFieldSofrimentoAgudo() {
		return fieldSofrimentoAgudo;
	}

	public void setFieldSofrimentoAgudo(JTextField fieldSofrimentoAgudo) {
		this.fieldSofrimentoAgudo = fieldSofrimentoAgudo;
	}

	public JTextField getFieldAltoRisco() {
		return fieldAltoRisco;
	}

	public void setFieldAltoRisco(JTextField fieldAltoRisco) {
		this.fieldAltoRisco = fieldAltoRisco;
	}

	public JTextField getFieldTemperaturaCorporal() {
		return fieldTemperaturaCorporal;
	}

	public void setFieldTemperaturaCorporal(JTextField fieldTemperaturaCorporal) {
		this.fieldTemperaturaCorporal = fieldTemperaturaCorporal;
	}

	public JTextField getFieldFreqCard() {
		return fieldFreqCard;
	}

	public void setFieldFreqCard(JTextField fieldFreqCard) {
		this.fieldFreqCard = fieldFreqCard;
	}

	public JTextField getFieldFreqResp() {
		return fieldFreqResp;
	}

	public void setFieldFreqResp(JTextField fieldFreqResp) {
		this.fieldFreqResp = fieldFreqResp;
	}

	public JTextField getFieldOximetria() {
		return fieldOximetria;
	}

	public void setFieldOximetria(JTextField fieldOximetria) {
		this.fieldOximetria = fieldOximetria;
	}

	public JTextField getFieldFluxoResp() {
		return fieldFluxoResp;
	}

	public void setFieldFluxoResp(JTextField fieldFluxoResp) {
		this.fieldFluxoResp = fieldFluxoResp;
	}

	public JTextField getFieldRaioX() {
		return fieldRaioX;
	}

	public void setFieldRaioX(JTextField fieldRaioX) {
		this.fieldRaioX = fieldRaioX;
	}

	public JTextField getFieldInjecoes() {
		return fieldInjecoes;
	}

	public void setFieldInjecoes(JTextField fieldInjecoes) {
		this.fieldInjecoes = fieldInjecoes;
	}

	public JTextField getFieldTL() {
		return fieldTL;
	}

	public void setFieldTL(JTextField fieldTL) {
		this.fieldTL = fieldTL;
	}

	public JTextField getFieldEg() {
		return fieldEg;
	}

	public void setFieldEg(JTextField fieldEg) {
		this.fieldEg = fieldEg;
	}

	public void limparConsulta() {
		fieldPaciente.setText("");
		fieldCPF.setText("");
		fieldPrioridade.setText("");
		fieldPrioridade.setBackground(Color.white);
		fieldHoraAtendimento.setText("");
		fieldMinutos.setText("");
		textAreaParecerMedico.setText("");
		fieldAltoRisco.setText("");
		fieldComApneia.setText("");
		fieldDorAguda.setText("");
		fieldEntubado.setText("");
		fieldFluxoResp.setText("");
		fieldFreqCard.setText("");
		fieldFreqResp.setText("");
		fieldInjecoes.setText("");
		fieldOximetria.setText("");
		fieldRaioX.setText("");
		fieldSemPulso.setText("");
		fieldSemReacao.setText("");
		fieldSituacao.setText("");
		fieldSofrimentoAgudo.setText("");
		fieldTemperaturaCorporal.setText("");
		fieldTL.setText("");
	}

	public JanelaDeConsulta2(Atendimento a1) {
		setTitle("CONSULTA");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		//this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 860, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelEmergenciaHospitalar = new JLabel("EMERG\u00CANCIA HOSPITALAR");
		labelEmergenciaHospitalar.setFont(new Font("Century Gothic", Font.BOLD, 20));
		panel1.add(labelEmergenciaHospitalar);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow]", "[]6[]6[]25[]6[]6[]6[]6[]6[]10[]25[]6[grow][grow][grow][]"));

		JLabel label = new JLabel("INFORMA\u00C7\u00D5ES DO PACIENTE");
		label.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(label, "cell 1 0 5 0,alignx center");

		JLabel labelPaciente = new JLabel("Nome");
		labelPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelPaciente, "flowx,cell 1 1 5 0,alignx center");

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel lblHorrioDeAtendimento = new JLabel("Hor\u00E1rio de Atendimento");
		lblHorrioDeAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(lblHorrioDeAtendimento, "flowx,cell 1 2 5 0,alignx center");

		fieldHoraAtendimento = new JTextField();
		fieldHoraAtendimento.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldHoraAtendimento.setBackground(Color.WHITE);
		fieldHoraAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldHoraAtendimento, "cell 1 2 5 0,alignx left");
		fieldHoraAtendimento.setColumns(3);

		JLabel labelHora = new JLabel("h");
		labelHora.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelHora, "cell 1 2 5 0,alignx left");

		fieldMinutos = new JTextField();
		fieldMinutos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldMinutos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldMinutos.setBackground(Color.WHITE);
		panel2.add(fieldMinutos, "cell 1 2 5 0,alignx left");
		fieldMinutos.setColumns(3);

		JLabel lblMin = new JLabel("min");
		lblMin.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(lblMin, "cell 1 2 5 0");

		fieldPaciente = new JTextField();
		fieldPaciente.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldPaciente.setBackground(Color.WHITE);
		fieldPaciente.setEditable(false);
		fieldPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldPaciente, "cell 1 1 5 0,alignx left");
		fieldPaciente.setColumns(20);

		JLabel labelRelatorio = new JLabel("RELAT\u00D3RIO DE TRIAGEM");
		labelRelatorio.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelRelatorio, "cell 1 3 5 0,alignx center");

		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCpf, "cell 1 1 5 0,alignx right");
		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setEditable(false);
		panel2.add(fieldCPF, "cell 1 1 5 0,alignx right");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(12);

		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(lblPrioridade, "cell 1 2 5 0,alignx right");

		fieldPrioridade = new JTextField();
		fieldPrioridade.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldPrioridade.setBackground(Color.WHITE);
		fieldPrioridade.setEditable(false);
		fieldPrioridade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldPrioridade, "cell 1 2 5 0,alignx left");
		fieldPrioridade.setColumns(12);

		JLabel labelSituacao = new JLabel("Situa\u00E7\u00E3o");
		labelSituacao.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelSituacao, "flowx,cell 1 4,alignx right");

		JLabel labelDorAguda = new JLabel("Dor aguda");
		labelDorAguda.setHorizontalAlignment(SwingConstants.LEFT);
		labelDorAguda.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelDorAguda, "flowx,cell 2 4,alignx right");

		JLabel labelTemperaturaCorporal = new JLabel("Temperatura Corporal");
		labelTemperaturaCorporal.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelTemperaturaCorporal, "cell 3 4,alignx trailing");
		
				fieldTemperaturaCorporal = new JTextField();
				fieldTemperaturaCorporal.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				fieldTemperaturaCorporal.setEditable(false);
				fieldTemperaturaCorporal.setColumns(3);
				fieldTemperaturaCorporal.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldTemperaturaCorporal.setBackground(Color.WHITE);
				panel2.add(fieldTemperaturaCorporal, "flowx,cell 4 4,alignx left");

		JLabel labelEntubado = new JLabel("Entubado");
		labelEntubado.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelEntubado, "flowx,cell 1 5,alignx right");

		JLabel labelFreqCard = new JLabel("Frequ\u00EAncia Cardiaca");
		labelFreqCard.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFreqCard, "cell 3 5,alignx trailing");
		
				fieldFreqCard = new JTextField();
				fieldFreqCard.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				fieldFreqCard.setEditable(false);
				fieldFreqCard.setColumns(3);
				fieldFreqCard.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldFreqCard.setBackground(Color.WHITE);
				panel2.add(fieldFreqCard, "flowx,cell 4 5,alignx left");

		JLabel labelComApeneia = new JLabel("Com apneia");
		labelComApeneia.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelComApeneia, "flowx,cell 1 6,alignx right");

		JLabel labelSofrimentoAgudo = new JLabel("Sofrimento agudo");
		labelSofrimentoAgudo.setHorizontalAlignment(SwingConstants.CENTER);
		labelSofrimentoAgudo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelSofrimentoAgudo, "flowx,cell 2 6,alignx right");

		JLabel labelFreqResp = new JLabel("Frequ\u00EAncia Respirat\u00F3ria");
		labelFreqResp.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFreqResp, "cell 3 6,alignx trailing");
		
				fieldFreqResp = new JTextField();
				fieldFreqResp.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				fieldFreqResp.setEditable(false);
				fieldFreqResp.setColumns(3);
				fieldFreqResp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldFreqResp.setBackground(Color.WHITE);
				panel2.add(fieldFreqResp, "flowx,cell 4 6,alignx left");

		JLabel labelSemPulso = new JLabel("Sem pulso");
		labelSemPulso.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelSemPulso, "flowx,cell 1 7,alignx right");

		JLabel labelOximetria = new JLabel("Oximetria do Pulso");
		labelOximetria.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelOximetria, "cell 3 7,alignx trailing");
		
				fieldOximetria = new JTextField();
				fieldOximetria.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				fieldOximetria.setEditable(false);
				fieldOximetria.setColumns(3);
				fieldOximetria.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldOximetria.setBackground(Color.WHITE);
				panel2.add(fieldOximetria, "flowx,cell 4 7,alignx left");

		JLabel labelSemReacao = new JLabel("Sem rea\u00E7\u00E3o");
		labelSemReacao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelSemReacao, "flowx,cell 1 8,alignx right");

		JLabel labelAltoRisco = new JLabel("Alto Risco");
		labelAltoRisco.setHorizontalAlignment(SwingConstants.CENTER);
		labelAltoRisco.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelAltoRisco, "flowx,cell 2 8,alignx right");

		JLabel labelFluxoResp = new JLabel("Fluxo Respirat\u00F3rio");
		labelFluxoResp.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(labelFluxoResp, "cell 3 8,alignx trailing");
		
				fieldFluxoResp = new JTextField();
				fieldFluxoResp.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				fieldFluxoResp.setEditable(false);
				fieldFluxoResp.setColumns(3);
				fieldFluxoResp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldFluxoResp.setBackground(Color.WHITE);
				panel2.add(fieldFluxoResp, "flowx,cell 4 8,alignx left");

		JLabel label_1 = new JLabel("Outros Procedimentos");
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(label_1, "cell 1 9 5 0,alignx center");

		JLabel labelRaioX = new JLabel("     RaioX");
		labelRaioX.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelRaioX, "flowx,cell 1 9 5 0,alignx center");

		JLabel lblParecerMdico = new JLabel("PARECER M\u00C9DICO");
		lblParecerMdico.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(lblParecerMdico, "cell 1 10 5 0,alignx center,aligny bottom");

		JScrollPane scrollPane = new JScrollPane();
		panel2.add(scrollPane, "cell 1 11 4 3,grow");

		textAreaParecerMedico = new JTextArea();
		textAreaParecerMedico.setBackground(Color.WHITE);
		scrollPane.setViewportView(textAreaParecerMedico);
		textAreaParecerMedico.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		fieldSituacao = new JTextField();
		fieldSituacao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldSituacao.setEditable(false);
		fieldSituacao.setColumns(10);
		fieldSituacao.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldSituacao.setBackground(Color.WHITE);
		panel2.add(fieldSituacao, "cell 1 4");

		fieldEntubado = new JTextField();
		fieldEntubado.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldEntubado.setEditable(false);
		fieldEntubado.setColumns(5);
		fieldEntubado.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldEntubado.setBackground(Color.WHITE);
		panel2.add(fieldEntubado, "cell 1 5");

		fieldComApneia = new JTextField();
		fieldComApneia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldComApneia.setEditable(false);
		fieldComApneia.setColumns(5);
		fieldComApneia.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldComApneia.setBackground(Color.WHITE);
		panel2.add(fieldComApneia, "cell 1 6");

		fieldSemPulso = new JTextField();
		fieldSemPulso.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldSemPulso.setEditable(false);
		fieldSemPulso.setColumns(5);
		fieldSemPulso.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldSemPulso.setBackground(Color.WHITE);
		panel2.add(fieldSemPulso, "cell 1 7");

		fieldSemReacao = new JTextField();
		fieldSemReacao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldSemReacao.setEditable(false);
		fieldSemReacao.setColumns(5);
		fieldSemReacao.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldSemReacao.setBackground(Color.WHITE);
		panel2.add(fieldSemReacao, "cell 1 8");

		fieldDorAguda = new JTextField();
		fieldDorAguda.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldDorAguda.setEditable(false);
		fieldDorAguda.setColumns(4);
		fieldDorAguda.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDorAguda.setBackground(Color.WHITE);
		panel2.add(fieldDorAguda, "cell 2 4,alignx right");

		fieldAltoRisco = new JTextField();
		fieldAltoRisco.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldAltoRisco.setEditable(false);
		fieldAltoRisco.setColumns(4);
		fieldAltoRisco.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldAltoRisco.setBackground(Color.WHITE);
		panel2.add(fieldAltoRisco, "cell 2 8");

		fieldSofrimentoAgudo = new JTextField();
		fieldSofrimentoAgudo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldSofrimentoAgudo.setEditable(false);
		fieldSofrimentoAgudo.setColumns(4);
		fieldSofrimentoAgudo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldSofrimentoAgudo.setBackground(Color.WHITE);
		panel2.add(fieldSofrimentoAgudo, "cell 2 6");

		fieldRaioX = new JTextField();
		fieldRaioX.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldRaioX.setEditable(false);
		fieldRaioX.setColumns(4);
		fieldRaioX.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldRaioX.setBackground(Color.WHITE);
		panel2.add(fieldRaioX, "cell 1 9 5 0");

		JLabel labelInjecoes = new JLabel("     Inje\u00E7\u00F5es");
		labelInjecoes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelInjecoes, "cell 1 9 5 0,alignx right");

		fieldInjecoes = new JTextField();
		fieldInjecoes.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldInjecoes.setEditable(false);
		fieldInjecoes.setColumns(4);
		fieldInjecoes.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldInjecoes.setBackground(Color.WHITE);
		panel2.add(fieldInjecoes, "cell 1 9 5 0");

		JLabel labelTesteLaboratorial = new JLabel("    Teste Laboratorial ");
		labelTesteLaboratorial.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelTesteLaboratorial, "cell 1 9 5 0");

		fieldTL = new JTextField();
		fieldTL.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldTL.setEditable(false);
		fieldTL.setColumns(4);
		fieldTL.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldTL.setBackground(Color.WHITE);
		panel2.add(fieldTL, "cell 1 9 5 0");

		JLabel lblEg = new JLabel("     EG");
		lblEg.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(lblEg, "cell 1 9 5 0");

		fieldEg = new JTextField();
		fieldEg.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		fieldEg.setEditable(false);
		fieldEg.setColumns(4);
		fieldEg.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldEg.setBackground(Color.WHITE);
		panel2.add(fieldEg, "cell 1 9 5 0");

		btnFinalizarConsulta = new JButton("Finalizar Consulta");
		btnFinalizarConsulta.setBackground(new Color(244, 164, 96));
		btnFinalizarConsulta.setActionCommand("finaliza");
		btnFinalizarConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(btnFinalizarConsulta, "cell 2 14,alignx right");
		
				JLabel labelGrausCelsius = new JLabel(" \u00BAC   ");
				labelGrausCelsius.setFont(new Font("Segoe UI", Font.PLAIN, 11));
				panel2.add(labelGrausCelsius, "cell 4 4");
				
						JLabel labelBpm = new JLabel("bpm");
						labelBpm.setFont(new Font("Segoe UI", Font.PLAIN, 11));
						panel2.add(labelBpm, "cell 4 5");
						
								JLabel labelRpm = new JLabel("rpm");
								labelRpm.setFont(new Font("Segoe UI", Font.PLAIN, 11));
								panel2.add(labelRpm, "cell 4 6");
								
										JLabel labelOxi = new JLabel(" %   ");
										panel2.add(labelOxi, "cell 4 7");
										
												JLabel labelFluxRes = new JLabel("l/min");
												panel2.add(labelFluxRes, "cell 4 8");

		this.setLocationRelativeTo(null);
		setResizable(true);

	}
}