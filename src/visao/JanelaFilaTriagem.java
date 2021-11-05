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
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class JanelaFilaTriagem extends Pai {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JFormattedTextField fieldCPF;
	private JFormattedTextField fieldDataNasc;
	private JButton buttonChamarProximoPaciente;
	private JButton buttonVoltar;
	private JButton buttonOk;
	private JLabel labelIniciar;
	private JLabel labelNome;
	private JanelaTriagem triagem;
	private JLabel lblSenha;
	private JTextField fieldSenha;

	public JLabel getLblSenha() {
		return lblSenha;
	}

	public void setLblSenha(JLabel lblSenha) {
		this.lblSenha = lblSenha;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JTextField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JanelaTriagem getTriagem() {
		return triagem;
	}

	public JanelaTriagem getTriagem(Atendimento a2) {
		return triagem;
	}

	public void setTriagem(JanelaTriagem triagem) {
		this.triagem = triagem;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JLabel getLabelIniciar() {
		return labelIniciar;
	}

	public void setLabelIniciar(JLabel labelIniciar) {
		this.labelIniciar = labelIniciar;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}

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

	public JButton getButtonChamarProximoPaciente() {
		return buttonChamarProximoPaciente;
	}

	public void setButtonChamarProximoPaciente(JButton buttonChamarProximoPaciente) {
		this.buttonChamarProximoPaciente = buttonChamarProximoPaciente;
	}

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}

	public void limpar() {
		fieldNome.setText("");
		fieldCPF.setText("");
		fieldDataNasc.setText("");
		fieldSenha.setText("");
	}

	public JanelaFilaTriagem() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelFilaDeTriagem = new JLabel("FILA DE TRIAGEM");
		labelFilaDeTriagem.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelFilaDeTriagem);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow][][][][grow][][grow]", "[grow][][grow][][][][][]10[][grow][]"));
		
				buttonChamarProximoPaciente = new JButton("Chamar Proximo Paciente");
				buttonChamarProximoPaciente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				buttonChamarProximoPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				buttonChamarProximoPaciente.setBackground(new Color(244, 164, 96));
				panel2.add(buttonChamarProximoPaciente, "cell 3 1,alignx center,aligny center");

		JLabel labelProximoPaciente = new JLabel("PR\u00D3XIMO PACIENTE");
		labelProximoPaciente.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel2.add(labelProximoPaciente, "cell 0 3 8 0,alignx center");

		labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelNome, "cell 2 4,alignx trailing");

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldNome.setEditable(false);
		fieldNome.setColumns(20);
		panel2.add(fieldNome, "cell 3 4 3 0,alignx left,aligny center");

		MaskFormatter ftmDataNasc = null;
		try {
			ftmDataNasc = new MaskFormatter("##/##/####");
			ftmDataNasc.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel labelDataDeNasc = new JLabel("Data de Nascimento");
		labelDataDeNasc.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelDataDeNasc, "cell 2 5,alignx trailing");

		fieldDataNasc = new JFormattedTextField(ftmDataNasc);
		fieldDataNasc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDataNasc.setBackground(Color.WHITE);
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldDataNasc.setEditable(false);
		panel2.add(fieldDataNasc, "flowx,cell 3 5,growx,aligny center");
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(10);

		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCPF, "cell 2 6,alignx trailing");

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF.setEditable(false);
		panel2.add(fieldCPF, "cell 3 6,growx");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(10);

		buttonVoltar = new JButton("");
		buttonVoltar.setBackground(Color.WHITE);
		buttonVoltar.setIcon(new ImageIcon(JanelaFilaTriagem.class.getResource("/imagens/previous.png")));
		buttonVoltar.setActionCommand("voltar");

		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(lblSenha, "cell 2 7,alignx right");

		fieldSenha = new JTextField();
		fieldSenha.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldSenha.setBackground(Color.WHITE);
		fieldSenha.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldSenha.setEditable(false);
		fieldSenha.setColumns(10);
		panel2.add(fieldSenha, "cell 3 7,growx");

		labelIniciar = new JLabel("Iniciar a Triagem?");
		labelIniciar.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel2.add(labelIniciar, "cell 0 8 8 0,alignx center");
		buttonVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonVoltar, "cell 0 9,alignx left");

		buttonOk = new JButton("Ok");
		buttonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonOk.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		buttonOk.setBackground(new Color(244, 164, 96));
		panel2.add(buttonOk, "cell 3 9,alignx center,aligny top");

		this.setLocationRelativeTo(null);
		setResizable(true);
		triagem = new JanelaTriagem(null);

	}
}