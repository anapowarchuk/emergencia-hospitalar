package visao;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import modelo.Atendimento;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class JanelaPrincipal extends Pai {

	private JPanel contentPane;
	private JButton buttonCadastrarPaciente;
	private JButton buttonBusP;
	private JButton buttonTriagem;
	private JButton buttonConsulta;
	private JButton buttonAtenP;
	private JButton buttonLiberacao;
	private JanelaCadastrarPaciente CadPac;
	private JanelaPesquisarPaciente BusPac;
	private JanelaFilaTriagem chamaTriagem;
	private JanelaTriagem Triagem;
	private JanelaDeConsulta Consulta;
	private JanelaIniciarAtendimento Atendimento;
	private JanelaLiberacaoPaciente LiberarP;
	private JanelaRelatorioTempo RelatorioTempo;
	private JanelaFichaPaciente FichaP;
	private JMenuItem menuAdministrativos;
	private JMenuItem menuFichasP;
	private JMenuItem menuSair;
	private Atendimento a1;
	private JLabel label;

	public JanelaFilaTriagem getChamaTriagem() {
		return chamaTriagem;
	}

	public void setChamaTriagem(JanelaFilaTriagem chamaTriagem) {
		this.chamaTriagem = chamaTriagem;
	}

	public JButton getButtonCadastrarPaciente() {
		return buttonCadastrarPaciente;
	}

	public void setButtonCadastrarPaciente(JButton buttonCadastrarPaciente) {
		this.buttonCadastrarPaciente = buttonCadastrarPaciente;
	}

	public JButton getButtonBusP() {
		return buttonBusP;
	}

	public void setButtonBusP(JButton buttonBusP) {
		this.buttonBusP = buttonBusP;
	}

	public JButton getButtonTriagem() {
		return buttonTriagem;
	}

	public void setButtonTriagem(JButton buttonTriagem) {
		this.buttonTriagem = buttonTriagem;
	}

	public JButton getButtonConsulta() {
		return buttonConsulta;
	}

	public void setButtonConsulta(JButton buttonConsulta) {
		this.buttonConsulta = buttonConsulta;
	}

	public JButton getButtonAtenP() {
		return buttonAtenP;
	}

	public void setButtonAtenP(JButton buttonAtenP) {
		this.buttonAtenP = buttonAtenP;
	}

	public JButton getButtonLiberacao() {
		return buttonLiberacao;
	}

	public void setButtonLiberacao(JButton buttonLiberacao) {
		this.buttonLiberacao = buttonLiberacao;
	}

	public JanelaCadastrarPaciente getCadPac() {
		return CadPac;
	}

	public void setCadPac(JanelaCadastrarPaciente cadPac) {
		CadPac = cadPac;
	}

	public JanelaPesquisarPaciente getBusPac() {
		return BusPac;
	}

	public void setBusPac(JanelaPesquisarPaciente busPac) {
		BusPac = busPac;
	}

	public JanelaTriagem getTriagem() {
		return Triagem;
	}

	public void setTriagem(JanelaTriagem triagem) {
		Triagem = triagem;
	}

	public JanelaDeConsulta getConsulta() {
		return Consulta;
	}

	public void setConsulta(JanelaDeConsulta consulta) {
		Consulta = consulta;
	}

	public JanelaIniciarAtendimento getAtendimento() {
		return Atendimento;
	}

	public void setAtendimento(JanelaIniciarAtendimento atendimento) {
		Atendimento = atendimento;
	}

	public JanelaLiberacaoPaciente getLiberarP() {
		return LiberarP;
	}

	public void setLiberarP(JanelaLiberacaoPaciente liberarP) {
		LiberarP = liberarP;
	}

	public JanelaRelatorioTempo getRelatorioTempo() {
		return RelatorioTempo;
	}

	public void setRelatorioTempo(JanelaRelatorioTempo relatorioTempo) {
		RelatorioTempo = relatorioTempo;
	}

	public JMenuItem getMenuFichasP() {
		return menuFichasP;
	}

	public void setMenuFichasP(JMenuItem menuFichasP) {
		this.menuFichasP = menuFichasP;
	}

	public JMenuItem getMenuSair() {
		return menuSair;
	}

	public void setMenuSair(JMenuItem menuSair) {
		this.menuSair = menuSair;
	}

	public JanelaFichaPaciente getFichaP() {
		return FichaP;
	}

	public void setFichaP(JanelaFichaPaciente fichaP) {
		FichaP = fichaP;
	}

	public JanelaPrincipal() {
		setTitle("EMERG\u00CANCIA HOSPITALAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnRelatorios = new JMenu("Relat\u00F3rios");
		mnRelatorios.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnRelatorios);

		menuAdministrativos = new JMenuItem("Administrativos");
		menuAdministrativos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuAdministrativos.setActionCommand("menuAdm");
		mnRelatorios.add(menuAdministrativos);

		JMenu mnFichas = new JMenu("Fichas");
		mnFichas.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnFichas);

		menuFichasP = new JMenuItem("Pacientes");
		menuFichasP.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuFichasP.setActionCommand("menuFP");
		mnFichas.add(menuFichasP);

		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnArquivo);

		menuSair = new JMenuItem("Sair");
		menuSair.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuSair.setActionCommand("menuSair");
		mnArquivo.add(menuSair);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel labelEmergenciaHospital = new JLabel("EMERG\u00CANCIA HOSPITALAR");
		labelEmergenciaHospital.setFont(new Font("Century Gothic", Font.BOLD, 40));
		panel1.add(labelEmergenciaHospital);

		label = new JLabel("");
		label.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/hospital (1).png")));
		panel1.add(label);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[grow][][grow][][][grow][][grow]", "[][grow][][grow][][grow][]"));

		buttonCadastrarPaciente = new JButton("Cadastrar Paciente");
		buttonCadastrarPaciente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/report.png")));
		buttonCadastrarPaciente.setIconTextGap(0);
		buttonCadastrarPaciente.setSize(new Dimension(2, 0));
		buttonCadastrarPaciente.setPreferredSize(new Dimension(50, 10));
		buttonCadastrarPaciente.setBackground(Color.WHITE);
		buttonCadastrarPaciente.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonCadastrarPaciente, "cell 2 1,grow");

		buttonBusP = new JButton("Buscar Paciente");
		buttonBusP.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/magnifying-glass.png")));
		buttonBusP.setIconTextGap(1);
		buttonBusP.setBackground(Color.WHITE);
		buttonBusP.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonBusP, "cell 5 1,grow");

		buttonAtenP = new JButton("Atender Paciente");
		buttonAtenP.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/cardiogram.png")));
		buttonAtenP.setBackground(Color.WHITE);
		buttonAtenP.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonAtenP, "cell 2 3,grow");

		buttonTriagem = new JButton("Triagem");
		buttonTriagem.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/report-1.png")));
		buttonTriagem.setBackground(Color.WHITE);
		buttonTriagem.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonTriagem, "cell 5 3,grow");

		buttonConsulta = new JButton("Consulta");
		buttonConsulta.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/stethoscope.png")));
		buttonConsulta.setBackground(Color.WHITE);
		buttonConsulta.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonConsulta, "cell 2 5,grow");

		buttonLiberacao = new JButton("Libera\u00E7\u00E3o");
		buttonLiberacao.setIconTextGap(9);
		buttonLiberacao.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/folder(1).png")));
		buttonLiberacao.setBackground(Color.WHITE);
		buttonLiberacao.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel2.add(buttonLiberacao, "cell 5 5,grow");

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JLabel lblAnaPowarchukXavier = new JLabel("Ana Powarchuk Xavier, Camila Batista e Giovanna Alves Gadelha");
		lblAnaPowarchukXavier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblAnaPowarchukXavier);

		CadPac = new JanelaCadastrarPaciente();
		BusPac = new JanelaPesquisarPaciente();
		chamaTriagem = new JanelaFilaTriagem();
		// Triagem = new JanelaTriagem(a1);
		Consulta = new JanelaDeConsulta();
		Atendimento = new JanelaIniciarAtendimento();
		LiberarP = new JanelaLiberacaoPaciente();
		FichaP = new JanelaFichaPaciente();
		RelatorioTempo = new JanelaRelatorioTempo();

		setLocationRelativeTo(null);
		setResizable(true);
	}

	public JMenuItem getMenuAdministrativos() {
		return menuAdministrativos;
	}

	public void setMenuAdministrativos(JMenuItem menuAdministrativos) {
		this.menuAdministrativos = menuAdministrativos;
	}

}