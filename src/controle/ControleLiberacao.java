package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import visao.Pai;
import visao.JanelaLiberacaoPaciente;

public class ControleLiberacao implements ActionListener {

	private JanelaLiberacaoPaciente j;
	private Atendimento a1;

	public ControleLiberacao(JanelaLiberacaoPaciente j, Atendimento a1) {
		super();
		this.j = j;
		this.a1 = a1;
		this.j.getButtonPesquisar().addActionListener(this);
		this.j.getButtonLiberarPaciente().addActionListener(this);
		this.j.getButtonLimpar().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Evento de ação para voltar para a tela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}
		
		//Evento de ação para pesquisar o paciente
		if (e.getActionCommand().equals("pesquisar")) {
			String cpf = this.j.getFieldCPF().getText().substring(0,3);
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(4,7));
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(8,11));
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(12));
			
			try {
				if (this.j.getFieldCPF().getText().equals("  .  .  -  ")) {
					JOptionPane.showMessageDialog(j, "O preenchimento do campo CPF é obrigatório!");
				}
				else {
					a1 = Pai.listaAtendE.buscarCPF(cpf);
					
					//Altera os campos para os dados do paciente
					this.j.getFieldNome().setText(a1.getPaciente().getNome());
					this.j.getFieldCPF2().setText(a1.getPaciente().getCpf());
					this.j.getFieldDataNasc().setText(a1.getPaciente().getDataNasc());
					
					//Formata o horário
					if (a1.getHoraChegada() < 10) {
						this.j.getFieldHorasChegada().setText("0"+Integer.toString(a1.getHoraChegada()));
					}
					else {
						this.j.getFieldHorasChegada().setText(Integer.toString(a1.getHoraChegada()));
					}
					
					if (a1.getMinutoChegada() < 10) {
						this.j.getFieldMinutosChegada().setText("0"+Integer.toString(a1.getMinutoChegada()));
					}
					else {
						this.j.getFieldMinutosChegada().setText(Integer.toString(a1.getMinutoChegada()));
					}
					
					if (a1.getHoraAtendimento() < 10) {
						this.j.getFieldHorasAtendimento().setText("0"+Integer.toString(a1.getHoraAtendimento()));
					}
					else {
						this.j.getFieldHorasAtendimento().setText(Integer.toString(a1.getHoraAtendimento()));
					}
					if (a1.getMinutoAtendimento() < 10) {
						this.j.getFieldMinutosAtendimento().setText("0"+Integer.toString(a1.getMinutoAtendimento()));
					}
					else {
						this.j.getFieldMinutosAtendimento().setText(Integer.toString(a1.getMinutoAtendimento()));
					}
				}
			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j, "Paciente não encontrado nos registros, verifique o CPF digitado!");
			}
		}
		
		//Evento de ação para liberar o paciente
		if (e.getActionCommand().equals("libera")) {
			try {
				int hora = Integer.parseInt(this.j.getFieldHorasLiberacao().getText());
				int min = Integer.parseInt(this.j.getFieldMinutosLiberacao().getText());
				
				if (hora < 0 || hora > 23) {
					JOptionPane.showMessageDialog(j, "Hora inválida!!");
				} else if (min < 0 || min > 59) {
					JOptionPane.showMessageDialog(j, "Minuto inválido!!");
				} else {
					//Altera a hora da saída na classe atenidmento
					a1.setHoraSaida(hora);
					a1.setMinutoSaida(min);
					
					JOptionPane.showMessageDialog(j, "Paciente liberado com sucesso!");
					this.j.limparLiberacao();
				}
				
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(j, "Você só pode inserir números nos campos de hora e minutos");
			}
			
		}
		
		//Evento de ação para limpar a janela de liberação
		if (e.getActionCommand().equals("limpar")) {
			this.j.limparLiberacao();
		}

	}

	//Método que libera a memória que janela está usando, quando a janela é fechada não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub
		
	}

}