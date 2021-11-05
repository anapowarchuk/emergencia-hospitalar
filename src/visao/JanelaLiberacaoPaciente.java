package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class JanelaLiberacaoPaciente extends Pai {

	private JPanel contentPane;
	private JFormattedTextField fieldCPF;
	private JTextField fieldNome;
	private JFormattedTextField fieldDataNasc;
	private JFormattedTextField fieldCPF2;
	private JTextField fieldHorasChegada;
	private JTextField fieldMinutosChegada;
	private JTextField fieldHorasAtendimento;
	private JTextField fieldMinutosAtendimento;
	private JTextField fieldHorasLiberacao;
	private JTextField fieldMinutosLiberacao;
	private JButton buttonLimpar;
	private JButton buttonLiberarPaciente;
	private JButton buttonPesquisar;
	private JButton buttonVoltar;

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JButton getButtonLiberarPaciente() {
		return buttonLiberarPaciente;
	}

	public void setButtonLiberarPaciente(JButton buttonLiberarPaciente) {
		this.buttonLiberarPaciente = buttonLiberarPaciente;
	}

	public JButton getButtonPesquisar() {
		return buttonPesquisar;
	}

	public void setButtonPesquisar(JButton buttonPesquisar) {
		this.buttonPesquisar = buttonPesquisar;
	}

	public JFormattedTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JFormattedTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JFormattedTextField getFieldDataNasc() {
		return fieldDataNasc;
	}

	public void setFieldDataNasc(JFormattedTextField fieldDataNasc) {
		this.fieldDataNasc = fieldDataNasc;
	}

	public JFormattedTextField getFieldCPF2() {
		return fieldCPF2;
	}

	public void setFieldCPF2(JFormattedTextField fieldCPF2) {
		this.fieldCPF2 = fieldCPF2;
	}

	public JTextField getFieldHorasChegada() {
		return fieldHorasChegada;
	}

	public void setFieldHorasChegada(JTextField fieldHorasChegada) {
		this.fieldHorasChegada = fieldHorasChegada;
	}

	public JTextField getFieldMinutosChegada() {
		return fieldMinutosChegada;
	}

	public void setFieldMinutosChegada(JTextField fieldMinutosChegada) {
		this.fieldMinutosChegada = fieldMinutosChegada;
	}

	public JTextField getFieldHorasAtendimento() {
		return fieldHorasAtendimento;
	}

	public void setFieldHorasAtendimento(JTextField fieldHorasAtendimento) {
		this.fieldHorasAtendimento = fieldHorasAtendimento;
	}

	public JTextField getFieldMinutosAtendimento() {
		return fieldMinutosAtendimento;
	}

	public void setFieldMinutosAtendimento(JTextField fieldMinutosAtendimento) {
		this.fieldMinutosAtendimento = fieldMinutosAtendimento;
	}

	public JTextField getFieldHorasLiberacao() {
		return fieldHorasLiberacao;
	}

	public void setFieldHorasLiberacao(JTextField fieldHorasLiberacao) {
		this.fieldHorasLiberacao = fieldHorasLiberacao;
	}

	public JTextField getFieldMinutosLiberacao() {
		return fieldMinutosLiberacao;
	}

	public void setFieldMinutosLiberacao(JTextField fieldMinutosLiberacao) {
		this.fieldMinutosLiberacao = fieldMinutosLiberacao;
	}

	public void limparLiberacao() {
		fieldCPF.setText("");
		fieldCPF2.setText("");
		fieldDataNasc.setText("");
		fieldHorasAtendimento.setText("");
		fieldHorasChegada.setText("");
		fieldHorasLiberacao.setText("");
		fieldMinutosAtendimento.setText("");
		fieldMinutosChegada.setText("");
		fieldMinutosLiberacao.setText("");
		fieldNome.setText("");
	}

	public JanelaLiberacaoPaciente() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelEmergenciaHospitalar = new JLabel("LIBERA\u00C7\u00C3O DO PACIENTE");
		labelEmergenciaHospitalar.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelEmergenciaHospitalar);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow][][][grow][grow]", "[grow][][][][grow][][][][][][][]10[]10"));

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel labelCPF = new JLabel("CPF DO PACIENTE");
		labelCPF.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelCPF, "cell 0 1 6 0,alignx center");

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldCPF, "cell 0 2 6 0,alignx center,aligny center");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(12);

		buttonPesquisar = new JButton("Pesquisar");
		buttonPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPesquisar.setActionCommand("pesquisar");
		buttonPesquisar.setBackground(new Color(244, 164, 96));
		buttonPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonPesquisar, "cell 0 3 6 0,alignx center,aligny center");

		JLabel labelInformacoesDoPaciente = new JLabel("LIBERA\u00C7\u00C3O DO PACIENTE");
		labelInformacoesDoPaciente.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelInformacoesDoPaciente, "cell 0 5 6 0,alignx center");

		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel2.add(labelNome, "cell 2 6,alignx right,aligny center");

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setEditable(false);
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldNome.setColumns(20);
		panel2.add(fieldNome, "cell 3 6 2 0,alignx left,aligny center");

		JLabel labelDataDeNasc = new JLabel("Data de Nascimento");
		labelDataDeNasc.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelDataDeNasc, "cell 2 7,alignx right,aligny center");

		MaskFormatter ftmDataNasc = null;
		try {
			ftmDataNasc = new MaskFormatter("##/##/####");
			ftmDataNasc.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		fieldDataNasc = new JFormattedTextField(ftmDataNasc);
		fieldDataNasc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDataNasc.setEditable(false);
		fieldDataNasc.setBackground(Color.WHITE);
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldDataNasc, "flowx,cell 3 7,alignx left,growy");
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(12);

		JLabel labelCPF2 = new JLabel("CPF");
		labelCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCPF2, "cell 2 8,alignx right");

		fieldCPF2 = new JFormattedTextField(ftmCPF);
		fieldCPF2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF2.setEditable(false);
		panel2.add(fieldCPF2, "cell 3 8,aligny center");
		fieldCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF2.setToolTipText("Apenas Números");
		fieldCPF2.setColumns(12);

		JLabel labelHorarioDeChegada = new JLabel("Hor\u00E1rio de Chegada");
		labelHorarioDeChegada.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelHorarioDeChegada, "cell 2 9,alignx right,aligny center");

		fieldHorasChegada = new JTextField();
		fieldHorasChegada.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldHorasChegada.setEditable(false);
		fieldHorasChegada.setBackground(Color.WHITE);
		fieldHorasChegada.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldHorasChegada.setText("  ");
		panel2.add(fieldHorasChegada, "cell 3 9,growy");
		fieldHorasChegada.setColumns(3);

		JLabel lblHorarioDeAtendimento = new JLabel("Hor\u00E1rio de Atendimento");
		lblHorarioDeAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(lblHorarioDeAtendimento, "cell 2 10,alignx trailing");

		fieldHorasAtendimento = new JTextField();
		fieldHorasAtendimento.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldHorasAtendimento.setEditable(false);
		fieldHorasAtendimento.setBackground(Color.WHITE);
		fieldHorasAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldHorasAtendimento.setText("  ");
		fieldHorasAtendimento.setColumns(3);
		panel2.add(fieldHorasAtendimento, "flowx,cell 3 10,alignx left");

		JLabel labelHorarioDeLiberao = new JLabel("Hor\u00E1rio de Libera\u00E7\u00E3o");
		labelHorarioDeLiberao.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelHorarioDeLiberao, "cell 2 11,alignx trailing");

		fieldHorasLiberacao = new JTextField();
		fieldHorasLiberacao.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldHorasLiberacao.setBackground(Color.WHITE);
		fieldHorasLiberacao.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldHorasLiberacao.setColumns(3);
		panel2.add(fieldHorasLiberacao, "flowx,cell 3 11,alignx left");

		buttonVoltar = new JButton("\r\n");
		buttonVoltar.setIcon(new ImageIcon(JanelaLiberacaoPaciente.class.getResource("/imagens/previous.png")));
		buttonVoltar.setBackground(Color.WHITE);
		buttonVoltar.setActionCommand("voltar");
		panel2.add(buttonVoltar, "cell 0 12,alignx left");

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimpar.setActionCommand("limpar");
		buttonLimpar.setBackground(new Color(244, 164, 96));
		buttonLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonLimpar, "flowx,cell 1 12 5 0,alignx center,aligny center");

		JLabel labelHora = new JLabel("h");
		labelHora.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelHora, "cell 3 9");

		fieldMinutosChegada = new JTextField();
		fieldMinutosChegada.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldMinutosChegada.setEditable(false);
		fieldMinutosChegada.setBackground(Color.WHITE);
		fieldMinutosChegada.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldMinutosChegada, "cell 3 9,growy");
		fieldMinutosChegada.setColumns(3);

		JLabel labelMinutos = new JLabel("min");
		labelMinutos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelMinutos, "cell 3 9");

		JLabel labelHora2 = new JLabel("h");
		labelHora2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelHora2, "cell 3 10");

		fieldMinutosAtendimento = new JTextField();
		fieldMinutosAtendimento.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldMinutosAtendimento.setEditable(false);
		fieldMinutosAtendimento.setBackground(Color.WHITE);
		fieldMinutosAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldMinutosAtendimento.setColumns(3);
		panel2.add(fieldMinutosAtendimento, "cell 3 10");

		JLabel labelMinutos2 = new JLabel("min");
		labelMinutos2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelMinutos2, "cell 3 10");

		JLabel labelHora3 = new JLabel("h");
		labelHora3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelHora3, "cell 3 11");

		fieldMinutosLiberacao = new JTextField();
		fieldMinutosLiberacao.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldMinutosLiberacao.setBackground(Color.WHITE);
		fieldMinutosLiberacao.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldMinutosLiberacao.setColumns(3);
		panel2.add(fieldMinutosLiberacao, "cell 3 11");

		JLabel labelMinutosLiberacao = new JLabel("min");
		labelMinutosLiberacao.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelMinutosLiberacao, "cell 3 11");

		buttonLiberarPaciente = new JButton("Liberar Paciente");
		buttonLiberarPaciente.setBackground(new Color(244, 164, 96));
		buttonLiberarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLiberarPaciente.setActionCommand("libera");
		buttonLiberarPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonLiberarPaciente, "cell 1 12,alignx center,aligny center");

		this.setLocationRelativeTo(null);
		setResizable(true);
	}

}