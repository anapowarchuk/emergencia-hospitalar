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
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class JanelaIniciarAtendimento extends Pai {

	private JPanel contentPane;
	private JFormattedTextField fieldCPF;
	private JFormattedTextField fieldDataNasc;
	private JTextField fieldNome;
	private JTextField textField_2;
	private JTextField fieldCPF2;
	private JTextField fieldHoras;
	private JTextField fieldMinutos;
	private JButton buttonPesquisar;
	private JButton buttonVoltar;
	private JButton buttonLimpar;
	private JButton buttonIniciarAtendimento;
	private JLabel labelSenha;
	private JTextField fieldSenha;

	public JLabel getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JLabel labelSenha) {
		this.labelSenha = labelSenha;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JTextField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JFormattedTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JFormattedTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JFormattedTextField getFieldDataNasc() {
		return fieldDataNasc;
	}

	public void setFieldDataNasc(JFormattedTextField fieldDataNasc) {
		this.fieldDataNasc = fieldDataNasc;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getFieldCPF2() {
		return fieldCPF2;
	}

	public void setFieldCPF2(JTextField fieldCPF2) {
		this.fieldCPF2 = fieldCPF2;
	}

	public JTextField getFieldHoras() {
		return fieldHoras;
	}

	public void setFieldHoras(JTextField fieldHoras) {
		this.fieldHoras = fieldHoras;
	}

	public JTextField getFieldMinutos() {
		return fieldMinutos;
	}

	public void setFieldMinutos(JTextField fieldMinutos) {
		this.fieldMinutos = fieldMinutos;
	}

	public JButton getButtonPesquisar() {
		return buttonPesquisar;
	}

	public void setButtonPesquisar(JButton buttonPesquisar) {
		this.buttonPesquisar = buttonPesquisar;
	}

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

	public JButton getButtonIniciarAtendimento() {
		return buttonIniciarAtendimento;
	}

	public void setButtonIniciarAtendimento(JButton buttonIniciarAtendimento) {
		this.buttonIniciarAtendimento = buttonIniciarAtendimento;
	}

	public void limparAtendimento() {
		fieldCPF.setText("");
		fieldCPF2.setText("");
		fieldDataNasc.setText("");
		fieldHoras.setText("");
		fieldMinutos.setText("");
		fieldNome.setText("");
		fieldSenha.setText("");
	}

	public JanelaIniciarAtendimento() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelIniciarAtendimento = new JLabel("INICIAR ATENDIMENTO");
		labelIniciarAtendimento.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelIniciarAtendimento);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(
				new MigLayout("", "[][grow][grow][][grow]", "[grow][][][][grow][][][][][][grow][][grow][][grow]"));

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel labelCPF = new JLabel("CPF DO PACIENTE");
		labelCPF.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelCPF, "cell 1 1 3 0,alignx center");

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF.setBounds(345, 145, 211, 31);
		panel2.add(fieldCPF, "cell 1 2 3 0,alignx center,aligny center");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(10);

		buttonPesquisar = new JButton("Pesquisar");
		buttonPesquisar.setBackground(new Color(244, 164, 96));
		buttonPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonPesquisar, "cell 1 3 3 0,alignx center,aligny center");

		JLabel labelInformacoesDoPaciente = new JLabel("INFORMA\u00C7\u00D5ES DO PACIENTE");
		labelInformacoesDoPaciente.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelInformacoesDoPaciente, "cell 1 5 3 0,alignx center");

		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelNome, "cell 1 6,alignx right,aligny center");

		MaskFormatter ftmDataNasc = null;
		try {
			ftmDataNasc = new MaskFormatter("##/##/####");
			ftmDataNasc.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setEditable(false);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldNome.setColumns(10);
		panel2.add(fieldNome, "cell 2 6,growx,aligny center");

		JLabel labelDataDeNasc = new JLabel("Data de Nascimento");
		labelDataDeNasc.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelDataDeNasc, "cell 1 7,alignx right,aligny center");

		fieldDataNasc = new JFormattedTextField(ftmDataNasc);
		fieldDataNasc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDataNasc.setBackground(Color.WHITE);
		fieldDataNasc.setEditable(false);
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldDataNasc.setBounds(345, 180, 211, 31);
		panel2.add(fieldDataNasc, "cell 2 7,alignx left,aligny center");
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(10);

		JLabel labelCPF2 = new JLabel("CPF");
		labelCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCPF2, "cell 1 8,alignx right");

		fieldCPF2 = new JFormattedTextField(ftmCPF);
		fieldCPF2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF2.setBackground(Color.WHITE);
		fieldCPF2.setEditable(false);
		fieldCPF2.setBounds(345, 145, 211, 31);
		fieldCPF2.setToolTipText("Apenas Números");
		fieldCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldCPF2, "cell 2 8,aligny center");
		fieldCPF2.setColumns(10);
		
				labelSenha = new JLabel("Senha");
				labelSenha.setFont(new Font("Segoe UI", Font.PLAIN, 16));
				panel2.add(labelSenha, "cell 1 9,alignx trailing");
		
				fieldSenha = new JTextField();
				fieldSenha.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				fieldSenha.setBackground(Color.WHITE);
				fieldSenha.setEditable(false);
				fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
				fieldSenha.setText("  ");
				fieldSenha.setColumns(10);
				panel2.add(fieldSenha, "cell 2 9");

		JLabel labelHorarioDeChegada = new JLabel("Hor\u00E1rio de Chegada");
		labelHorarioDeChegada.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelHorarioDeChegada, "cell 1 10,alignx right,aligny center");

		fieldHoras = new JTextField();
		fieldHoras.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldHoras.setBackground(Color.WHITE);
		fieldHoras.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldHoras.setBounds(184, 306, 28, 22);
		panel2.add(fieldHoras, "flowx,cell 2 10,aligny center");
		fieldHoras.setColumns(2);

		buttonVoltar = new JButton("");
		buttonVoltar.setBackground(Color.WHITE);
		buttonVoltar.setIcon(new ImageIcon(JanelaIniciarAtendimento.class.getResource("/imagens/previous.png")));
		buttonVoltar.setActionCommand("voltar");
		panel2.add(buttonVoltar, "cell 0 12,alignx left");

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimpar.setBackground(new Color(244, 164, 96));
		buttonLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonLimpar, "flowx,cell 1 12 3 0,alignx center,aligny center");

		JLabel labelHora = new JLabel("h");
		labelHora.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelHora, "cell 2 10");

		fieldMinutos = new JTextField();
		fieldMinutos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldMinutos.setBackground(Color.WHITE);
		fieldMinutos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldMinutos.setBounds(226, 306, 28, 22);
		panel2.add(fieldMinutos, "cell 2 10,aligny center");
		fieldMinutos.setColumns(2);

		JLabel labelMinutos = new JLabel("min");
		labelMinutos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		panel2.add(labelMinutos, "cell 2 10");

		buttonIniciarAtendimento = new JButton("Iniciar Atendimento");
		buttonIniciarAtendimento.setBackground(new Color(244, 164, 96));
		buttonIniciarAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		// buttonIniciarAtendimento.setActionCommand("iniciaAten");
		panel2.add(buttonIniciarAtendimento, "cell 1 12 3 0,alignx center,aligny center");
		
		setLocationRelativeTo(null);
	}

}