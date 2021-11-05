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
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class JanelaDeConsulta extends Pai {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JFormattedTextField fieldCPF;
	private JFormattedTextField fieldDataNasc;
	private JTextField fieldPrioridade;
	private JButton buttonChamarProximoPaciente;
	private JButton buttonVoltar;
	private JButton btnAtenderPaciente;
	private JanelaDeConsulta2 janelaConsulta;

	public JanelaDeConsulta2 getJanelaConsulta(Atendimento a1) {
		return janelaConsulta;
	}

	public void setJanelaConsulta(JanelaDeConsulta2 janelaConsulta) {
		this.janelaConsulta = janelaConsulta;
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

	public JTextField getFieldPrioridade() {
		return fieldPrioridade;
	}

	public void setFieldPrioridade(JTextField fieldPrioridade) {
		this.fieldPrioridade = fieldPrioridade;
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

	public JButton getBtnAtenderPaciente() {
		return btnAtenderPaciente;
	}

	public void setBtnAtenderPaciente(JButton btnAtenderPaciente) {
		this.btnAtenderPaciente = btnAtenderPaciente;
	}

	public void limpaConsulta() {
		fieldCPF.setText("");
		fieldDataNasc.setText("");
		fieldNome.setText("");
		fieldPrioridade.setText("");
		fieldPrioridade.setBackground(Color.white);

	}

	public JanelaDeConsulta() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelChamadaParaConsulta = new JLabel("CHAMADA PARA CONSULTA");
		labelChamadaParaConsulta.setFont(new Font("Century Gothic", Font.BOLD, 20));
		panel1.add(labelChamadaParaConsulta);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow][][][grow][grow]", "[grow][][grow][][][][][][grow]15"));

		buttonChamarProximoPaciente = new JButton("Chamar Pr\u00F3ximo Paciente");
		buttonChamarProximoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonChamarProximoPaciente.setActionCommand("chama");
		buttonChamarProximoPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		buttonChamarProximoPaciente.setBackground(new Color(244, 164, 96));
		panel2.add(buttonChamarProximoPaciente, "cell 0 1 6 0,alignx center,aligny center");

		JLabel labelProximoPaciente = new JLabel("PR\u00D3XIMO PACIENTE");
		labelProximoPaciente.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelProximoPaciente, "cell 0 3 6 0,alignx center");

		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelNome, "cell 2 4,alignx trailing");

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setEditable(false);
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldNome.setColumns(20);
		panel2.add(fieldNome, "cell 3 4 2 0,alignx left,aligny center");

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
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldDataNasc.setEditable(false);
		fieldDataNasc.setBackground(Color.WHITE);
		panel2.add(fieldDataNasc, "flowx,cell 3 5,alignx left,aligny center");
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(12);

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
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF.setEditable(false);
		fieldCPF.setBackground(Color.WHITE);
		panel2.add(fieldCPF, "cell 3 6,alignx left");
		fieldCPF.setToolTipText("Apenas Números");
		fieldCPF.setColumns(12);

		buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(JanelaDeConsulta.class.getResource("/imagens/previous.png")));
		buttonVoltar.setActionCommand("voltar");

		JLabel labelPrioridade = new JLabel("Prioridade");
		labelPrioridade.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel2.add(labelPrioridade, "cell 2 7,alignx right");

		fieldPrioridade = new JTextField();
		fieldPrioridade.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldPrioridade.setEditable(false);
		fieldPrioridade.setBackground(Color.WHITE);
		fieldPrioridade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldPrioridade.setColumns(12);
		panel2.add(fieldPrioridade, "cell 3 7,alignx left");
		buttonVoltar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel2.add(buttonVoltar, "cell 0 8,alignx center");
		
				btnAtenderPaciente = new JButton("Atender Paciente");
				btnAtenderPaciente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnAtenderPaciente.setBackground(new Color(244, 164, 96));
				btnAtenderPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				btnAtenderPaciente.setActionCommand("atende");
				panel2.add(btnAtenderPaciente, "cell 1 8 5 0,alignx center");

		janelaConsulta = new JanelaDeConsulta2(null);

		this.setLocationRelativeTo(null);
		setResizable(true);

	}

}