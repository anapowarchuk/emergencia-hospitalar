package controle;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Atendimento;
import visao.Pai;
import visao.JanelaDeConsulta;

public class ControleChamaConsulta implements ActionListener {

	private JanelaDeConsulta j;
	private Atendimento a1;

	public ControleChamaConsulta(JanelaDeConsulta j, Atendimento a1) {
		super();
		this.j = j;
		this.a1 = a1;
		this.j.getButtonChamarProximoPaciente().addActionListener(this);
		this.j.getBtnAtenderPaciente().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de a��o que volta para a janela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();

		}

		// Evento de a��o que chama o pr�ximo atendimento
		if (e.getActionCommand().equals("chama")) {
			// Teste para ver se existem pacientes esperando para a consulta
			if (Pai.p1.estaVazia() && Pai.p2.estaVazia() && Pai.p3.estaVazia() && Pai.p4.estaVazia()
					&& Pai.p5.estaVazia()) {
				JOptionPane.showMessageDialog(j, "N�o existem pacientes esperando para a consulta!");
			} else {
				// Chama o primeiro da fila de acordo com a ordem de prioridades necess�ria
				if (!Pai.p1.estaVazia()) {
					a1 = Pai.p1.topo();

					// Altera os campos de acordo com os dados e prioridade do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					this.j.getFieldPrioridade().setText("1 - EMERG�NCIA");
					this.j.getFieldPrioridade().setBackground(Color.RED);

				} else if (!Pai.p2.estaVazia()) {
					a1 = Pai.p2.topo();

					// Altera os campos de acordo com os dados e prioridade do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					this.j.getFieldPrioridade().setText("2 - MUITO URGENTE");
					this.j.getFieldPrioridade().setBackground(Color.ORANGE);

				}

				else if (!Pai.p3.estaVazia()) {
					a1 = Pai.p3.topo();

					// Altera os campos de acordo com os dados e prioridade do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					this.j.getFieldPrioridade().setText("3 - URGENTE");
					this.j.getFieldPrioridade().setBackground(Color.YELLOW);
				}

				else if (!Pai.p4.estaVazia()) {
					a1 = Pai.p4.topo();

					// Altera os campos de acordo com os dados e prioridade do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					this.j.getFieldPrioridade().setText("4 - POUCO URGENTE");
					this.j.getFieldPrioridade().setBackground(Color.GREEN);

				}

				else if (!Pai.p5.estaVazia()) {
					a1 = Pai.p5.topo();

					// Altera os campos de acordo com os dados e prioridade do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					this.j.getFieldPrioridade().setText("5 - N�O URGENTE");
					this.j.getFieldPrioridade().setBackground(Color.CYAN);
				}
			}
		}

