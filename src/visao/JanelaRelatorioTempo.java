package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class JanelaRelatorioTempo extends Pai {

	private JPanel contentPane;
	private JButton buttonAtendimento;
	private JButton buttonAtendimentoPaciente;
	private JButton buttonAtendimentoPorFila;
	private JButton buttonVoltar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	public JanelaRelatorioTempo() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelEmergenciaHospitalar = new JLabel("TEMPO M\u00C9DIO");
		labelEmergenciaHospitalar.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelEmergenciaHospitalar);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[250px]15[grow]", "[100px,grow][100px][100px][][][]"));

		buttonAtendimento = new JButton("Espera para Atendimento");
		buttonAtendimento.setBackground(new Color(255, 160, 122));
		buttonAtendimento.setActionCommand("buttonAten");
		buttonAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonAtendimento, "cell 0 0,grow");

		scrollPane = new JScrollPane();
		panel2.add(scrollPane, "cell 1 0 1 3,grow");

		textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		scrollPane.setViewportView(textArea);

		buttonAtendimentoPaciente = new JButton("Atendimento Paciente");
		buttonAtendimentoPaciente.setBackground(new Color(255, 160, 122));
		buttonAtendimentoPaciente.setActionCommand("buttonAtenP");
		buttonAtendimentoPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonAtendimentoPaciente, "cell 0 1,grow");

		buttonAtendimentoPorFila = new JButton("Atendimentos por Fila");
		buttonAtendimentoPorFila.setBackground(new Color(255, 160, 122));
		buttonAtendimentoPorFila.setActionCommand("buttonAtenF");
		buttonAtendimentoPorFila.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonAtendimentoPorFila, "cell 0 2,grow");

		buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(JanelaRelatorioTempo.class.getResource("/imagens/previous.png")));
		buttonVoltar.setBackground(Color.WHITE);
		buttonVoltar.setActionCommand("voltar");
		panel2.add(buttonVoltar, "cell 0 5");

		this.setLocationRelativeTo(null);
		setResizable(true);
	}

	public JButton getButtonAtendimento() {
		return buttonAtendimento;
	}

	public void setButtonAtendimento(JButton buttonAtendimento) {
		this.buttonAtendimento = buttonAtendimento;
	}

	public JButton getButtonAtendimentoPaciente() {
		return buttonAtendimentoPaciente;
	}

	public void setButtonAtendimentoPaciente(JButton buttonAtendimentoPaciente) {
		this.buttonAtendimentoPaciente = buttonAtendimentoPaciente;
	}

	public JButton getButtonAtendimentoPorFila() {
		return buttonAtendimentoPorFila;
	}

	public void setButtonAtendimentoPorFila(JButton buttonAtendimentoPorFila) {
		this.buttonAtendimentoPorFila = buttonAtendimentoPorFila;
	}

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

}