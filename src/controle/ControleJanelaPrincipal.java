package controle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import modelo.Atendimento;
import modelo.FilaAtendimento;
import modelo.ListaAtendimentosEncerrados;
import modelo.ListaPacientes;
import modelo.Paciente;
import visao.JanelaCadastrarPaciente;
import visao.JanelaPrincipal;

public class ControleJanelaPrincipal implements ActionListener {

	private JanelaPrincipal j;
	private Paciente p;
	private Atendimento a;
	private Atendimento a2;

	public ControleJanelaPrincipal(JanelaPrincipal j, Paciente p, Atendimento a) {
		super();
		this.j = j;
		this.p = p;
		this.a = a;

		this.j.getButtonCadastrarPaciente().addActionListener(this);
		this.j.getButtonBusP().addActionListener(this);
		this.j.getButtonTriagem().addActionListener(this);
		this.j.getButtonConsulta().addActionListener(this);
		this.j.getButtonAtenP().addActionListener(this);
		this.j.getButtonLiberacao().addActionListener(this);

		this.j.getMenuAdministrativos().addActionListener(this);
		this.j.getMenuFichasP().addActionListener(this);
		this.j.getMenuSair().addActionListener(this);
	}

	public ControleJanelaPrincipal() {
		super();

		this.j.getButtonCadastrarPaciente().addActionListener(this);
		this.j.getButtonBusP().addActionListener(this);
		this.j.getButtonTriagem().addActionListener(this);
		this.j.getButtonConsulta().addActionListener(this);
		this.j.getButtonAtenP().addActionListener(this);
		this.j.getButtonLiberacao().addActionListener(this);

		this.j.getMenuAdministrativos().addActionListener(this);
		this.j.getMenuFichasP().addActionListener(this);
		this.j.getMenuSair().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação para a janela de cadastro
		if (e.getActionCommand().equals("Cadastrar Paciente")) {
			this.j.getCadPac().setVisible(true);
			ControleCadastroPaciente cadCon = new ControleCadastroPaciente(this.j.getCadPac(), p);

		}

		// Evento de ação para a janela de buscar paciente
		if (e.getActionCommand().equals("Buscar Paciente")) {
			this.j.getBusPac().setVisible(true);
			ControlePesquisarPaciente busCon = new ControlePesquisarPaciente(this.j.getBusPac(), p);
		}

		// Evento de ação para a janela triagem
		if (e.getActionCommand().equals("Triagem")) {
			this.j.getChamaTriagem().setVisible(true);
			// Chama o controle para a janela de triagem
			ControleChamaTriagem chamaTriCon = new ControleChamaTriagem(this.j.getChamaTriagem(), a, a2, p);

		}

		// Evento de ação para a janela consulta
		if (e.getActionCommand().equals("Consulta")) {
			this.j.getConsulta().setVisible(true);
			// Chama o controle para a janela de consulta
			ControleChamaConsulta chamaCon = new ControleChamaConsulta(this.j.getConsulta(), a);
		}

		// Evento de ação para a janela de iniciar atendimento
		if (e.getActionCommand().equals("Atender Paciente")) {
			this.j.getAtendimento().setVisible(true);
			// Chama para o controle para a janela de atender paciente
			ControleIniciarAtendimento atenCon = new ControleIniciarAtendimento(this.j.getAtendimento(), a, p);
		}

		// Evento de ação para a janela de liberação do paciente
		if (e.getActionCommand().equals("Liberação")) {
			this.j.getLiberarP().setVisible(true);
			// Chama para o controle para a janela de liberação
			ControleLiberacao libCon = new ControleLiberacao(this.j.getLiberarP(), a);
		}

		// Evento de ação para a janela de relatório
		if (e.getActionCommand().equals("menuAdm"))

		{
			this.j.getRelatorioTempo().setVisible(true);
			// Chama para o controle para a janela de Relatorio
			ControleRelatorio relCon = new ControleRelatorio(this.j.getRelatorioTempo(), a);
		}

		// Evento de ação para a janela de fichas dos pacientes
		if (e.getActionCommand().equals("menuFP")) {
			this.j.getFichaP().setVisible(true);
			//Chama para o controle para a janela de fichas dos pacientes
			ControleFicha fichaCon = new ControleFicha(this.j.getFichaP(), a);
		}

		// Evento de ação para sair
		if (e.getActionCommand().equals("menuSair")) {
			System.exit(0);
		}

	}

}