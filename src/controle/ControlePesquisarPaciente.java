package controle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Paciente;
import visao.JanelaPesquisarPaciente;
import visao.Pai;

public class ControlePesquisarPaciente implements ActionListener {

	private JanelaPesquisarPaciente j;
	private Paciente p;

	public ControlePesquisarPaciente(JanelaPesquisarPaciente j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getButtonLimpar().addActionListener(this);
		this.j.getButtonPesquisar().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação para voltar para a janela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}

		// Evento de ação para limpar a janela de pesquisa
		if (e.getActionCommand().equals("Limpar")) {
			this.j.limparPesquisa();
		}

		// Evento de ação para pesquisar o paciente
		if (e.getActionCommand().equals("Pesquisar")) {
			try {
				String cpf = this.j.getFieldCPF().getText().substring(0, 3);
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(4, 7));
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(8, 11));
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(12));

				if (this.j.getFieldCPF().getText().equals("   .   .   -  ")) {
					JOptionPane.showMessageDialog(j, "O CPF precisa ter 11 dígitos!");
				} else {
					Paciente p1 = Pai.listaP.buscarCpf(cpf);
					// Altera os campos para os dados do paciente
					this.j.getFieldNome().setText(p1.getNome());
					this.j.getFieldDataNasc().setText(p1.getDataNasc());
					this.j.getFieldCPF2().setText(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
							+ cpf.substring(6, 9) + "-" + cpf.substring(9));
				}

			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Paciente não encontrado nos registros!");
			}

		}

	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}