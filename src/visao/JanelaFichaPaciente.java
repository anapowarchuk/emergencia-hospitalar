package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class JanelaFichaPaciente extends Pai {

	private JPanel contentPane;
	private JButton buttonListaDePacientes;
	private JTextArea textArea;
	private JButton buttonFilaDeAtendimentos;
	private JButton buttonPrioridade1;
	private JButton buttonPrioridade2;
	private JButton buttonPrioridade3;
	private JButton buttonPrioridade4;
	private JButton buttonPrioridade5;
	private JButton buttonAtendimentosEncerrados;
	private JButton buttonVoltar;

	public JanelaFichaPaciente() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelEmergenciaHospitalar = new JLabel("FICHAS DOS PACIENTES");
		labelEmergenciaHospitalar.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelEmergenciaHospitalar);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "10[250px]15[grow]", "[23px,grow][][][][][][][][][][]"));

		buttonListaDePacientes = new JButton("Lista de Pacientes");
		buttonListaDePacientes.setBackground(new Color(255, 160, 122));
		buttonListaDePacientes.setActionCommand("ListaPacientes");
		buttonListaDePacientes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonListaDePacientes, "cell 0 0,growx,aligny top");

		JScrollPane scrollPane = new JScrollPane();
		panel2.add(scrollPane, "cell 1 0 0 8,grow");

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		buttonFilaDeAtendimentos = new JButton("Fila de Atendimentos");
		buttonFilaDeAtendimentos.setBackground(new Color(255, 160, 122));
		buttonFilaDeAtendimentos.setActionCommand("FilaAtendimentos");
		buttonFilaDeAtendimentos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonFilaDeAtendimentos, "cell 0 1,growx");

		buttonPrioridade1 = new JButton("Prioridade 1");
		buttonPrioridade1.setBackground(new Color(255, 160, 122));
		buttonPrioridade1.setActionCommand("p1");
		buttonPrioridade1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPrioridade1, "cell 0 2,growx");

		buttonPrioridade2 = new JButton("Prioridade 2");
		buttonPrioridade2.setActionCommand("p2");
		buttonPrioridade2.setBackground(new Color(255, 160, 122));
		buttonPrioridade2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPrioridade2, "cell 0 3,growx");

		buttonPrioridade3 = new JButton("Prioridade 3");
		buttonPrioridade3.setActionCommand("p3");
		buttonPrioridade3.setBackground(new Color(255, 160, 122));
		buttonPrioridade3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPrioridade3, "cell 0 4,growx");

		buttonPrioridade4 = new JButton("Prioridade 4");
		buttonPrioridade4.setActionCommand("p4");
		buttonPrioridade4.setBackground(new Color(255, 160, 122));
		buttonPrioridade4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPrioridade4, "cell 0 5,growx");

		buttonPrioridade5 = new JButton("Prioridade 5");
		buttonPrioridade5.setActionCommand("p5");
		buttonPrioridade5.setBackground(new Color(255, 160, 122));
		buttonPrioridade5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPrioridade5, "cell 0 6,growx");

		buttonAtendimentosEncerrados = new JButton("Atendimentos Encerrados");
		buttonAtendimentosEncerrados.setActionCommand("AtendimentosEncerrados");
		buttonAtendimentosEncerrados.setBackground(new Color(255, 160, 122));
		buttonAtendimentosEncerrados.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonAtendimentosEncerrados, "cell 0 7,growx,aligny baseline");

		buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(JanelaRelatorioTempo.class.getResource("/imagens/previous.png")));
		buttonVoltar.setActionCommand("voltar");
		buttonVoltar.setBackground(Color.WHITE);
		panel2.add(buttonVoltar, "cell 0 9");

		this.setLocationRelativeTo(null);
		setResizable(true);
	}

	public JButton getButtonListaDePacientes() {
		return buttonListaDePacientes;
	}

	public void setButtonListaDePacientes(JButton buttonListaDePacientes) {
		this.buttonListaDePacientes = buttonListaDePacientes;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getButtonFilaDeAtendimentos() {
		return buttonFilaDeAtendimentos;
	}

	public void setButtonFilaDeAtendimentos(JButton buttonFilaDeAtendimentos) {
		this.buttonFilaDeAtendimentos = buttonFilaDeAtendimentos;
	}

	public JButton getButtonPrioridade1() {
		return buttonPrioridade1;
	}

	public void setButtonPrioridade1(JButton buttonPrioridade1) {
		this.buttonPrioridade1 = buttonPrioridade1;
	}

	public JButton getButtonPrioridade2() {
		return buttonPrioridade2;
	}

	public void setButtonPrioridade2(JButton buttonPrioridade2) {
		this.buttonPrioridade2 = buttonPrioridade2;
	}

	public JButton getButtonPrioridade3() {
		return buttonPrioridade3;
	}

	public void setButtonPrioridade3(JButton buttonPrioridade3) {
		this.buttonPrioridade3 = buttonPrioridade3;
	}

	public JButton getButtonPrioridade4() {
		return buttonPrioridade4;
	}

	public void setButtonPrioridade4(JButton buttonPrioridade4) {
		this.buttonPrioridade4 = buttonPrioridade4;
	}

	public JButton getButtonPrioridade5() {
		return buttonPrioridade5;
	}

	public void setButtonPrioridade5(JButton buttonPrioridade5) {
		this.buttonPrioridade5 = buttonPrioridade5;
	}

	public JButton getButtonAtendimentosEncerrados() {
		return buttonAtendimentosEncerrados;
	}

	public void setButtonAtendimentosEncerrados(JButton buttonAtendimentosEncerrados) {
		this.buttonAtendimentosEncerrados = buttonAtendimentosEncerrados;
	}

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}


}