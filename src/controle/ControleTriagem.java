package controle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import modelo.Paciente;
import visao.JanelaTriagem;
import visao.Pai;
import modelo.Triagem;

public class ControleTriagem implements ActionListener {

	private JanelaTriagem j;
	private Atendimento a1;
	private Paciente p1;

	public ControleTriagem(JanelaTriagem j, Atendimento a1, Paciente p1) {
		super();
		this.j = j;
		this.a1 = a1;
		this.p1 = p1;
		this.j.getButtonFinalizarTriagem().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação para finalizar a triagem
		if (e.getActionCommand().equalsIgnoreCase("Finalizar Triagem")) {
			// Verifica se os checkBox estão selecionados
			if (this.j.getChckbxComApneia().isSelected() || this.j.getChckbxSemReao().isSelected()
					|| this.j.getChckbxEntubado().isSelected() || this.j.getChckbxSemPulso().isSelected()
					|| this.j.getRdbtnSituaçãoDeAltoRiscoSim().isSelected()) {
				Pai.p1.adicionar(a1);
				a1.setPrioridade(1);
			}
			try {
				// Guarda em variáveis o valor dos atributos
				double FR = Double.parseDouble(this.j.getFieldFrequenciarRespiratoria().getText());
				double FC = Double.parseDouble(this.j.getFieldFrequenciaCardiaca().getText());
				double TC = Double.parseDouble(this.j.getFieldTempCorporal().getText());
				double OX = Double.parseDouble(this.j.getFieldOximetria().getText());
				double IPFR = Double.parseDouble(this.j.getFieldFluxoResp().getText());

				// Contador de exames
				int contExames = 0;
				if (this.j.getCheckBoxEG().isSelected()) {
					contExames++;
				}
				if (this.j.getCheckBoxInjecoes().isSelected()) {
					contExames++;
				}
				if (this.j.getCheckBoxRaioX().isSelected()) {
					contExames++;
				}
				if (this.j.getCheckBoxTesteLaboratoriais().isSelected()) {
					contExames++;
				}

				// Verifica as situações e adiciona nas respectivas filas de triagem
				if (this.j.getRdbtnSituaçãoDeAltoRiscoSim().isSelected() || this.j.getRdbtnConfuso().isSelected()
						|| this.j.getRdbtnLetargico().isSelected() || this.j.getRdbtnDesorientado().isSelected()
						|| this.j.getRdbtnSimDorAguda().isSelected()
						|| this.j.getRdbtnSofrimentoAgudoSim().isSelected()) {
					Pai.p2.adicionar(a1);
					a1.setPrioridade(2);

				} else if (contExames == 0) {
					Pai.p5.adicionar(a1);
					a1.setPrioridade(5);
				} else if (contExames == 1) {
					Pai.p4.adicionar(a1);
					a1.setPrioridade(4);
				} else {
					if (FC > 90 || FR > 20 || TC < 36 || TC > 38 || OX < 90 || IPFR < 200) {
						Pai.p2.adicionar(a1);
						a1.setPrioridade(2);
					} else {
						Pai.p3.adicionar(a1);
						a1.setPrioridade(3);
					}
				}

				// Define as situações
				String situ = null;
				if (this.j.getRdbtnConfuso().isSelected()) {
					situ = this.j.getRdbtnConfuso().getText();
				} else if (this.j.getRdbtnDesorientado().isSelected()) {
					situ = this.j.getRdbtnDesorientado().getText();
				} else if (this.j.getRdbtnLetargico().isSelected()) {
					situ = this.j.getRdbtnLetargico().getText();
				} else if (this.j.getRdbtnConsciente().isSelected()) {
					situ = this.j.getRdbtnConsciente().getText();
				}

				if (TC < 0 || FR < 0 || FC < 0 || OX < 0 || IPFR < 0) {
					JOptionPane.showMessageDialog(j, "Os valores inseridos não podem ser negativos!");
				}

				if (this.j.getRisco().isSelected(null) || this.j.getSituacao().isSelected(null)
						|| this.j.getDor().isSelected(null) || this.j.getSofrimento().isSelected(null)) {
					JOptionPane.showMessageDialog(null,
							"Atenção! Os seguintes campos possuem preenchimento obrigatório: Situação, Dor, Sofrimento e Risco");
				} else {
					// Inserindo os dados da triagem no objeto atendimento
					Triagem t1 = new Triagem(TC, this.j.getRdbtnSituaçãoDeAltoRiscoSim().isSelected(),
							this.j.getChckbxEntubado().isSelected(), this.j.getChckbxComApneia().isSelected(),
							this.j.getChckbxSemPulso().isSelected(), this.j.getChckbxSemReao().isSelected(), situ,
							this.j.getRdbtnSimDorAguda().isSelected(), this.j.getRdbtnSofrimentoAgudoSim().isSelected(),
							this.j.getCheckBoxRaioX().isSelected(), this.j.getCheckBoxInjecoes().isSelected(),
							this.j.getCheckBoxTesteLaboratoriais().isSelected(), this.j.getCheckBoxEG().isSelected(),
							FC, FR, OX, IPFR, contExames);

					a1.setTriagem(t1);
					JOptionPane.showMessageDialog(j, "Triagem realizada com sucesso!");

					this.j.limparTriagem();

					this.j.setVisible(false);
					dispose();
				}
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(j, "Verifique o formato das informações digitadas!");
			}
			Pai.atendimentos.remover();
		}

	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}