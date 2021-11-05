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

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;

public class JanelaPesquisarPaciente extends Pai {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JFormattedTextField fieldDataNasc;
	private JTextField fieldCPF2;
	private JButton buttonPesquisar;
	private JButton buttonVoltar;
	private JButton buttonLimpar;
	private JFormattedTextField fieldCPF;

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

	public JTextField getFieldCPF2() {
		return fieldCPF2;
	}

	public void setFieldCPF2(JTextField fieldCPF2) {
		this.fieldCPF2 = fieldCPF2;
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

	public void limparPesquisa() {
		fieldCPF.setText("");
		fieldNome.setText("");
		fieldCPF2.setText("");
		fieldDataNasc.setText("");
	}

	public JanelaPesquisarPaciente() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 720, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelPesquisarPaciente = new JLabel("        PESQUISAR PACIENTE");
		labelPesquisarPaciente.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel1.add(labelPesquisarPaciente);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow][][grow][][grow]", "[grow][][][][grow][][][][][grow][][][][grow]"));

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

		MaskFormatter ftmDataNasc = null;
		try {
			ftmDataNasc = new MaskFormatter("##/##/####");
			ftmDataNasc.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		fieldCPF = new JFormattedTextField(ftmCPF);
		fieldCPF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF.setBackground(Color.WHITE);
		fieldCPF.setToolTipText("Apenas N\u00FAmeros");
		fieldCPF.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF.setColumns(10);
		panel2.add(fieldCPF, "cell 0 2 6 0,alignx center");

		buttonPesquisar = new JButton("Pesquisar");
		buttonPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPesquisar.setBackground(new Color(244, 164, 96));
		buttonPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(buttonPesquisar, "cell 0 3 6 0,alignx center,aligny center");

		JLabel labelInformacoes = new JLabel("INFORMA\u00C7\u00D5ES DO PACIENTE");
		labelInformacoes.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel2.add(labelInformacoes, "cell 0 5 6 0,alignx center");

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(lblNome, "flowx,cell 2 6,alignx right");

		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setEditable(false);
		fieldNome.setDisabledTextColor(Color.WHITE);
		fieldNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(fieldNome, "cell 3 6 2 0,growx,aligny center");
		fieldNome.setColumns(20);

		JLabel labelCPF2 = new JLabel("CPF");
		labelCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelCPF2, "cell 2 7,alignx right");

		fieldCPF2 = new JFormattedTextField(ftmCPF);
		fieldCPF2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCPF2.setBackground(Color.WHITE);
		fieldCPF2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldCPF2.setEditable(false);
		panel2.add(fieldCPF2, "cell 3 7,alignx left,aligny center");
		fieldCPF2.setToolTipText("Apenas Números");
		fieldCPF2.setColumns(10);

		JLabel labelDataDeNasc = new JLabel("Data de Nascimento");
		labelDataDeNasc.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel2.add(labelDataDeNasc, "cell 2 8,alignx left");

		fieldDataNasc = new JFormattedTextField(ftmDataNasc);
		fieldDataNasc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldDataNasc.setBackground(Color.WHITE);
		fieldDataNasc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fieldDataNasc.setEditable(false);
		panel2.add(fieldDataNasc, "cell 3 8,alignx left,aligny center");
		fieldDataNasc.setToolTipText("Apenas Números");
		fieldDataNasc.setColumns(10);

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBackground(new Color(244, 164, 96));
		buttonLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panel2.add(buttonLimpar, "cell 3 11,alignx right,aligny center");

		buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(JanelaPesquisarPaciente.class.getResource("/imagens/previous.png")));
		buttonVoltar.setActionCommand("voltar");
		buttonVoltar.setBackground(Color.WHITE);
		panel2.add(buttonVoltar, "cell 0 12,alignx center");

		this.setLocationRelativeTo(null);
		setResizable(true);

	}

}