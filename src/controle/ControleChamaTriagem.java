package controle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import modelo.Paciente;
import controle.ControleTriagem;
import visao.JanelaFilaTriagem;
import visao.JanelaTriagem;
import visao.Pai;

public class ControleChamaTriagem implements ActionListener {

	private JanelaFilaTriagem j;
	private Atendimento a1;
	private Atendimento a2;
	private Paciente p1;

	public ControleChamaTriagem(JanelaFilaTriagem j, Atendimento a1, Atendimento a2, Paciente p1) {
		super();
		this.j = j;
		this.a1 = a1;
		this.a2 = a2;
		this.p1 = p1;

		this.j.getButtonVoltar().addActionListener(this);
		this.j.getButtonChamarProximoPaciente().addActionListener(this);
		this.j.getButtonOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação para voltar para a janela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}

		// Evento de ação que chama o próximo paciente
		if (e.getActionCommand().equals("Chamar Proximo Paciente")) {
			try {
				// Retorna o primeiro da lista de atendimentos
				a1 = Pai.atendimentos.topo();
				// Altera os campos de acordo os dados do paciente
				this.j.getFieldNome().setText(a1.getPaciente().getNome());
				this.j.getFieldCPF().setText(a1.getPaciente().getCpf());
				this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
				this.j.getFieldSenha().setText(Integer.toString(a1.getSenha()));

			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Não existem mais pacientes esperando para a triagem!");
			}
		}

		// Evento de ação para iniciar a triagem
		if (e.getActionCommand().equals("Ok")) {
			// Teste para ver se o campo nome está preenchido
			if (this.j.getFieldNome().getText() == "" || this.j.getFieldNome().getText() == null) {
				JOptionPane.showMessageDialog(j, "Não existe nenhum paciente selecionado!");
			} else {
				try {
					// Retorna o primeiro da lista de atendimentos e passa para a janela de triagem
					a2 = Pai.atendimentos.topo();
					this.j.getTriagem(a2).setVisible(true);
					this.j.getTriagem(a2).getFieldNome().setText(a2.getPaciente().getNome());
					this.j.getTriagem(a2).getFieldCPF().setText(a2.getPaciente().getCpf());
					ControleTriagem cT = new ControleTriagem(this.j.getTriagem(a2), a2, p1);
				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(j, "Não existe um paciente selecionado!");
				}

				this.j.limpar();
			}
		}

	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}