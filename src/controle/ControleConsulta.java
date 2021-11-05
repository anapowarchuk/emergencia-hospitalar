package controle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import visao.JanelaDeConsulta2;
import visao.Pai;

public class ControleConsulta implements ActionListener {

	private JanelaDeConsulta2 j;
	private Atendimento a1;

	public ControleConsulta(JanelaDeConsulta2 j, Atendimento a1) {
		super();
		this.j = j;
		this.a1 = a1;
		this.j.getBtnFinalizarConsulta().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação para finalizar a consulta
		if (e.getActionCommand().equals("finaliza")) {
			// Teste para ver se o parecer médico está preenchido
			if (this.j.getTextAreaParecerMedico().getText() == null
					|| this.j.getTextAreaParecerMedico().getText().trim().equals("")) {
				JOptionPane.showMessageDialog(j, "O parecer médico deve ser preenchido!");
			}

			try {
				
				// Pega a hora de atendimento
				a1.setHoraAtendimento(Integer.parseInt(this.j.getFieldHoraAtendimento().getText()));
				a1.setMinutoAtendimento(Integer.parseInt(this.j.getFieldMinutos().getText()));
				a1.setParecer(this.j.getTextAreaParecerMedico().getText());
				// Adiciona o atendimento na listas de atendimentos encerrados
				Pai.listaAtendE.adicionarInicio(a1);

				// Remove da fila de prioridade
				if (a1.getPrioridade() == 1) {
					Pai.p1.remover();
				} else if (a1.getPrioridade() == 2) {
					Pai.p2.remover();
				} else if (a1.getPrioridade() == 3) {
					Pai.p3.remover();
				} else if (a1.getPrioridade() == 4) {
					Pai.p4.remover();
				} else if (a1.getPrioridade() == 5) {
					Pai.p5.remover();
				}

				JOptionPane.showMessageDialog(j, "Consulta finalizada com sucesso!");
				this.j.setVisible(false);
				dispose();
				this.j.limparConsulta();

			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(j, "Verifique o formato da hora!");
			}
		}
	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}