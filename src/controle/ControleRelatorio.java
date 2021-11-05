package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import visao.JanelaRelatorioTempo;
import visao.Pai;

public class ControleRelatorio implements ActionListener {
	private JanelaRelatorioTempo j;
	private Atendimento a;

	public ControleRelatorio(JanelaRelatorioTempo j, Atendimento a) {
		this.j = j;
		this.a = a;

		this.j.getButtonAtendimento().addActionListener(this);
		this.j.getButtonAtendimentoPaciente().addActionListener(this);
		this.j.getButtonAtendimentoPorFila().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}

		if (e.getActionCommand().equals("buttonAten")) {
			try {
				this.j.getTextArea().setText("");
				this.j.getTextArea().setText("ESPERA PARA ATENDIMENTO\n" + Pai.listaAtendE.tempoMedioDeEspera());
				this.j.getTextArea().setVisible(true);
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

		if (e.getActionCommand().equalsIgnoreCase("buttonAtenP")) {
			try {
				this.j.getTextArea().setText("");
				this.j.getTextArea().setText(
						"ESPERA PARA ATENDIMENTO POR PACIENTE\n" + Pai.listaAtendE.tempoMedioDeAtendimentoPaciente());
				this.j.getTextArea().setVisible(true);
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

		if (e.getActionCommand().equalsIgnoreCase("ButtonAtenF")) {
			try {
				this.j.getTextArea().setText("");
				this.j.getTextArea()
						.setText("TEMPO DE ESPERA POR FILA DE PRIORIDADE " + "\n Fila de Prioridade 1: "
								+ Pai.listaAtendE.tempoMedioDeAtendimentoFila(1) + "\n Fila de Prioridade 2: "
								+ Pai.listaAtendE.tempoMedioDeAtendimentoFila(2) + "\n Fila de Prioridade 3: "
								+ Pai.listaAtendE.tempoMedioDeAtendimentoFila(3) + "\n Fila de Prioridade 4: "
								+ Pai.listaAtendE.tempoMedioDeAtendimentoFila(4) + "\n Fila de Prioridade 5: "
								+ Pai.listaAtendE.tempoMedioDeAtendimentoFila(5));
				this.j.getTextArea().setVisible(true);
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Erro");
			}
		}

	}

	private void dispose() {
		// TODO Auto-generated method stub

	}

}
