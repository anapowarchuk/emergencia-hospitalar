package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import modelo.Atendimento;
import modelo.ListaPacientes;
import visao.JanelaFichaPaciente;
import visao.Pai;

public class ControleFicha implements ActionListener {
	private Atendimento t;
	private JanelaFichaPaciente j;

	public ControleFicha(JanelaFichaPaciente j, Atendimento t) {
		this.t = t;
		this.j = j;

		this.j.getButtonListaDePacientes().addActionListener(this);
		;
		this.j.getButtonFilaDeAtendimentos().addActionListener(this);
		this.j.getButtonPrioridade1().addActionListener(this);
		this.j.getButtonPrioridade2().addActionListener(this);
		this.j.getButtonPrioridade3().addActionListener(this);
		this.j.getButtonPrioridade4().addActionListener(this);
		this.j.getButtonAtendimentosEncerrados().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// Evento de ação para imprirmir a Lista de Pacientes
		if (e.getActionCommand().equalsIgnoreCase("Lista de Pacientes")) {
			try {
				this.j.getTextArea().setText(Pai.listaP.imprimirPacientes());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

		// Evento de ação para imprirmir a Fila de Atendimentos
		if (e.getActionCommand().equalsIgnoreCase("Fila de Atendimentos")) {
			try {
				this.j.getTextArea().setText(Pai.atendimentos.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

		// Evento de ação para imprirmir a Fila de Prioridade 1
		if (e.getActionCommand().equalsIgnoreCase("Prioridade 1")) {
			try {
				this.j.getTextArea().setText(Pai.p1.imprimirAtendimentos());

			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

		// Evento de ação para imprirmir a Fila de Prioridade 2
		if (e.getActionCommand().equalsIgnoreCase("Prioridade 2")) {
			try {
				this.j.getTextArea().setText(Pai.p2.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}
		// Evento de ação para imprirmir a Fila de Prioridade 3
		if (e.getActionCommand().equalsIgnoreCase("Prioridade 3")) {
			try {
				this.j.getTextArea().setText(Pai.p3.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}
		// Evento de ação para imprirmir a Fila de Prioridade 4
		if (e.getActionCommand().equalsIgnoreCase("Prioridade 4")) {
			try {
				this.j.getTextArea().setText(Pai.p4.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}
		// Evento de ação para imprirmir a Fila de Prioridade 5
		if (e.getActionCommand().equalsIgnoreCase("Prioridade 5")) {
			try {
				this.j.getTextArea().setText(Pai.p5.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}
		// Evento de ação para imprirmir os Atendimentos Encerrados
		if (e.getActionCommand().equalsIgnoreCase("Atendimentos Encerrados")) {
			try {
				this.j.getTextArea().setText(Pai.listaAtendE.imprimirAtendimentos());
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}
}