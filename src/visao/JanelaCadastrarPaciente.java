package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class JanelaCadastrarPaciente extends Pai {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JFormattedTextField fieldCPF;
	private JFormattedTextField fieldDataNasc;
	private JButton buttonVoltar;
	private JButton buttonLimpar;
	private JButton buttonCadastrar;

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
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

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public void limparCadastro() {
		fieldNome.setText("");
		fieldCPF.setText("");
		fieldDataNasc.setText("");
	}

	public JanelaCadastrarPaciente() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 400);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		panel1.setBorder(null);
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelCadastroDoPaciente = new JLabel("CADASTRO DO PACIENTE");
		labelCadastroDoPaciente.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelCadastroDoPaciente);

		JPanel panel2 = new JPanel();
		panel2.setForeground(Color.WHITE);
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow][grow][grow]", "[grow][][][][][][grow][][][grow]"));

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.BOLD, 17));
		panel2.add(labelNome, "cell 1 1,alignx trailing");

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
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldNome, "cell 2 1,growx");
		fieldNome.setColumns(10);

		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setFont(new Font("Segoe UI", Font.BOLD, 17));
		panel2.add(labelCpf, "cell 1 3,alignx right");

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldCPF, "cell 2 3,alignx left");
		fieldCPF.setBounds(345, 145, 211, 31);
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(10);
	

		JLabel labelDataDeNasc = new JLabel("Data de Nascimento");
		labelDataDeNasc.setFont(new Font("Segoe UI", Font.BOLD, 17));
		panel2.add(labelDataDeNasc, "cell 0 5 2 0,alignx right");

		fieldDataNasc = new JFormattedTextField(ftmDataNasc);
		fieldDataNasc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDataNasc.setBackground(Color.WHITE);
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldDataNasc, "cell 2 5,alignx left");
		fieldDataNasc.setBounds(345, 180, 211, 31);
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(10);

		buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(JanelaCadastrarPaciente.class.getResource("/imagens/previous.png")));
		buttonVoltar.setBackground(Color.WHITE);
		buttonVoltar.setActionCommand("voltar");
		buttonVoltar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel2.add(buttonVoltar, "cell 0 7,alignx left,growy");

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBackground(new Color(244, 164, 96));
		buttonLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonLimpar, "flowx,cell 1 7 2 0,alignx center,aligny center");

		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setBackground(new Color(244, 164, 96));
		buttonCadastrar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonCadastrar, "cell 1 7,alignx center,aligny center");

		setLocationRelativeTo(null);
	}

}