		// Evento de a��o para iniciar a consulta do paciente
		if (e.getActionCommand().equals("atende")) {
			// Verifica se o campo nome est� preenchido
			if (!this.j.getFieldNome().getText().equals("")) {
				try {
					// Chama a janela de consulta e altera os campos de acordo com os dados do
					// paciente
					this.j.getJanelaConsulta(a1).setVisible(true);
					
					if (!Pai.p1.estaVazia()) {
						a1 = Pai.p1.topo();

						// Altera os campos de acordo com os dados e prioridade do paciente
						this.j.getJanelaConsulta(a1).getFieldPaciente().setText(a1.getPaciente().getNome());
						this.j.getJanelaConsulta(a1).getFieldCPF().setText(a1.getPaciente().getCpf());
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setText("1 - EMERG�NCIA");
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setBackground(Color.RED);

					} else if (!Pai.p2.estaVazia()) {
						a1 = Pai.p2.topo();

						// Altera os campos de acordo com os dados e prioridade do paciente
						this.j.getJanelaConsulta(a1).getFieldPaciente().setText(a1.getPaciente().getNome());
						this.j.getJanelaConsulta(a1).getFieldCPF().setText(a1.getPaciente().getCpf());
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setText("2 - MUITO URGENTE");
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setBackground(Color.ORANGE);

					}

					else if (!Pai.p3.estaVazia()) {
						a1 = Pai.p3.topo();

						// Altera os campos de acordo com os dados e prioridade do paciente
						this.j.getJanelaConsulta(a1).getFieldPaciente().setText(a1.getPaciente().getNome());
						this.j.getJanelaConsulta(a1).getFieldCPF().setText(a1.getPaciente().getCpf());
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setText("3 - URGENTE");
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setBackground(Color.YELLOW);
					}

					else if (!Pai.p4.estaVazia()) {
						a1 = Pai.p4.topo();

						// Altera os campos de acordo com os dados e prioridade do paciente
						this.j.getJanelaConsulta(a1).getFieldPaciente().setText(a1.getPaciente().getNome());
						this.j.getJanelaConsulta(a1).getFieldCPF().setText(a1.getPaciente().getCpf());
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setText("4 - POUCO URGENTE");
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setBackground(Color.GREEN);

					}

					else if (!Pai.p5.estaVazia()) {
						a1 = Pai.p5.topo();

						// Altera os campos de acordo com os dados e prioridade do paciente
						this.j.getJanelaConsulta(a1).getFieldPaciente().setText(a1.getPaciente().getNome());
						this.j.getJanelaConsulta(a1).getFieldCPF().setText(a1.getPaciente().getCpf());
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setText("5 - N�O URGENTE");
						this.j.getJanelaConsulta(a1).getFieldPrioridade().setBackground(Color.CYAN);
					}

					this.j.getJanelaConsulta(a1).getFieldFreqCard()
							.setText(Double.toString(a1.getTriagem().getFrequenciaCardiaca()));
					this.j.getJanelaConsulta(a1).getFieldFreqResp()
							.setText(Double.toString(a1.getTriagem().getFrequenciaRespiratoria()));
					this.j.getJanelaConsulta(a1).getFieldTemperaturaCorporal()
							.setText(Double.toString(a1.getTriagem().getTemperaturaCorporal()));
					this.j.getJanelaConsulta(a1).getFieldOximetria()
							.setText(Double.toString(a1.getTriagem().getOximetriaDePulso()));
					this.j.getJanelaConsulta(a1).getFieldFluxoResp()
							.setText(Double.toString(a1.getTriagem().getIpfr()));

					if (a1.getTriagem().isEntubado()) {
						this.j.getJanelaConsulta(a1).getFieldEntubado().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldEntubado().setText("N�O");
					}

					if (a1.getTriagem().isComApneia()) {
						this.j.getJanelaConsulta(a1).getFieldComApneia().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldComApneia().setText("N�O");
					}

					if (a1.getTriagem().isSemPulso()) {
						this.j.getJanelaConsulta(a1).getFieldSemPulso().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldSemPulso().setText("N�O");
					}

					if (a1.getTriagem().isSemReacao()) {
						this.j.getJanelaConsulta(a1).getFieldSemReacao().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldSemReacao().setText("N�O");
					}

					if (a1.getTriagem().isDor()) {
						this.j.getJanelaConsulta(a1).getFieldDorAguda().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldDorAguda().setText("N�O");
					}

					if (a1.getTriagem().isSofrimento()) {
						this.j.getJanelaConsulta(a1).getFieldSofrimentoAgudo().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldSofrimentoAgudo().setText("N�O");
					}

					this.j.getJanelaConsulta(a1).getFieldSituacao().setText(a1.getTriagem().getSituacao());

					if (a1.getTriagem().isInjecoes()) {
						this.j.getJanelaConsulta(a1).getFieldInjecoes().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldInjecoes().setText("N�O");
					}

					if (a1.getTriagem().isRaioX()) {
						this.j.getJanelaConsulta(a1).getFieldRaioX().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldRaioX().setText("N�O");
					}

					if (a1.getTriagem().isTestesLab()) {
						this.j.getJanelaConsulta(a1).getFieldTL().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldTL().setText("N�O");
					}

					if (a1.getTriagem().isEg()) {
						this.j.getJanelaConsulta(a1).getFieldEg().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldEg().setText("N�O");
					}

					if (a1.getTriagem().isSituacaoDeRisco()) {
						this.j.getJanelaConsulta(a1).getFieldAltoRisco().setText("SIM");
					} else {
						this.j.getJanelaConsulta(a1).getFieldAltoRisco().setText("N�O");
					}

					// Chama o controle da janela de consulta
					ControleConsulta ConsCon = new ControleConsulta(this.j.getJanelaConsulta(a1), a1);

				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(j, "N�o existe um paciente selecionado!");
				}

				this.j.limpaConsulta();
			} else {
				JOptionPane.showMessageDialog(j, "N�o existe um paciente selecionado!");
			}
		}

	}

	// M�todo que libera a mem�ria que janela est� usando, quando a janela � fechada
	// n�o continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}